
public class Calculadora {
    
    // Métodos para suma
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public double sumar(double a, double b) {
        return a + b;
    }
    
    // Métodos para resta
    public int restar(int a, int b) {
        return a - b;
    }
    
    public double restar(double a, double b) {
        return a - b;
    }
    
    // Métodos para multiplicación
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    // Métodos para división
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
    
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}
