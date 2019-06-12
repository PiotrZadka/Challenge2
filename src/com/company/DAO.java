package com.company;

import java.sql.*;
import java.util.ArrayList;


/**
 * Controller (Data Access Object Class) to establish database connections and method to retrieve some employee data
 */

public class DAO {
    Connection dbConnection = null;
    Statement statement = null;
    ResultSet resultSet = null;


    // JDBC driver name and database URL
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "";

    //  Database credentials
    private static final String USER = "";
    private static final String PASS = "";

    public Connection getDbConnection(){

        try {
            String dbURL = DB_URL;
            dbConnection = DriverManager.getConnection(dbURL, USER, PASS);
            statement = dbConnection.createStatement();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dbConnection;
    }

    public void closeConnection() {
        try {
            if (statement != null) {
                statement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method that retrieves all Employee data based on supplied details (department name, pay type and education level)
     */

    public ArrayList<Employee> retrieveEmployee(String depName, String payType, String eduLevel){

        ArrayList<Employee> resultsArr = new ArrayList<>();

        Employee employee;

        int position_id, department_id,employee_id,store_id, supervisor_id;
        String department_description, full_name, last_name, first_name, position_title;
        String education_level, marital_status, gender, management_role,pay_type, birth_date, hire_date, end_date;
        double min_scale, max_scale, salary;

        String query = "SELECT *" +
                "FROM department " +
                "JOIN employee USING (department_id)" +
                "JOIN position USING (position_id)" +
                "WHERE department_description = '"+depName+"'" +
                "AND pay_type = '"+payType+"'" +
                "AND education_level = '"+eduLevel+"';";

        try{
            dbConnection = getDbConnection();
            statement = dbConnection.createStatement();
            resultSet = statement.executeQuery(query);

            while(resultSet.next()){

                position_id = resultSet.getInt("position_id");
                department_id = resultSet.getInt("department_id");
                employee_id = resultSet.getInt("employee_id");
                store_id = resultSet.getInt("store_id");
                supervisor_id = resultSet.getInt("supervisor_id");
                department_description = resultSet.getString("department_description");
                full_name = resultSet.getString("full_name");
                last_name = resultSet.getString("last_name");
                first_name = resultSet.getString("first_name");
                position_title = resultSet.getString("position_title");
                marital_status = resultSet.getString("marital_status");
                education_level = resultSet.getString("education_level");
                gender = resultSet.getString("gender");
                management_role = resultSet.getString("management_role");
                pay_type = resultSet.getString("pay_type");
                birth_date = resultSet.getString("birth_date");
                hire_date = resultSet.getString("hire_date");
                end_date = resultSet.getString("end_date");
                min_scale = resultSet.getDouble("min_scale");
                max_scale = resultSet.getDouble("max_scale");
                salary = resultSet.getDouble("salary");

                employee = new Employee(position_id,department_id,employee_id,store_id,supervisor_id,department_description,full_name,
                        last_name,first_name,position_title,education_level,marital_status,gender,management_role,pay_type,
                        birth_date,hire_date,end_date,min_scale,max_scale,salary);
                resultsArr.add(employee);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        closeConnection();
        return resultsArr;
    }
}
