
public class Circle extends Point{
    private final double x = Double.NaN;
    private final double y = Double.NaN;
    private final double radius;
    private final Point center;

    Circle(Point point, double radius){
        this.center = point;
        this.radius = radius;
    }
    public Point getCenter(){
        return center;
    }
    public double getRadius(){
        return radius;
    }
    public double perimeter(){
        double perm = 2*Math.PI*radius;
        return perm;
    }










}
