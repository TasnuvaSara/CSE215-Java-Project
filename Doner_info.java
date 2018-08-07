
package project215;

public class Doner_info {
       private String name;
       private String dateOfBirth;
       private String gender;
       private String age;
       private String date;
       private String mobileNo;
       private String bloodGroup;
       private String bags;
       
   public Doner_info(){
       
   }

    public Doner_info(String name, String dateOfBirth, String gender, String age, String date, String mobileNo, String bloodGroup, String bags) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.age = age;
        this.date = date;
        this.mobileNo = mobileNo;
        this.bloodGroup = bloodGroup;
        this.bags = bags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getBags() {
        return bags;
    }

    public void setBags(String bags) {
        this.bags = bags;
    }

    @Override
    public String toString() {
        return  "Name=" + name + ", Date Of Birth=" + dateOfBirth + ", Gender=" + gender + ", Age=" + age + ", Date=" + date + ", Mobile NO=" + mobileNo + ", Blood Group=" + bloodGroup + ", Bags=" + bags ;
    }
    
}
