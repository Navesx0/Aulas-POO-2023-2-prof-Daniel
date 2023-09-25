package lista2.exe2;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(123456, "João", 18, 8.5f, 9.0f);
        
        System.out.println(aluno1.toString()); // Imprime os dados do aluno
        aluno1.notaFinal(); // Calcula e imprime a média final do aluno
        
        Aluno aluno2 = new Aluno();
        
        aluno2.setNome("Daniel");
        aluno2.setIdade(28);
        aluno2.setP1(9.9f);
        aluno2.setP2(10f);
        
        System.out.println(aluno2.toString());
        aluno2.notaFinal();
    }
}