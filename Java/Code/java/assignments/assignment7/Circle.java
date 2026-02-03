import java.text.DecimalFormat;

public class Circle extends Shape{
    DecimalFormat form = new DecimalFormat("#.000");

    private double radius;

    public Circle(){
        this.radius = 0;
    }

    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }

    public Circle(Circle c){
        super(c);
        this.radius = c.getRadius();
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double circleArea(){
        return Math.PI * (this.radius * this.radius);
    }

    public double circlePerimeter(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString(){
        return "Circle radius: " + this.radius + "\nCircle Area: " + form.format(circleArea()) + "\nCircle perimeter: " + form.format(circlePerimeter()) + "\nCircle color: " + super.getColor();
    }

    public boolean equals(Circle c){
        if (c == null) return false;
        return super.equals(c) && (this.radius == c.getRadius());
    }
}
