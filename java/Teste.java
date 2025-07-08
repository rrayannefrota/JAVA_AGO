package java;
public class Teste {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.titular = "Maria Silva";
        c1.numero = 1001;
        c1.agencia = "0001-SP";
        c1.saldo = 1000.0;
        c1.dataAbertura = "05/07/2025";

        System.out.println("=== Conta c1 antes das operações ===");
        System.out.println(c1.recuperaDadosParaImpressao());

        c1.saca(200.0);
        c1.deposita(500.0);

        System.out.println("\nSaldo após saque e depósito: " + c1.saldo);
        System.out.println("Rendimento mensal: " + c1.calculaRendimento());

        Conta c2 = new Conta();
        c2.titular = "Danilo";
        c2.saldo   = 100.0;

        Conta c3 = new Conta();
        c3.titular = "Danilo";
        c3.saldo   = 100.0;

        System.out.print("\nComparando c2 e c3 (objetos distintos): ");
        if (c2 == c3) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

        Conta c4 = new Conta();
        c4.titular = "Hugo";
        c4.saldo   = 100.0;

        Conta c5 = c4;

        System.out.print("Comparando c4 e c5: ");
        if (c4 == c5) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
    }
}