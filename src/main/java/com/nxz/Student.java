package com.nxz;

public class Student {
    private  int age;
    private  String name;
    private  int id;
    private String password;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId(String s) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class IdCard{
    protected Long cardNo;


}
class Person{
    public String name;
}