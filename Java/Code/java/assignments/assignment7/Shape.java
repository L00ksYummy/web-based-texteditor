public class Shape {
    
    private String color;

    public Shape(){
        this.color = "";
    }

    public Shape(String color){
        this.color = color;
    }

    public Shape(Shape s){
        this.color = s.getColor();
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public String toString() {
        return "Shape color is: " + this.color;
    }

    public boolean equals(Shape s){
        if (s == null) return false;
        else return s.getColor().equals(this.color);
    }
}
