package org.example;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 30, false, "UAE", 180);

        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen: " + person1.isTeen());


        Wall wall = new Wall(5, 4);

        System.out.println("area= " + wall.getArea()); // Expected output: area= 20.0

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());  // Expected output: width= 5.0
        System.out.println("height= " + wall.getHeight()); // Expected output: height= 0.0
        System.out.println("area= " + wall.getArea());
    }
}