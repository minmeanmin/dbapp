import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankApp {
    public static void main(String[] args) {
        //소켓을 통해 DB연결
        Connection conn = DBConnection.getInstance();

        //버퍼 달기
        try { //문법 오류가 날 수도 있기 때문에
            String insert = "insert into account_tb(password, balance, created_at) values(?, ?, now())";
            String delete = "delete from account_tb where number = ?";
            String update = "update account_tb set balance = balance + ? where number = ?";
            PreparedStatement pstmt = conn.prepareStatement(update);

            //쿼리 완성시키기(? 자리에 값 넣기)
            //pstmt.setString(1, "1234");
            //pstmt.setINT(2, 1000);

            //pstmt.setInt(1, 4);

            pstmt.setInt(1, 4000);
            pstmt.setInt(2, 1);
            int num = pstmt.executeUpdate(); //flush
            System.out.println(num);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
