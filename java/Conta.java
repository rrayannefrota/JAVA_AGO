package java;
public class Conta {
    public String titular;
    public int numero;
    public String agencia;
    public double saldo;
    public String dataAbertura;

    public boolean saca(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor);
            return false;
        }
    }

    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido: " + valor);
        }
    }

    public double calculaRendimento() {
        return saldo * 0.1;
    }

    public String recuperaDadosParaImpressao() {
        return  "Titular: " + titular + "\n" +
                "Número: " + numero + "\n" +
                "Agência: " + agencia + "\n" +
                "Saldo: " + saldo + "\n" +
                "Data Abertura: " + dataAbertura;
    }
}


