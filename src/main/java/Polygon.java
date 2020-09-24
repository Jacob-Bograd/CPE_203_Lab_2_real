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
        double perm = 0;
        for(int i = 0; i < points.size() - 1; i++){
            //System.out.println("DEBUG : I = " + i); // For DEBUG USE
            Point first = points.get(i);
            Point second = points.get(i+1);
            double firstx = first.getX();;
            double firsty= first.getY();
            double secondx = second.getX();;
            double secondy = second.getY();
            double first_side = Math.abs(secondx-firstx);
         //    System.out.println("DEBUG : first_side = " + first_side); // For DEBUG USE

            double second_side = Math.abs(secondy-firsty);
          //  System.out.println("DEBUG : second_side = " + second_side); // For DEBUG USE
            perm = first_side + second_side + perm;
           // System.out.println(" DEBUG : Perm = " + perm); // For DEBUG USE

        }
        return perm;


    }
}
