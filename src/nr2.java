import java.util.Scanner;

public class nr2 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {
            double a = 0; // Declaro variable
            double b = 0; // Declaro variable

            System.out.println("Por favor ingrese el valor de A");
            a = Teclado.nextDouble();
            System.out.println("Por favor ingrese el valor de B");
            b = Teclado.nextDouble();

            double suma = a + b;
            double resta = a - b;
            double multi = a * b;
            double div = 0;

            System.out.println("La suma es igual a " + suma);
            System.out.println("La resta es igual a " + resta);
            System.out.println("La multiplicacion es igua a " + multi);

            if (b != 0) {
                div = a / b;
            } else {
                System.out.println("No pude realizar la division porque B = a 0");
            }

            System.out.println("La division es igual a " + div);
        }

    }
}