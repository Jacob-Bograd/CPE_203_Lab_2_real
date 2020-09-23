import java.util.ArrayList;
import java.util.List;

public class Polygon {
    private final List<Point> points;
    Polygon (List<Point> Things){
        this.points = Things;
    }
    public List getPoints(){
        return points;
    }
    public double perimeter(){
        double perm = Double.NaN;
        for(int i = 0; i < points.size(); i++){
            Point first = points.get(i);
            Point second = points.get(i+1);
            double firstx = first.getX();;
            double firsty= first.getY();
            double secondx = second.getX();;
            double secondy = second.getY();
            double first_side = Math.abs(secondx-firstx);
            double second_side = Math.abs(secondy-firsty);
            perm = perm + first_side + second_side;

        }
        return perm;


    }
}
