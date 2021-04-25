package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DbManagerTestSuite {

    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");

            String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
            statement.executeUpdate(sql);
            sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
            statement.executeUpdate(sql);
            sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
            statement.executeUpdate(sql);
            sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
            statement.executeUpdate(sql);
            sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
            statement.executeUpdate(sql);

            //When
            String sqlQuery = "SELECT * FROM USERS";
            statement = dbManager.getConnection().createStatement();
            rs = statement.executeQuery(sqlQuery);

            //Then
            int counter = 0;
            while (rs.next()) {
                System.out.println(rs.getInt("ID" + ", " +
                        rs.getString("FIRSTNAME" + ", " +
                                rs.getString("LASTNAME"))));
                counter++;
            }
            rs.close();
            statement.close();
            Assertions.assertEquals(5, counter);
        }
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        Statement statement = dbManager.getConnection().createStatement();


        String sql = "DELETE FROM POSTS";
        statement.executeUpdate(sql);
        sql = "DELETE FROM USERS";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('John', 'Smith')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zachary', 'Lee')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Stephanie', 'Kovalsky')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Thomas', 'Landgren')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('John', 'Thomas')";
        statement.executeUpdate(sql);

        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (1, 'This is my first post on thin forum!')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (2, 'This is my first post too!')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (1, 'Quite good, thanks bro!')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (4, 'Yo all! Here is Thomas!')";
        statement.executeUpdate(sql);

        //When
        String sqlQuery =
                "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER\n" +
                        "FROM USERS U\n" +
                        "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                        "GROUP BY P.USER_ID\n" +
                        "HAVING COUNT(*) >=2\n" +
                        "ORDER BY U.FIRSTNAME, U.LASTNAME;";
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME") + ", " +
                            rs.getInt("POSTS_NUMBER"));
            counter++;
        }
        rs.close();
        statement.close();
        Assertions.assertEquals(1, counter);
    }
}