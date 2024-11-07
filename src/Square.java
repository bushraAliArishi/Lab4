public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {

    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }
    public double getSide(){
       return getLength();
     }


    public void setSide(double side){
        setLength(side);
        setWidth(side);

    }

    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
