package homewerk3;

public class shapeTester {
    public static void main(String[] args) {
        Square sq1 = new Square();
        sq1.side = 25.0;
        System.out.println("The area of a square is : " + sq1.squaArea());
        System.out.println("The perimeter of a square is : " + sq1.squaPerm());

        System.out.println("---------------------------------");

        Triangle tri1 = new Triangle();
        tri1.base = 30.0;
        tri1.height = 30.0;
        tri1.side1 = 9.0;
        tri1.side2 = 8.0;
        System.out.println("The area of a triangle is : " + tri1.triaArea());
        System.out.println("The perimeter of a triangle is : " + tri1.triaPerm());
    }
}










