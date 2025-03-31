// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {

    Calculadora calc = new Calculadora();

    System.out.println("Suma de enteros: " + calc.sumar(5, 3));
    System.out.println("Suma de decimales: " + calc.sumar(5.5, 3.3));
    System.out.println("Resta de enteros: " + calc.restar(10, 4));
    System.out.println("Multiplicación de enteros: " + calc.multiplicar(6, 7));
    System.out.println("División de enteros: " + calc.dividir(10, 2));

    // Manejo de excepciones en división por cero
    try {
      System.out.println("División por cero: " + calc.dividir(5, 0));
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

}