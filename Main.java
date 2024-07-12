interface Shape {
    default double calcPerimeter() {
    return 0.0;
    }
    
    default double calcArea() {
    return 0.0;
    }
    
    String getFillColor();
    
    String getBorderColor();
    }
    
    class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;
    
    public Circle(double radius, String fillColor, String borderColor) {
    this.radius = radius;
    this.fillColor = fillColor;
    this.borderColor = borderColor;
    }
    
    public double calcPerimeter() {
    return 2 * Math.PI * radius;
    }

    public double calcArea() {
    return Math.PI * radius * radius;
    }
 
    public String getFillColor() {
    return fillColor;
    }
  
    public String getBorderColor() {
    return borderColor;
    }
    }
    
    class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;
    
    public Rectangle(double width, double height, String fillColor, String borderColor) {
    this.width = width;
    this.height = height;
    this.fillColor = fillColor;
    this.borderColor = borderColor;
    }

    public double calcPerimeter() {
    return 2 * (width + height);
    }

    public double calcArea() {
    return width * height;
    }
    
    public String getFillColor() {
    return fillColor;
    }
  
    public String getBorderColor() {
    return borderColor;
    }
    }
    
    class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;
    private String fillColor;
    private String borderColor;
    
    public Triangle(double side1, double side2, double side3, String fillColor, String borderColor) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    this.fillColor = fillColor;
    this.borderColor = borderColor;
    }

    public double calcPerimeter() {
    return side1 + side2 + side3;
    }

    public double calcArea() {
    double s = calcPerimeter() / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
 
    public String getFillColor() {
    return fillColor;
    }

    public String getBorderColor() {
    return borderColor;
    }
    }
    
    public class Main {
    public static void main(String[] args) {
    Circle circle = new Circle(3, "Черный", "Желтый");
    System.out.println("Периметр круга: " + circle.calcPerimeter());
    System.out.println("Площадь круга: " + circle.calcArea());
    System.out.println("Цвет заливки круга: " + circle.getFillColor());
    System.out.println("Цвет границы круга: " + circle.getBorderColor());
    
    Rectangle rectangle = new Rectangle(5, 7, "Красный", "Зеленый");
    System.out.println("Периметр прямоугольника: " + rectangle.calcPerimeter());
    System.out.println("Площадь прямоугольника: " + rectangle.calcArea());
    System.out.println("Цвет заливки прямоугольника: " + rectangle.getFillColor());
    System.out.println("Цвет границы прямоугольника: " + rectangle.getBorderColor());
    
    Triangle triangle = new Triangle(3, 4, 6, "Розовый", "Синий");
    System.out.println("Периметр треугольника: " + triangle.calcPerimeter());
    System.out.println("Площадь треугольника: " + triangle.calcArea());
    System.out.println("Цвет заливки треугольника: " + triangle.getFillColor());
    System.out.println("Цвет границы треугольника: " + triangle.getBorderColor());
    }
    }