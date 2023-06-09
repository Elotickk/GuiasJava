import java.util.Scanner;

public class nr3 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            int dias = 0;

            System.out.println("Por favor ingrese los dias");
            dias = Teclado.nextInt();

            double segundos = dias * 86400;
            
            System.out.print("Los " + dias + " dias es igual a " + segundos + " segundos");
        }
    }
}