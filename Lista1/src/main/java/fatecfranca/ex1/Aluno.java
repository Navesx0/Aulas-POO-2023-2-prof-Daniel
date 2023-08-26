package fatecfranca.ex1;

public class Aluno {
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;
    public float media;
    
    // Costrutor com parâmetro
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
        this.media = media;
    }
    // Construtor sem parâmetro
    public Aluno (){
        
    }
    
    // Métodos
    public float notaFinal(){
        this.media = (this.p1 + this.p2)/ 2;
        System.out.println("A média do aluno é: " + this.media);
        return media;
    }

    public String dadosAluno(){
        return "Número: " + this.numeroAluno + "\n Nome: " + this.nome + " \nIdade: " + this.idade + "\n foi" + this.passou();
//        System.out.println("O número do anluno é: " + this.numeroAluno);
//        System.out.println("O nome do anluno é: " + this.nome);               utilizar o metodo de Sout pode acarretar problemas ao desenvolver para dispositivos mobile
//        System.out.println("A idade do anluno é: " + this.idade);
    }

    public String passou(){
        if(this.media >= 6){
            return "Aluno aprovado!";
        } else {
            return "Aluno reprovado!";
        }
        
//    public String passou(){
//        retunr (this.notaFinal() >= 6) ? "Aprovado" : "Reprovado";
//    }
    }
}
