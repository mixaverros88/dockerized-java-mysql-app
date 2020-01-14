import java.sql.*;

public class DockerConnectMySQL {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://db:3306/firstdb";

    static final String USER = "user";
    static final String PASS = "pass123";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            stmt = conn.createStatement();
            String sql;
            sql = "SELECT PersonID, FirstName, LastName, Address, City FROM Persons";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                int id  = rs.getInt("PersonID");
                String first = rs.getString("FirstName");
                String last = rs.getString("LastName");
                String address = rs.getString("Address");
                String city = rs.getString("City");

                System.out.println("ID: " + id);
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
    }
}