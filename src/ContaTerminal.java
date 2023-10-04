public class ContaTerminal {
    private int numero;
    private String agencia;
    private String cliente;
    private Double saldo;


    public ContaTerminal(int numero, String agencia, String cliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
    }    


    public int getNumero() {
        return this.numero;
    }

    public String getAgencia() {
        return this.agencia;
    }
   

    public String getCliente() {
        return this.cliente;
    }

    
    public Double getSaldo() {
        return this.saldo;
    }

   

    @Override
    public String toString() {
        return "Olá "+ getCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + getAgencia() + ", conta "+ getNumero() +" e seu saldo "+ getSaldo() +" já está disponível para saque";
    }

}
