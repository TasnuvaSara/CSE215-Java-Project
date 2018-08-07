/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project215;

/**
 *
 * @author MD Khairul Hasan
 */
public abstract class Members_Registration {

    private String name;
    private String birth_Date;
    private String gender;
    private String age;
    private String date;
    private String mobile_No;

    public Members_Registration(String name, String birth_Date, String gender, String age, String date,
            String mobile_No) {
        this.name = name;
        this.birth_Date = birth_Date;
        this.gender = gender;
        this.age = age;
        this.date = date;
        this.mobile_No = mobile_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth_Date() {
        return birth_Date;
    }

    public void setBirth_Date(String birth_Date) {
        this.birth_Date = birth_Date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMobile_No() {
        return mobile_No;
    }

    public void setMobile_No(String mobile_No) {
        this.mobile_No = mobile_No;
    }

    public String toString() {
        return "name=" + name + ", birth_Date=" + birth_Date + ", gender=" + gender + ", age=" + age + ", date=" + date
                + ", mobile_No=" + mobile_No;
    }

    public abstract void write_To_File();

}
