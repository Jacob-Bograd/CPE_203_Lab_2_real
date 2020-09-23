import java.util.List;

public class Util extends Point{

    public static double perimeter(Circle c) {
//        double radius = c.getRadius();
//        double perm = 2*Math.PI*radius;
//        return perm;
        // this has been moved over to circle.java
        return c.perimeter();
    }
    public static double perimeter(Rectangle rect){ //this is for a rectangle this part is now in Rectange.java
//        Point left1 = rect.getTopLeft(); this is now in Rectangle.java not needed here
//        Point right2 = rect.getBottomRight();
//        double topRightX = right2.getX();
//        double topRightY = right2.getY();
//        double bottomLeftX = left1.getX();
//        double bottomLeftY = left1.getY();
//        double perm = ((topRightX - bottomLeftX) * 2 + (topRightY - bottomLeftY) * 2);
//        return perm;
        return rect.perimeter();
    }
    public static double perimeter(Polygon poly){ // this is for a polygon
//        double perm = Double.NaN;
//        List<Point> points = poly.getPoints();
//        for(int i = 0; i < points.size(); i++){
//            Point first = points.get(i);
//            Point second = points.get(i+1);
//            double firstx = first.getX();;
//            double firsty= first.getY();
//            double secondx = second.getX();;
//            double secondy = second.getY();
//            double first_side = Math.abs(secondx-firstx);
//            double second_side = Math.abs(secondy-firsty);
//            perm = perm + first_side + second_side;
//
//        }
//        return perm;

        //not needed moved to polygon.java
        return poly.perimeter();

    }
}
