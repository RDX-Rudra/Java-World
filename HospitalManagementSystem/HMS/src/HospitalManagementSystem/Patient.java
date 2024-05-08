package HospitalManagementSystem;
import java.util.*;
import java.sql.*;

public class Patient {
    private Connection con;
    private Scanner sc;

    public Patient(Connection con, Scanner sc){
        this.con = con;
        this.sc = sc;
    }

    public void addPatient(){
        System.out.print("Enter patient Name: ");
        String name = sc.next();
        System.out.print("Enter patient age: ");
        int age = sc.nextInt();
        System.out.print("Enter patient Gender: ");
        String gender = sc.next();

        try{
            String query = "INSERT INTO patients(name, age, gender) VALUES(?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, gender);
            int affectedRows = preparedStatement.executeUpdate();
            if(affectedRows > 0){
                System.out.println("Patients Data Entries successfully");
            }
            else{
                System.out.println("patient Data Entry failed!!!");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void viewPatients(){
        String query = "select * from patients";
        try{
            PreparedStatement preparedStatement = con.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Patients: ");
            System.out.println("+----+---------------------+------+--------+");
            System.out.println("| id |   Name              |  Age | Gender |");
            System.out.println("+----+---------------------+------+--------+");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                System.out.printf("|%-4s|%-2s|%-6s|%-8s|\n", id, name, age, gender);
                System.out.println("+----+---------------------+------+--------+");

            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public boolean getPatientById(int id){
        String query = "SELECT * FROM patients WHERE id = ?";
        try{
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return true;
            }
            else{
                return false;
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
