public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Calculadora de área para diferentes figuras.");
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
