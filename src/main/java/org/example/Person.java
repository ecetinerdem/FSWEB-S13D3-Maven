package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    boolean isTurkish;
    String address;
    int height;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, boolean isTurkish, String address, int height) {
        this(firstName, lastName, age);
        this.isTurkish = isTurkish;
        this.address = address;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
