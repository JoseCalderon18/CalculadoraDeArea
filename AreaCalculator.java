public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Calculadora de área para diferentes figuras.");

        double radius = 20.5;
        System.out.println("El área del círculo con radio " + radius + " es: " + circleArea(radius));

        double length = 10.8, width = 5.0;
        System.out.println("El área del rectángulo con longitud " + length + " y ancho " + width + " es: "
                + rectangleArea(length, width));

        double base = 16.5, height = 8.2;
        System.out.println("El área del triángulo con base " + base + " y altura " + height + " es: "
                + triangleArea(base, height));

    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Añadir métodos para calcular el área de un rectángulo y un triángulo

    // Estudiante A: Jose Calderón
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    // Estudiante B: Miguel Ortega
    public static double triangleArea(double base, double height) {
        return (base * height) / 2;
    }

}
