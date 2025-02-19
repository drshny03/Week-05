package com.tit.day02.hands_on_practice_problems.json_report;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JSonReportDB {

    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

        List<Employee> employees = new ArrayList<>();
        while (rs.next()) {
            employees.add(new Employee(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("department"),
                    rs.getDouble("salary")
            ));
        }

        ObjectMapper mapper = new ObjectMapper();
        String jsonReport = mapper.writeValueAsString(employees);

        System.out.println(jsonReport);

        conn.close();
    }
}
