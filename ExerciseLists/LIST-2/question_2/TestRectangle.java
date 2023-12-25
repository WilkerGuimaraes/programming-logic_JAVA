package question_2;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 4);

        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.calculatePerimeter());
    }
}