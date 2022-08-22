class Shape
{
    double length, height;
    Shape(double a, double b)
    {
        length = a;
        height = b;
    }

    double area()
    {
        System.out.print(" ");
        return 0;
    }
}
class Rectangle extends Shape
{

    Rectangle(double a, double b) {
        super(a, b);
    }


    @Override
    double area()
    {
        System.out.print("Area of Rectangle :" );
        return length * height;
    }
}

class Triangle extends Shape {

    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area()
    {
        System.out.print("Area of Triangle :" );
        return  0.5 * (length * height);
    }
}


public class Area {
    public static void main(String[] args)
    {
        Shape sh = new Shape(10,20);
        Rectangle rec = new Rectangle(10,2);
        Triangle tri = new Triangle(10,15);

        Shape s;
        s = rec;
        System.out.print(s.area());
        System.out.print("\n");
        s = tri;
        System.out.print(s.area());



    }
}