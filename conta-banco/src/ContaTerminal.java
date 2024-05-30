import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá,Bem vindo, ao XPTO Bank");


        System.out.println("Por favor, digite o seu nome");
        String nome = Scanner.next();

//        String sobrenome = Scanner.next();

        System.out.println("Por favor, digite o número da sua agencia");
        String agencia = Scanner.next();

        System.out.println("Digite por favor o número da sua conta");
        int conta = Scanner.nextInt();

        double saldo = 1500.00;


        System.out.println("Olá, " + nome + " obrigado por retornar ao XPTO Bank, " + "sua agência é: " + agencia +
                " a conta é, " + conta + " e o saldo disponível é de: R$" + saldo);


    }
}

