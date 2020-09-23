public class Rectangle extends Point {
    private final Point left;
    private final Point right;

    public Rectangle(Point left, Point right){
        this.left = left;
        this.right = right;
    }
    public Point getTopLeft(){
        return right;
    }
    public Point getBottomRight(){
        return left;
    }
}
