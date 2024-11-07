public class Circle extends Shape{
    private double radius;

    public Circle() {
        this.radius = radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double circle_Area=Math.PI*Math.pow(radius,2);
        return circle_Area;
    }
    public double getPerimeter(){
       double circle_Perimeter=2*Math.PI*radius;
        return circle_Perimeter;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }

    @Override
    double calculatArea() {
        double circle_Area=Math.PI*Math.pow(radius,2);
        return circle_Area;
    }

    @Override
    double calculateCircumference() {
        double circle_Circumference= 2 * Math.PI * radius;
        return circle_Circumference;

    }
}
