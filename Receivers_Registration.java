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
import java.io.*;

public class Receivers_Registration extends Members_Registration {

    private String needed_Blood_Group;
    private String disease;
    private String bags;

    public Receivers_Registration(String name, String birth_Date, String gender, String age, String date,
            String mobile_No, String needed_Blood_Group, String disease, String bags) {
        super(name, birth_Date, gender, age, date, mobile_No);
        this.needed_Blood_Group = needed_Blood_Group;
        this.disease = disease;
        this.bags = bags;
    }

    public String getNeeded_Blood_Group() {
        return needed_Blood_Group;
    }

    public void setNeeded_Blood_Group(String needed_Blood_Group) {
        this.needed_Blood_Group = needed_Blood_Group;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getBags() {
        return bags;
    }

    public void setBags(String bags) {
        this.bags = bags;
    }

    @Override
    public String toString() {
        return super.toString() + " needed_Blood_Group=" + needed_Blood_Group + ", disease=" + disease + ", bags=" + bags;
    }

    @Override
    public void write_To_File() {
         File f2 = new File("C:\\Users\\MD Khairul Hasan\\Desktop\\Receivers_Details.txt");
         PrintWriter p = null;
        try {
           

            if (!f2.exists()) {
                f2.createNewFile();
            }

            p = new PrintWriter(new FileWriter(f2, true));

            p.println(super.getName() + "," + super.getBirth_Date() + "," + super.getGender() + "," + super.getAge() + "," + super.getDate() + "," + super.getMobile_No() + "," + needed_Blood_Group + "," + disease + "," + bags);
            

            

        } catch (Exception e) {
            System.out.println(e);
        }finally{
        p.close();
    }

    }
}
