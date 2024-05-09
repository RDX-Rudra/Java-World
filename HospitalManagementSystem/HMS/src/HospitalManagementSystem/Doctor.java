package HospitalManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Doctor {
    private Connection con;

    public Doctor(Connection con){
        this.con = con;
    }

    public void viewdoctors(){
        String query = "select * from doctor";
        try{
            PreparedStatement preparedStatement = con.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("doctors: ");
            System.out.println("+----+---------------------+------------------+");
            System.out.println("| id |   Name              |  specilazition   |");
            System.out.println("+----+---------------------+------------------+");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String specialization = resultSet.getString("specialization");
                System.out.printf("|%-4s|%-21s|%-18s|\n", id, name, specialization);
                System.out.println("+----+---------------------+------------------+");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public boolean getdoctorById(int id){
        String query = "SELECT * FROM doctor WHERE id = ?";
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
