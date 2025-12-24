package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    int weight;
    double height;
    boolean isMale;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age,
                  int weight, double height, boolean isMale) {
        this(firstName, lastName, age); // constructor chaining ✔
        this.weight = weight;
        this.height = height;
        this.isMale = isMale;
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

    public int getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMale() {
        return isMale;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}