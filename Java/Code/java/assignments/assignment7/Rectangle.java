public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(){
    }

    public Rectangle(double height, double width, String color){
        super(color);
        this.height = height;
        this.width = width;
    }

    public Rectangle(Rectangle r){
        super(r);
        this.width = r.getWidth();
        this.height = r.getHeight();
    }

    public double getHeight(){
        return this.height;
    }

    public double getWidth(){
        return this.width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double area(){
        return this.height * this.width;
    }

    public double perimeter(){
        return 2 * (this.height + this.width);
    }

    @Override
    public String toString() {
        return "Rectangle height: " + this.height + "\nRectangle width: " + this.width + "\nRectangle Area: " + area() + "\nRectangle perimeter: " + perimeter() + "\nRectangle color: " + super.getColor();
    }

    public boolean equals(Rectangle r){
        if (r == null) return false;
        return super.equals(r) && (this.height == r.getHeight()) && (this.width == r.getWidth());
    }

}
