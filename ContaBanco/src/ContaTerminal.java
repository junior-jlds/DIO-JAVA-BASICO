
import java.util.Locale;
import java.util.Scanner;



public class ContaTerminal {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            int numero = 0;

            System.out.println("Por favor, digite a Agencia!");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o Numero da Conta! ");
            numero = scanner.nextInt();
     
            System.out.println("Por favor, digite o Nome do Cliente! ");
            String nomeCliente = scanner.next();

            System.out.println("Por favor, digite o Saldo do Cliente! ");
            Double saldo = scanner.nextDouble();

            System.out.println("Sua Agencia é: " + agencia + ", Sua conta é: " + numero + ", Seu Nome é: " + nomeCliente + ", Seu saldo é: " + saldo);




    }
}
