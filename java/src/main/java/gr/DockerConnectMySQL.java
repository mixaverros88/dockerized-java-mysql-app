package gr;

import java.sql.*;

public class DockerConnectMySQL {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://mysqlapp/company?useSSL=true";

    static final String USER = "root";
    static final String PASS = "supersecret";

    public StringBuilder getValuesFromDatabase() {
        Connection conn = null;
        Statement stmt = null;
        StringBuilder response = new StringBuilder();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            stmt = conn.createStatement();
            String sql;
            sql = "SELECT first_name, last_name, department, email FROM employees";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                String first = rs.getString("first_name");
                String last = rs.getString("last_name");
                String address = rs.getString("department");
                String city = rs.getString("email");

                response.append(" First: " + first + "\n");
                response.append(" Last: " + last + "\n");
                response.append(" Address: " + address + "\n");
                response.append(" City: " + city + "\n");
                System.out.println(", First: " + first);
                System.out.println(", Last: " + last);
                System.out.println(", Address: " + address);
                System.out.println(", City: " + city);
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }

        return response;
    }
}