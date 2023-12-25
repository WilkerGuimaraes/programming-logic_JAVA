package question_2;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {
        return this.height * this.width;
    }

    public double calculatePerimeter() {
        return 2 * (this.height + this.width);
    }
}
