package News_Feed_System.src.com.company.Model;

import News_Feed_System.src.com.company.constants.Gender;


public class User {
    
    private int id;
    private String username;
    private String phoneNo;
    private int age;
    private Gender gender;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return username;
    }
    public void setUserName(String name) {
        this.username = name;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    
}
