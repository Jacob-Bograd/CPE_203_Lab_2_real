import java.util.ArrayList;
import java.util.List;

public class Polygon {
    private final List<Point> points;
    public Polygon (List<Point> Things){
        this.points = Things;
    }
    public List getPoints(){
        return points;
    }
}
