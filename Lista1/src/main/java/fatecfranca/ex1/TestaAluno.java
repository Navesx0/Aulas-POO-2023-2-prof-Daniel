package fatecfranca.ex1;

public class TestaAluno {
    public static void main(String[] args) {
        // instanciar um aluno sem valores iniciais
        Aluno obj1 = new Aluno ();
        // instanciar um Aluno com valores iniciais
        Aluno obj2 = new Aluno(123, "Pedro", 18, 6f, 8.5f);
        // Mostra os dados dos objetos
        
        System.out.println(obj1.passou());
        System.out.println(obj2.passou());
               
               
//        Aluno aluno1 = new Aluno (123987, "Leonardo", 25, 7f, 9f);        
//       // -------- sout + tab escreve --->  System.out.println("");
//       aluno1.notaFinal();
//       aluno1.dadosAluno();
//       aluno1.passou();
    }
}
