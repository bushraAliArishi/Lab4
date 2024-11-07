import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Initial Shape Tests:");

        // Testing Shape with color and filled properties
        Shape shape = new Circle(5);
        shape.setColor("blue");
        shape.setFilled(false);
        System.out.println(shape);

        // Testing Circle
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("Area of Circle: " + circle.calculatArea());
        System.out.println("Circumference of Circle: " + circle.calculateCircumference());
        System.out.println(circle);

        // Testing Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(4);
        rectangle.setLength(5);
        System.out.println("Area of Rectangle: " + Rectangle.calculatArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.calculateCircumference());
        System.out.println(rectangle);


        Square square = new Square();
        square.setSide(3);
        System.out.println("Area of Square: " + Square.calculatArea());
        System.out.println("Perimeter of Square: " + square.calculateCircumference());
        System.out.println(square);

        // Interactive section
        System.out.println("\nInteractive Shape Calculator:");

        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Choose a shape to calculate its area and circumference:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    Circle chosenCircle = new Circle(radius);
                    System.out.printf("Circle Area: %.2f\n", chosenCircle.calculatArea());
                    System.out.printf("Circle Circumference: %.2f\n", chosenCircle.calculateCircumference());
                    break;

                case 2:
                    System.out.print("Enter the height of the rectangle: ");
                    double height = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    Rectangle chosenRectangle = new Rectangle(width, height);
                    System.out.printf("Rectangle Area: %.2f\n", chosenRectangle.calculatArea());
                    System.out.printf("Rectangle Circumference (Perimeter): %.2f\n", chosenRectangle.calculateCircumference());
                    break;

                case 3:
                    System.out.print("Enter the base of the triangle (equilateral): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double triangleHeight = scanner.nextDouble();
                    Triangle chosenTriangle = new Triangle( shape.getColor(),shape.isFilled(),base, triangleHeight);
                    System.out.printf("Triangle Area: %.2f\n", chosenTriangle.calculatArea());
                    System.out.printf("Triangle Circumference (Perimeter): %.2f\n", chosenTriangle.calculateCircumference());
                    break;

                case 4:
                    continueProgram = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
            System.out.println();
        }


    }
}