import static java.lang.Double.NaN;

public class Point {
   public double x = NaN;
   public double y = NaN;
   public Point(){
      this.x = x;
      this.y = y;
   }
   public Point(double x, double y){
      this.x = x;
      this.y = y;

   }
   public double getX(){
      return x;
   }
   public double getY(){
      return y;
   }
   public double getRadius(){
      double radius =  Math.sqrt(((x*x)+(y*y)));
      return radius;
   }
   public double getAngle(){
      double hyp = getRadius();
      double angle = Math.asin(y/hyp);
      return angle;
   }
   public Point rotate90(){
      x *= -1;
      return new Point(x , y);
   }
   public double test_rotate90() {
      rotate90();
      double finalx = getX();
      return finalx;
   }



}
