public class Rectangle  extends Shape{
    private double width,length;

    public Rectangle () {
        this.width = width;
        this.length = length;
    }
    public Rectangle (double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle (String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        double area=getWidth()*getLength();
        return area;
    }
    public double getPerimeter(){
        double Perimeter=2*(getWidth()+getLength());
        return Perimeter;
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }

    @Override
    static double calculatArea() {
        double area=getWidth()*getLength();
        return area;
    }

    @Override
    double calculateCircumference() {
        double circumference=2 * (width + length);
        return circumference;
    }
}
