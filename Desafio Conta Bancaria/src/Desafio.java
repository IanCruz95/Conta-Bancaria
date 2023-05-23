import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Nan Cruz";
        String tipoConta = "Poupança";
        double saldo = 1500.00;
        int opcao = 0;

        System.out.println("*******************************");
        System.out.println("\nNome do Cliente: " +  nome);
        System.out.println("tipo da conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n*******************************");

        String menu = """
                    **  Digite Sua Opção  **
                    1 - Consultar Saldo
                    2 - Receber Valor
                    3 - Transferir Valor
                    4 - Sair
                
                 """;
        Scanner leitura = new Scanner(System.in);
         while(opcao != 4){
             System.out.println(menu);
             opcao= leitura.nextInt();


             if (opcao == 1){
                 System.out.println("O Saldo Atual é: " + saldo);
             }
             else if (opcao == 2) {
                 System.out.println("Valor Recebido");
                 double valor = leitura.nextDouble();
                 saldo += valor;
                 System.out.println(" Novo Saldo é: " + saldo);
             } else if (opcao == 3) {
                 System.out.println("Qual O Valor que deseja transferir? ");
                 double valor = leitura.nextDouble();
                 if (valor > saldo) {
                     System.out.println(" Não há saldo para realizar a transferencia");
                 } else {
                     saldo -= valor;
                     System.out.println(" Novo Saldo: " + saldo);
                 }
             }
             else if (opcao != 4){
                     System.out.println("Opcão Invalida");
                 }
             }
         }





    }

