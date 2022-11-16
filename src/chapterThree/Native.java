package chapterThree;

import com.sun.source.tree.BreakTree;

import java.sql.SQLOutput;

public class Native {
    private String name;

    private String phoneNumber;

    private int age;

    public void setAge(int newAge)
    {
        this.age = newAge;
    }
    public int getAge() {
        return age;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public String getName()

    {
        return name;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}




