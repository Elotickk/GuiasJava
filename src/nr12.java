import java.util.Scanner;

public class nr12 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double num1 = 0;
            double num2 = 0;

            System.out.println("Ingrese un numero");
            num1 = Teclado.nextInt();
            
            System.out.println("Ingrese un numero");
            num2 = Teclado.nextInt();
            
            double multi = num1 * num2;

            if( multi > 100 ){

                double resultado = (multi * 10) / 100;
                System.out.println("El 10% del resultado de la multiplicacion es " + resultado);
            }
            else{
                
                double resultado2 = (multi * 5) / 100;
                System.out.println("El 5% del resultado de la multiplicacion es " + resultado2);
            }
        }
    }
}
