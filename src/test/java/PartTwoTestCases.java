import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.w3c.dom.css.Rect;

public class PartTwoTestCases
{
   public static final double DELTA = 0.00001;

   @Test
   public void testCircleImplSpecifics()
      throws NoSuchMethodException
   {
      final List<String> expectedMethodNames = Arrays.asList(
         "getCenter", "getRadius", "perimeter");

      final List<Class> expectedMethodReturns = Arrays.asList(
         Point.class, double.class, double.class);

      final List<Class[]> expectedMethodParameters = Arrays.asList(
         new Class[0], new Class[0], new Class[0]);

      verifyImplSpecifics(Circle.class, expectedMethodNames,
         expectedMethodReturns, expectedMethodParameters);
   }

   @Test
   public void testRectangleImplSpecifics()
      throws NoSuchMethodException
   {
      final List<String> expectedMethodNames = Arrays.asList(
         "getTopLeft", "getBottomRight", "perimeter");

      final List<Class> expectedMethodReturns = Arrays.asList(
         Point.class, Point.class, double.class);

      final List<Class[]> expectedMethodParameters = Arrays.asList(
         new Class[0], new Class[0], new Class[0]);

      verifyImplSpecifics(Rectangle.class, expectedMethodNames,
         expectedMethodReturns, expectedMethodParameters);
   }

   @Test
   public void testPolygonImplSpecifics()
      throws NoSuchMethodException
   {
      final List<String> expectedMethodNames = Arrays.asList(
         "getPoints", "perimeter");

      final List<Class> expectedMethodReturns = Arrays.asList(
         List.class, double.class);

      final List<Class[]> expectedMethodParameters = Arrays.asList(
         new Class[0], new Class[0]);

      verifyImplSpecifics(Polygon.class, expectedMethodNames,
         expectedMethodReturns, expectedMethodParameters);
   }

   private static void verifyImplSpecifics(
      final Class<?> clazz,
      final List<String> expectedMethodNames,
      final List<Class> expectedMethodReturns,
      final List<Class[]> expectedMethodParameters)
      throws NoSuchMethodException
   {
      assertEquals("Unexpected number of public fields",
         2, Point.class.getFields().length);

      final List<Method> publicMethods = Arrays.stream(
         clazz.getDeclaredMethods())
            .filter(m -> Modifier.isPublic(m.getModifiers()))
            .collect(Collectors.toList());

      assertEquals("Unexpected number of public methods",
         expectedMethodNames.size(), publicMethods.size());

      assertTrue("Invalid test configuration",
         expectedMethodNames.size() == expectedMethodReturns.size());
      assertTrue("Invalid test configuration",
         expectedMethodNames.size() == expectedMethodParameters.size());

      for (int i = 0; i < expectedMethodNames.size(); i++)
      {
         Method method = clazz.getDeclaredMethod(expectedMethodNames.get(i),
            expectedMethodParameters.get(i));
         assertEquals(expectedMethodReturns.get(i), method.getReturnType());
      }
   }
   @Test
   public void testbigger(){
      Point Circle_Point = new Point(3, 5);
      Circle c = new Circle(Circle_Point , 5);

      Point RectanglePoint1 = new Point(6, 9);
      Point RectanglePoint2 = new Point(4, 20);
      Rectangle r = new Rectangle(RectanglePoint1, RectanglePoint2);

      Point Poly1 = new Point(1 , 2);
      Point Poly2 = new Point(4 , 20);
      Point Poly3 = new Point(6 , 9);
      Point Poly4 = new Point(9 , 17);
      List<Point> Lp = new ArrayList<Point>();
      Lp.add(0 , Poly1);
      Lp.add(1, Poly2);
      Lp.add(2, Poly3);
      Lp.add( 3, Poly4);
      Polygon p = new Polygon(Lp);
      String result = Bigger.whichIsBigger(c , r , p);

      assertEquals("Polygon", result);
   }
   @Test
   public void testPerimPoly() {
      List < Point >points = new ArrayList < Point >();
      points.add(new Point(0, 0));
      points.add(new Point(3,0));
      points.add(new Point(0,4));
      Polygon P = new Polygon(points);
      double d = P.perimeter();
      assertEquals(10.0, d, DELTA);
   }

   @Test
   public void testPermCircle(){
      Point P = new Point(6 , 9);
      double radius = 420;
      Circle c = new Circle(P, radius);
      double perm = c.perimeter();

      assertEquals(2*Math.PI*420, perm, 0.0);
   }

   @Test
   public void TestPermRect(){
      Point p1 = new Point(6 , 9);
      Point p2 = new Point(4 , 20);
      Rectangle r = new Rectangle(p1, p2);
      double perm = r.perimeter();

      assertEquals(18 , perm, DELTA);

   }

   @Test
   public void TestGetTopLeftRect(){
      Point p1 = new Point(6 , 9);
      Point p2 = new Point(4 , 20);
      Rectangle r = new Rectangle(p1, p2);
      Point topleft = r.getTopLeft();
      double TopLeftx = topleft.getX();

      assertEquals(4, TopLeftx, DELTA);
   }



}
