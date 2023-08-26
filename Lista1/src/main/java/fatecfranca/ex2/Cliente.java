package fatecfranca.ex2;

public class Cliente {
    int numeroConta;
    int numeroAgencia;
    String nome;
    float saldo;
    
    //Construtor
    public Cliente (int numeroConta, int numeroAgencia, String nome, float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome= nome;
        this.saldo = saldo;
    }
    
    public void realizarDeposito(float deposito){
        this.saldo += deposito;
        System.out.println("Foi realizado o deposito de: R$"+deposito);
        System.out.println("Saldo atual: R$"+this.saldo);
    }
    public void realizarSaque(float saque){
        this.saldo -= saque;
        System.out.println("Foi realizado o saque de: R$"+saque);
        System.out.println("Saldo atual: R$"+this.saldo);
    }
    public void retornaInfo(){
        System.out.println("Número da conta: "+this.numeroConta);
        System.out.println("Nome do cliente: "+this.nome);
        System.out.println("Saldo atual: "+this.saldo);
    }
    
}
