public class Rectangle extends Point {
    private final Point left;
    private final Point right;

    Rectangle(Point left, Point right){
        this.left = left;
        this.right = right;
    }
    public Point getTopLeft(){
        return right;
    }
    public Point getBottomRight(){
        return left;
    }
    public double perimeter(){
        double topRightX = right.getX();
        double topRightY = right.getY();
        double bottomLeftX = left.getX();
        double bottomLeftY = left.getY();
        double perm = ((topRightX - bottomLeftX) * 2 + (topRightY - bottomLeftY) * 2);
        return perm;

    }
}
