package lista2.exe2;

public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;
    
    // CONSTRUTORES
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.setNumeroAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    public Aluno() {
    }
    
    // GETTERS
    public int getNumeroAluno() {
        return numeroAluno;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }
    
    // SETTERS
    public final void setNumeroAluno(int numeroAluno) {
        String numAlunoStr = Integer.toString(numeroAluno);
        if (numAlunoStr.length() == 6){
            this.numeroAluno = numeroAluno;
        } else {
            System.out.println("O número do aluno é inválido!");
        }
    }

    public final void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        } else {
            System.out.println("O nome excede o limite de 30 caracteres");
        }
    }

    public final void setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
        } else {
            System.out.println("Idade inválida, por favor digite um número inteiro positivo");
        }
    }
    
    public final void setP1(float p1) {
        if(p1 >= 0){
            this.p1 = p1;
        } else {
            System.out.println("Nota inválida, por favor digite um número positivo");
        }
    }
    
    public final void setP2(float p2) {
        if(p2 >= 0){
            this.p2 = p2;
        } else {
            System.out.println("Nota inválida, por favor digite um número positivo");
        }
    }
    
    // METODOS
    public void notaFinal(){
        float media = (p1 + p2)/2;
        System.out.println("A média do aluno é: " + media);
    }
    
    @Override
    public String toString(){
        return "Aluno{" + "Número do aluno: " + numeroAluno + ", Nome do aluno: " + nome + ", Idade: " + idade + "}";
    }
    
}
