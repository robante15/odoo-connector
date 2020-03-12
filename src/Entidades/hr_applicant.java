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
public class hr_applicant {

    public hr_applicant(int id, int campaign_id, int source_id, int medium_id, String email_cc, int message_main_attachment_id, String name, boolean active, String description, String email_from, Double probability, int partner_id, String create_date, int stage_id, int last_stage_id, int company_id, int user_id, String date_closed, String date_open, String date_last_stage_update, String priority, int job_id, String salary_proposed_extra, String salary_expected_extra, Double salary_proposed, Double salary_expected, String availability, String partner_name, String partner_phone, String partner_mobile, int type_id, int department_id, Double delay_close, int color, int emp_id, String kanban_state, int create_uid, int write_uid, String write_date) {
        this.id = id;
        this.campaign_id = campaign_id;
        this.source_id = source_id;
        this.medium_id = medium_id;
        this.email_cc = email_cc;
        this.message_main_attachment_id = message_main_attachment_id;
        this.name = name;
        this.active = active;
        this.description = description;
        this.email_from = email_from;
        this.probability = probability;
        this.partner_id = partner_id;
        this.create_date = create_date;
        this.stage_id = stage_id;
        this.last_stage_id = last_stage_id;
        this.company_id = company_id;
        this.user_id = user_id;
        this.date_closed = date_closed;
        this.date_open = date_open;
        this.date_last_stage_update = date_last_stage_update;
        this.priority = priority;
        this.job_id = job_id;
        this.salary_proposed_extra = salary_proposed_extra;
        this.salary_expected_extra = salary_expected_extra;
        this.salary_proposed = salary_proposed;
        this.salary_expected = salary_expected;
        this.availability = availability;
        this.partner_name = partner_name;
        this.partner_phone = partner_phone;
        this.partner_mobile = partner_mobile;
        this.type_id = type_id;
        this.department_id = department_id;
        this.delay_close = delay_close;
        this.color = color;
        this.emp_id = emp_id;
        this.kanban_state = kanban_state;
        this.create_uid = create_uid;
        this.write_uid = write_uid;
        this.write_date = write_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCampaign_id() {
        return campaign_id;
    }

    public void setCampaign_id(int campaign_id) {
        this.campaign_id = campaign_id;
    }

    public int getSource_id() {
        return source_id;
    }

    public void setSource_id(int source_id) {
        this.source_id = source_id;
    }

    public int getMedium_id() {
        return medium_id;
    }

    public void setMedium_id(int medium_id) {
        this.medium_id = medium_id;
    }

    public String getEmail_cc() {
        return email_cc;
    }

    public void setEmail_cc(String email_cc) {
        this.email_cc = email_cc;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail_from() {
        return email_from;
    }

    public void setEmail_from(String email_from) {
        this.email_from = email_from;
    }

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }

    public int getPartner_id() {
        return partner_id;
    }

    public void setPartner_id(int partner_id) {
        this.partner_id = partner_id;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public int getStage_id() {
        return stage_id;
    }

    public void setStage_id(int stage_id) {
        this.stage_id = stage_id;
    }

    public int getLast_stage_id() {
        return last_stage_id;
    }

    public void setLast_stage_id(int last_stage_id) {
        this.last_stage_id = last_stage_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getDate_closed() {
        return date_closed;
    }

    public void setDate_closed(String date_closed) {
        this.date_closed = date_closed;
    }

    public String getDate_open() {
        return date_open;
    }

    public void setDate_open(String date_open) {
        this.date_open = date_open;
    }

    public String getDate_last_stage_update() {
        return date_last_stage_update;
    }

    public void setDate_last_stage_update(String date_last_stage_update) {
        this.date_last_stage_update = date_last_stage_update;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public String getSalary_proposed_extra() {
        return salary_proposed_extra;
    }

    public void setSalary_proposed_extra(String salary_proposed_extra) {
        this.salary_proposed_extra = salary_proposed_extra;
    }

    public String getSalary_expected_extra() {
        return salary_expected_extra;
    }

    public void setSalary_expected_extra(String salary_expected_extra) {
        this.salary_expected_extra = salary_expected_extra;
    }

    public Double getSalary_proposed() {
        return salary_proposed;
    }

    public void setSalary_proposed(Double salary_proposed) {
        this.salary_proposed = salary_proposed;
    }

    public Double getSalary_expected() {
        return salary_expected;
    }

    public void setSalary_expected(Double salary_expected) {
        this.salary_expected = salary_expected;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getPartner_name() {
        return partner_name;
    }

    public void setPartner_name(String partner_name) {
        this.partner_name = partner_name;
    }

    public String getPartner_phone() {
        return partner_phone;
    }

    public void setPartner_phone(String partner_phone) {
        this.partner_phone = partner_phone;
    }

    public String getPartner_mobile() {
        return partner_mobile;
    }

    public void setPartner_mobile(String partner_mobile) {
        this.partner_mobile = partner_mobile;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public Double getDelay_close() {
        return delay_close;
    }

    public void setDelay_close(Double delay_close) {
        this.delay_close = delay_close;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getKanban_state() {
        return kanban_state;
    }

    public void setKanban_state(String kanban_state) {
        this.kanban_state = kanban_state;
    }

    public int getCreate_uid() {
        return create_uid;
    }

    public void setCreate_uid(int create_uid) {
        this.create_uid = create_uid;
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

    private int id;
    private int campaign_id;
    private int source_id;
    private int medium_id;
    private String email_cc;
    private int message_main_attachment_id;
    private String name;
    private boolean active;
    private String description;
    private String email_from;
    private Double probability;
    private int partner_id;
    private String create_date; // Cambiar por DATE
    private int stage_id;
    private int last_stage_id;
    private int company_id;
    private int user_id;
    private String date_closed; // Cambiar por DATE
    private String date_open; // Cambiar por DATE
    private String date_last_stage_update; // Cambiar por DATE
    private String priority;
    private int job_id;
    private String salary_proposed_extra;
    private String salary_expected_extra;
    private Double salary_proposed;
    private Double salary_expected;
    private String availability; // Cambiar por DATE
    private String partner_name;
    private String partner_phone;
    private String partner_mobile;
    private int type_id;
    private int department_id;
    private Double delay_close;
    private int color;
    private int emp_id;
    private String kanban_state;
    private int create_uid;
    private int write_uid;
    private String write_date; // Cambiar por DATE
}
