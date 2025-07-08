public class AConta {
    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private String abertura;

    private static final double TAXA_RENDIMENTO = 0.005;
    
    
    public AConta(String nomeTitular, int numero, String agencia, double saldoInicial, String abertura) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldoInicial;
        this.abertura = abertura;
    }
    
   
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
   
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
    
   
    public double calculaRendimento() {
        return saldo * TAXA_RENDIMENTO;
    }
    
   
    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getAbertura() {
        return abertura;
    }
}