package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    //데이터베이스를 연결하는 것이 목적
    //소켓 객체를 만들어 준다.
    public static Connection getInstance(){
        String username = "root";
        String password = "1234";
        String url = "jdbc:mariadb://localhost:3306/cosdb";

        //프로토콜이 적용된 소켓(일반 소켓 아님)
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("db connect success");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
