package model;

//DB에 Select한 데이터를 담기 위한 오브젝트

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.sql.Timestamp;

@ToString
@AllArgsConstructor
@Getter
public class Account {
    private int number;
    private String password;
    private int balance;

    // javq.sql의 timestamp 쓰기
    //
    private Timestamp createdAt;

}
