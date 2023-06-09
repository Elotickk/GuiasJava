import java.util.Scanner;

public class nr6 {
    public static void main(String[] args) throws Exception {
        try (Scanner Teclado = new Scanner(System.in)) {

            double pesosArg = 0;
            double dolar  = 223;
            double euro = 229;
            double real = 43;

            System.out.println("Ingrese los pesos Argentinos a pasar a dolares,euro y real");
            pesosArg = Teclado.nextInt();

            double resultadoDolar = pesosArg / dolar;
            double resultadoEuro = pesosArg / euro;
            double resultadoReal = pesosArg / real;

            System.out.println("La cantida de "+ pesosArg +" pesos argentinos a dolares es "+ resultadoDolar);
            System.out.println("La cantida de "+ pesosArg +" pesos argentinos a euro es "+ resultadoEuro);
            System.out.println("La cantida de "+ pesosArg +" pesos argentinos a real es "+ resultadoReal);
        }
    }
}