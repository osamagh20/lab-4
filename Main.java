public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(2.3); // Object from Circle class

        // print formatted with 2.3 radius.
        System.out.println("****** Circle ******");
        String CircleAreaFormatted = String.format("Circle Area : %.2f", c1.calculateArea());
        System.out.println(CircleAreaFormatted);

        String CircleCircumferenceFormatted = String.format("Circle Circumference : %.2f", c1.calculateCircumference());
        System.out.println(CircleCircumferenceFormatted);

        // print formatted with 4.3 radius after modify .
        c1.setRadius(4.3);
        String CircleAreaFormatted2 = String.format("Circle Area : %.2f", c1.calculateArea());
        System.out.println(CircleAreaFormatted2);
        String CircleCircumferenceFormatted2 = String.format("Circumference : %.2f", c1.calculateCircumference());
        System.out.println(CircleCircumferenceFormatted2);


        Rectangle r1 = new Rectangle(1.2, 2.3); // create Object from Rectangle class
        // print formatted with 1.2 width and 2.3 height .
        System.out.println("");
        System.out.println("****** Rectangle ******");
        String RectangleAreaFormatted = String.format("Rectangle Area : %.2f", r1.calculateArea());
        System.out.println(RectangleAreaFormatted);

        String RectangleCircumferenceFormatted = String.format("Rectangle Circumference : %.2f", r1.calculateCircumference());
        System.out.println(RectangleCircumferenceFormatted);

        // print formatted with 4.4 width and 5.5 height after modify .
        r1.setWidth(4.4);
        r1.setHeight(5.5);
        String RectangleAreaFormatted2 = String.format("Rectangle Area : %.2f", r1.calculateArea());
        System.out.println(RectangleAreaFormatted2);
        String RectangleCircumferenceFormatted2 = String.format("Rectangle : %.2f", r1.calculateCircumference());
        System.out.println(RectangleCircumferenceFormatted2);

        Triangle t1 = new Triangle(3.3, 6.5);

        // print formatted with 3.3 base and 6.5 height .
        System.out.println("");
        System.out.println("****** Triangle ******");
        String TriangleAreaFormatted = String.format("Triangle Area : %.2f", t1.calculateArea());
        System.out.println(TriangleAreaFormatted);

        String TriangleCircumferenceFormatted = String.format("Triangle Circumference : %.2f", t1.calculateCircumference());
        System.out.println(TriangleCircumferenceFormatted);

        // print formatted with 7.2 base and 9.6 height after modify .
        t1.setBase(7.2);
        t1.setHeight(9.6);
        String TriangleAreaFormatted2 = String.format("Triangle Area : %.2f", t1.calculateArea());
        System.out.println(TriangleAreaFormatted2);
        String TriangleCircumferenceFormatted2 = String.format("Triangle : %.2f", t1.calculateCircumference());
        System.out.println(TriangleCircumferenceFormatted2);







    }
}