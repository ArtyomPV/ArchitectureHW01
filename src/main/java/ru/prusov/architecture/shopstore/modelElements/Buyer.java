package ru.prusov.architecture.shopstore.modelElements;

import java.util.Date;

public class Buyer {

    //region Fields
    private static int counter = 0;
    private int id;

    private String name;
    private String lastName;
    private String patronymic;
    private Date birthday;
    private String gender;
    //endregion


    //region Getters & Setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    //endregion


    {
        id = ++counter;
    }
}
