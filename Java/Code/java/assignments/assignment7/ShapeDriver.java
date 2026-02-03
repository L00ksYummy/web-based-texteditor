/*
 * Michael Allen
 * Assignment 7
 * September 17, 2024
 * In this program, we used inhereited object oriented programming to use the superclass Shape.java to then create the subclasses
 * Rectangle.java and Circle.java that takes the base methods and classes from Shape and further modifies them to fit the shape 
 * We also added an equals and copy constructor in each subclass
 * 
 * There are no user inputs in this program
 * 
 * No bugs
 */

public class ShapeDriver {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(23, 14, "Yellow");
        Rectangle r2 = new Rectangle(r1);

        System.out.println(r1.equals(r2) + "\n");
        r1.setColor("Purple");
        r1.setHeight(10);
        r1.setWidth(23);
        System.out.println(r1.toString() + "\n");
        System.out.println(r2.toString());
        System.out.println("\n");
        System.out.println(r1.equals(r2) + "\n");

        Circle c1 = new Circle(21, "Green");
        Circle c2 = new Circle(c1);

        System.out.println(c1.equals(c2) + "\n");
        c1.setColor("Blue");
        c1.setRadius(13);
        System.out.println(c1.toString() + "\n");
        System.out.println(c2.toString() + "\n");
        System.out.println(c1.equals(c2));

    }
}
