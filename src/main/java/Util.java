import java.util.List;

public class Util extends Point{
    int a = 0;
    int b = 0;

    public static double perimeter(Point point, double radius){     //this is for a circle
        Circle c = new Circle(point, radius);
        radius = c.getradius();
        double perm = 2*Math.PI*radius;
        return perm;
    }
    public static double permieter(Point left, Point right){
        Rectangle r = new Rectangle(left, right);
        Point left1 = r.getTopLeft();
        Point right2 = r.getBottomRight();
        double topRightX = right2.getX();
        double topRightY = right2.getY();
        double bottomLeftX = left1.getX();
        double bottomLeftY = left1.getY();
        double perimeter = ((topRightX - bottomLeftX) * 2 + (topRightY - bottomLeftY) * 2);
        return perimeter;
    }
    public static double permieter(List<Point>){

    }
}
