package com.riotgames.kr.account;

import lombok.Data;

@Data
public class ImPerson {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void print()
    {
        System.out.print(name+" "+age);
    }
}
