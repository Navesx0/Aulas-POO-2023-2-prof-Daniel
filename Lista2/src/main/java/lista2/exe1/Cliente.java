package lista2.exe1;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;
    // ---------------------------- CONSTRUTORES ------------------------------
    public Cliente( String numeroConta, String numeroAgencia, String nome, float saldo){
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    
    public Cliente(){
    } 
    //----------------------------- SETTERS -----------------------------------
    public final void setNumeroConta(String numeroConta){
        if(numeroConta.length() == 8 && numeroConta.charAt(6) == '-'){
            this.numeroConta = numeroConta;         
        } else {
            this.numeroConta = "";
            System.out.println("Número de conta inválido.");
        }
    }
    public final void setNumeroAgencia(String numeroAgencia){
        if (numeroAgencia.length() == 6 && numeroAgencia.charAt(4) == '-') {
            this.numeroAgencia = numeroAgencia;
        } else {
            System.out.println("Número de agência inválido.");
        }
    }
    public final void setNome(String nome){
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            this.nome = "";
            System.out.println("Nome do cliente muito longo.");
        }
    }
    public final void setSaldo(float saldo){
        if(this.saldo >= saldo){
            this.saldo = saldo;
        } else {
            System.out.println("O saldo não pode ficar negativo.");
        }
    }
    //---------------------------- GETTERS ------------------------------------
    public String getNumeroConta() {
        return this.numeroConta;
    }

    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public String getNome() {
        return this.nome;
    }

    public float getSaldo() {
        return this.saldo;
    }
    //---------------------------- METODOS -------------------------------------
    public void realizarDeposito(float valor){
        this.setSaldo(this.saldo+ valor);
        System.out.println("Foi realizado o deposito de: "+valor);
    }
    public void realizarSaque(float valor){
        this.setSaldo(this.saldo -valor);
    }

    @Override
    public String toString() {
        return "Cliente{" + "numeroConta=" + numeroConta + ", numeroAgencia=" + numeroAgencia + ", nome=" + nome + ", saldo=" + saldo + '}';
    }

}
