package GuiaNr1;

import java.util.Scanner;

public class nr5 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double num = 0;

            System.out.println("Ingrese el numero para saber si es par o impar");
            num = Teclado.nextInt();

            double resultado = num % 2;

            if (resultado == 0) {
                System.out.print("El numero es par");
            } else {
                System.out.print("El numero es impar");
            }
        }
    }
}