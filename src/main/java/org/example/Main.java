package org.example;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", "Doe", 20);
        System.out.println("FirstName: " + person.getFirstName() + " " + "LastName: " +
                 person.getLastName() + " " + "Age: " + person.getAge());

        Person person1 = new Person("Jane", "Doe", 15, 60, 1.80, false);
        System.out.println("FirstName: " + person1.getFirstName() + " " + "LastName: " +
                 person1.getLastName() + " " + "Age: " + person1.getAge() + " " + "Weight: " +
                 person1.getWeight() + " " + "Height: " + person1.getHeight() + " " + "IsMale? " +
                 person1.isMale());

        Wall wall = new Wall(5,4);
        System.out.println("Height: " + wall.getHeight() + " " + "Width: " + wall.getWidth() +
                 " " + "Area: " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("Height: " + wall.getHeight() + " " + "Width: " + wall.getWidth() +
                " " + "Area: " + wall.getArea());

        wall.setHeight(7.5);
        wall.setWidth(2.5);
        System.out.println("Height: " + wall.getHeight() + " " + "Width: " + wall.getWidth() +
                " " + "Area: " + wall.getArea());
    }
}
