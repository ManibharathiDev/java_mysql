import java.sql.*;

public class StudentDB {

    public static void main(String[] args){

        // Driver

        // Connection Establishment

        // Statement

        // Execution

        String URL = "jdbc:mysql://localhost:3306/db_college";

        String USER = "root";

        String PASSWORD = "manibharathi";

        // Connection Establishment

        try {
            Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Connection is established");


            //Connection connection = ConnectionDB.getConnection();


            //Read table

            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM tbl_student";

            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("Executing....");

            System.out.print("Roll Number  |   Name                      |   Address        |       Age");
            System.out.println("");

            while(resultSet.next()){

                //System.out.println("Roll Number : "+ resultSet.getInt(1));
                System.out.print(resultSet.getInt("rollNumber")+" |");

                System.out.print(resultSet.getString("studName")+"     |");

                System.out.print(resultSet.getString("studAddress")+"     |");

                System.out.print("Age :"+resultSet.getInt("studAge"));

                System.out.println("");

            }

            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }

}
