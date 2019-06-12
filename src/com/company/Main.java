package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DAO dao = new DAO();
        dao.getDbConnection();

        // Sample test to retrieve employee data
        ArrayList Employee  = dao.retrieveEmployee("HQ General Management","Monthly","Graduate Degree");
        System.out.println(Employee.toString());
    }
}
