package database;
import java.sql.*;

public class DAO
{

private static String username="SHUCHITA";
private static String password="gupta8868";
private static String driver="oracle.jdbc.driver.OracleDriver";
private static String url="jdbc:oracle:thin:@localhost:1521:XE";

private static Connection con=null;

public static Connection getConnection()throws Exception{


Class.forName(driver);
Connection con=DriverManager.getConnection(url,username,password);


return con;
}


}