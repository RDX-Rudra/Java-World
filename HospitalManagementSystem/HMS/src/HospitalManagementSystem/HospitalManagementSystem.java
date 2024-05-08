package HospitalManagementSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class HospitalManagementSystem {
    private static final String url = "jdbc:mysql://localhost:3306/hospital";
    private static final String username = "root";
    private static final String password = "Rd@2026das";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            Patient patient = new Patient(connection, sc);
            Doctor doctor = new Doctor(connection);
            while(true){
                System.out.println("HOSPITAL MANAGEMENT SYSTEM");
                System.out.println("1. Add patient");
                System.out.println("2. view Patient");
                System.out.println("3. view Doctor");
                System.out.println("4. Book Appointment");
                System.out.println("5. view Appointment");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        patient.addPatient();
                        System.out.println();
                        break;
                    case 2:
                        patient.viewPatients();
                        System.out.println();
                        break;
                    case 3:
                        doctor.viewdoctors();
                        System.out.println();
                        break;
                    case 4:
                        bookAppointments(patient, doctor, connection, sc);
                        System.out.println();
                        break;
                    case 5:
                        viewAppointments(connection);
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("enter va;id choice");
                        break;
                }
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        sc.close();
    }

    public static void bookAppointments(Patient patient, Doctor doctor, Connection connection, Scanner sc){
        System.out.print("Enter patient id: ");
        int patientId = sc.nextInt();
        System.out.print("Enter Doctor id: ");
        int doctorId = sc.nextInt();
        System.out.println("Enter appointment date (YYYY-MM-DD): ");
        String appoinDate = sc.next();
        if (patient.getPatientById(patientId) && doctor.getdoctorById(doctorId)) {
            if(checkDoctorAvailable(doctorId, appoinDate, connection)){
                String appointmentQuery = "INSERT INTO appointments(patient_id, doctort_id, appointment_date) VALUES(?, ?, ?)";
                try{
                    PreparedStatement preparedStatement = connection.prepareStatement(appointmentQuery);
                    preparedStatement.setInt(1, patientId);
                    preparedStatement.setInt(2, doctorId);
                    preparedStatement.setString(3, appoinDate);
                    int affectedRows = preparedStatement.executeUpdate();
                    if(affectedRows>0){
                        System.out.println("appointment done");
                    }
                    else{
                        System.out.println("Appointment date full!!, try next day");
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
            else{
                System.out.println("Doctor is not available on that day");
            }
        }
        else{
            System.out.println("either patient or doctor id incorrect");
        }
    }

    public static boolean checkDoctorAvailable(int doctorId, String date, Connection connection){
        String query ="SELECT COUNT(*) FROM appointments WHERE doctort_id = ? AND appointment_date = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, doctorId);
            preparedStatement.setString(2, date);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int count = resultSet.getInt(1);
                if(count < 10 ){
                    return true;
                } else {
                    return false;
                }
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return false; // Added this line to handle compilation error due to missing return statement
    }
    

    public static void viewAppointments(Connection connection){
        String query = "select * from appointments";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("appointments: ");
            System.out.println("+----+---------------+--------------+--------+");
            System.out.println("| id | patient's id  |  Doctor's id | date |");
            System.out.println("+----+---------------+--------------+--------+");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int patientId = resultSet.getInt("patient_id");
                int doctorId = resultSet.getInt("doctort_id");
                String date = resultSet.getString("appointment_date");
                System.out.printf("|%-4s|%-15s|%-14s|%-8s|\n", id, patientId, doctorId, date);
                System.out.println("+----+---------------+--------------+--------+");

            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
