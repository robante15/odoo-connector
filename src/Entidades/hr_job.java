/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class hr_job {

    int id;
    int message_main_attachment_id;
    String name;
    int expected_employees;
    int no_if_employee;
    int no_of_recruitment;
    int no_of_hired_employee;
    String description;
    String requirements;
    int department_id;
    String state;
    int create_uid;
    String create_date; // Reemplazar el tipo de dato
    int write_uid;
    String write_date;
    int address_id;
    int manager_id;
    int user_id;
    int hr_responsible_id;
    int alias_id;
    int color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMessage_main_attachment_id() {
        return message_main_attachment_id;
    }

    public void setMessage_main_attachment_id(int message_main_attachment_id) {
        this.message_main_attachment_id = message_main_attachment_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpected_employees() {
        return expected_employees;
    }

    public void setExpected_employees(int expected_employees) {
        this.expected_employees = expected_employees;
    }

    public int getNo_if_employee() {
        return no_if_employee;
    }

    public void setNo_if_employee(int no_if_employee) {
        this.no_if_employee = no_if_employee;
    }

    public int getNo_of_recruitment() {
        return no_of_recruitment;
    }

    public void setNo_of_recruitment(int no_of_recruitment) {
        this.no_of_recruitment = no_of_recruitment;
    }

    public int getNo_of_hired_employee() {
        return no_of_hired_employee;
    }

    public void setNo_of_hired_employee(int no_of_hired_employee) {
        this.no_of_hired_employee = no_of_hired_employee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getCreate_uid() {
        return create_uid;
    }

    public void setCreate_uid(int create_uid) {
        this.create_uid = create_uid;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public int getWrite_uid() {
        return write_uid;
    }

    public void setWrite_uid(int write_uid) {
        this.write_uid = write_uid;
    }

    public String getWrite_date() {
        return write_date;
    }

    public void setWrite_date(String write_date) {
        this.write_date = write_date;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getHr_responsible_id() {
        return hr_responsible_id;
    }

    public void setHr_responsible_id(int hr_responsible_id) {
        this.hr_responsible_id = hr_responsible_id;
    }

    public int getAlias_id() {
        return alias_id;
    }

    public void setAlias_id(int alias_id) {
        this.alias_id = alias_id;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public hr_job(int id, int message_main_attachment_id, String name, int expected_employees, int no_if_employee, int no_of_recruitment, int no_of_hired_employee, String description, String requirements, int department_id, String state, int create_uid, String create_date, int write_uid, String write_date, int address_id, int manager_id, int user_id, int hr_responsible_id, int alias_id, int color) {
        this.id = id;
        this.message_main_attachment_id = message_main_attachment_id;
        this.name = name;
        this.expected_employees = expected_employees;
        this.no_if_employee = no_if_employee;
        this.no_of_recruitment = no_of_recruitment;
        this.no_of_hired_employee = no_of_hired_employee;
        this.description = description;
        this.requirements = requirements;
        this.department_id = department_id;
        this.state = state;
        this.create_uid = create_uid;
        this.create_date = create_date;
        this.write_uid = write_uid;
        this.write_date = write_date;
        this.address_id = address_id;
        this.manager_id = manager_id;
        this.user_id = user_id;
        this.hr_responsible_id = hr_responsible_id;
        this.alias_id = alias_id;
        this.color = color;
    }
}
