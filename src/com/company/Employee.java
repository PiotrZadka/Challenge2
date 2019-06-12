package com.company;

/**
 * Model class for Employee details
 */

public class Employee {
    int position_id, department_id,employee_id,store_id, supervisor_id;
    String department_description, full_name, last_name, first_name, position_title;
    String education_level, martial_status, gender, managment_role,pay_type, birth_date, hire_date, end_date;
    double min_scale, max_scale, salary;

    public Employee(int position_id, int department_id, int employee_id, int store_id, int supervisor_id,
                    String department_description, String full_name, String last_name, String first_name,
                    String position_title, String education_level, String martial_status, String gender,
                    String managment_role, String pay_type, String birth_date, String hire_date, String end_date,
                    double min_scale, double max_scale, double salary) {

        this.position_id = position_id;
        this.department_id = department_id;
        this.employee_id = employee_id;
        this.store_id = store_id;
        this.supervisor_id = supervisor_id;
        this.department_description = department_description;
        this.full_name = full_name;
        this.last_name = last_name;
        this.first_name = first_name;
        this.position_title = position_title;
        this.education_level = education_level;
        this.martial_status = martial_status;
        this.gender = gender;
        this.managment_role = managment_role;
        this.pay_type = pay_type;
        this.birth_date = birth_date;
        this.hire_date = hire_date;
        this.end_date = end_date;
        this.min_scale = min_scale;
        this.max_scale = max_scale;
        this.salary = salary;
    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public int getSupervisor_id() {
        return supervisor_id;
    }

    public void setSupervisor_id(int supervisor_id) {
        this.supervisor_id = supervisor_id;
    }

    public String getDepartment_description() {
        return department_description;
    }

    public void setDepartment_description(String department_description) {
        this.department_description = department_description;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getPosition_title() {
        return position_title;
    }

    public void setPosition_title(String position_title) {
        this.position_title = position_title;
    }

    public String getEducation_level() {
        return education_level;
    }

    public void setEducation_level(String education_level) {
        this.education_level = education_level;
    }

    public String getMartial_status() {
        return martial_status;
    }

    public void setMartial_status(String martial_status) {
        this.martial_status = martial_status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getManagment_role() {
        return managment_role;
    }

    public void setManagment_role(String managment_role) {
        this.managment_role = managment_role;
    }

    public String getPay_type() {
        return pay_type;
    }

    public void setPay_type(String pay_type) {
        this.pay_type = pay_type;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getHire_date() {
        return hire_date;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public double getMin_scale() {
        return min_scale;
    }

    public void setMin_scale(double min_scale) {
        this.min_scale = min_scale;
    }

    public double getMax_scale() {
        return max_scale;
    }

    public void setMax_scale(double max_scale) {
        this.max_scale = max_scale;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position_id=" + position_id +
                ", department_id=" + department_id +
                ", employee_id=" + employee_id +
                ", store_id=" + store_id +
                ", supervisor_id=" + supervisor_id +
                ", department_description='" + department_description + '\'' +
                ", full_name='" + full_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", position_title='" + position_title + '\'' +
                ", education_level='" + education_level + '\'' +
                ", martial_status='" + martial_status + '\'' +
                ", gender='" + gender + '\'' +
                ", managment_role='" + managment_role + '\'' +
                ", pay_type='" + pay_type + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", hire_date='" + hire_date + '\'' +
                ", end_date='" + end_date + '\'' +
                ", min_scale=" + min_scale +
                ", max_scale=" + max_scale +
                ", salary=" + salary +
                '}';
    }
}
