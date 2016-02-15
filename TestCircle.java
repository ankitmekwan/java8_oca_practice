public class TestCircle {
  public static void main (String [] args) {
    Circle circle = new Circle();
    Circle anotherCircle = new Circle(1.3);
    circle.getRadius();
    anotherCircle.getArea();
  }
}


class Circle {
  private double radius;
  public Circle() {}

  public Circle (double radius) {
    this.radius = radius;
  }

  public Double getRadius () {
    System.out.println("Radius: "+this.radius);
    return this.radius;
  }

  public Double getArea() {
    double area = Math.PI * Math.pow(this.radius, 2);
    System.out.printf("The area of the circle is %.2f",area);
    System.out.println();
    return area;
  }


}
