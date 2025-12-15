package com.wjdqudwls.section01.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application1 {
  public static void main(String[] args) {
    /* Connection
     * - DM 연결 정보를 저장하고
     *   Java application과 DBMS를 연결해주는 객체
     * */
    Connection con = null;

      // [방법 1] 하드 코딩 == 코드에다가 직접 값을 적어놓고 나중에 콛를 수정
    try {// 클레스명이 나오고 커넥션이 나옴 == 드라이버를 관리한다라는 뜻
      // DriverManager를 이용하여 Connection 객체 생성
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306",
          "swcamp",
          "swcamp"
      );

      System.out.println("con = " + con); // con = com.mysql.cj.jdbc.ConnectionImpl@385c9627

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        con.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
