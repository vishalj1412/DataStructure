package jdbc.connectivity;

import java.sql.*;

class DataBaseConnectivity {
    public static void main(String args[]) {
        try {
            // step1 load the driver class
            System.out.println("Driver Loading...");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded!!");

            // step2 create the connection object
            System.out.println("Connecting to DB...");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root", "root");
            System.out.println("Connected!!!");

            // step3 create the statement object
            Statement stmt = con.createStatement();
// Insert
            PreparedStatement statement =  con.prepareStatement("select sum(empId) from employee_payroll");
            ResultSet result = statement.executeQuery();
            result.next();
           System.out.println(result.getString(1));
            System.out.println("Insert : Query Executing ...");
            int count = stmt.executeUpdate(
                    "insert into employee_payroll (empId,name,salary,start_date) values(7,'kaivalya',33350,'2008-3-22');");
            System.out.println("Insert : Query Executed!!!\nRows Affected: " + count);

// Select

            // step4 execute querSystem.out.println("Select : Query Executing ...");
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee_payroll");
            System.out.println("Select : Query Executed!!!");

            while (rs.next())
                System.out.println("| " + rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " |");

// Delete
            System.out.println("Delete : Query Executing ...");
            count = stmt.executeUpdate("DELETE  FROM employee_payroll where empId=1");
            System.out.println("Delete : Query Executed!!!\nRows Affected: " + count);

            // step5 close the connection object
            System.out.println("Closing connection...");
            con.close();
            System.out.println("Connection Closed!!!");
            ResultSet show = stmt.executeQuery("SELECT * FROM employee_payroll");
            System.out.println("Select : Query Executed!!!");
while (rs.next())

                System.out.println("| " + show.getInt(1) + " | " + show.getString(2) + " | " + show.getString(3) + " |");

        }

        catch (Exception e) {
            System.out.println(e);
        }

    }
}