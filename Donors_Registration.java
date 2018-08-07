/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project215;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author MD Khairul Hasan
 */
public class Donors_Registration extends Members_Registration {

    private String blood_Group;
    private String bags;

    public Donors_Registration(String name, String birth_Date, String gender, String age, String date,
            String mobile_No, String blood_Group, String bags) {
        super(name, birth_Date, gender, age, date, mobile_No);
        this.blood_Group = blood_Group;
        this.bags = bags;
    }

    public String getBlood_Group() {
        return blood_Group;
    }

    public void setBlood_Group(String blood_Group) {
        this.blood_Group = blood_Group;
    }

    public String getBags() {
        return bags;
    }

    public void setBags(String bags) {
        this.bags = bags;
    }

    public String toString() {
        return super.toString() + " blood_Group=" + blood_Group + " bags=" + bags;
    }

    public void write_To_File() {
        PrintWriter p = null;
        try {
            File f1 = new File("C:\\Users\\MD Khairul Hasan\\Desktop\\Donors_Details.txt");

            if (!f1.exists()) {
                f1.createNewFile();
            }

            p = new PrintWriter(new FileWriter(f1, true));

            p.println(super.getName() + " " + super.getBirth_Date() + " " + super.getGender() + " " + super.getAge() + " " + super.getDate() + " " + super.getMobile_No() + " " + blood_Group + " " + bags);
            
          

        } catch (Exception e) {
            System.out.println(e);
        }finally{
              p.close();
        }

    }

}
