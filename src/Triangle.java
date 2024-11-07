public class Triangle extends Shape{
    private double height,base;



    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public Triangle(String color, boolean filled, double height, double base) {
        super(color, filled);
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    @Override
    double calculatArea() {
        double area= (base * height) / 2;
        return area;
    }

    @Override
    double calculateCircumference() {
        double circumference= 3 * base;

        return circumference;
    }
}
