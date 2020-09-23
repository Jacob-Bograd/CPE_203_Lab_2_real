import org.w3c.dom.css.Rect;
import java.lang.Double;


public class Bigger {

    public static String whichIsBigger(Circle circle, Rectangle rectangle, Polygon polygon){

        double cp = circle.perimeter(); // circle perimeter
        double rp = rectangle.perimeter(); //rectnagle perimeter
        double pp = polygon.perimeter();// polygon perimeter
        double max = Double.max(cp, Double.max(rp, pp));
        if (max == cp){
            return "Circle";
        }
        else if (max == rp){
            return "Rectangle";
        }
        else if (max == pp){
            return "Polygon";
        }
        else{
            System.out.println("SOMETHING VERY BAD WENT WRONG IN BIGGER.JAVA IN WHICH IS BIGGER");
            return null;
        }


    }
}
