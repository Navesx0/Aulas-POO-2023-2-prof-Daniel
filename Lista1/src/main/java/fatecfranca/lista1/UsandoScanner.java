package fatecfranca.lista1;
import java.util.Scanner;

public class UsandoScanner {
    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        System.out.println("Digite a altura do retângulo");
        float altura = imput.nextInt();
        System.out.println("Digite a largura do retângulo");
        float largura = imput.nextInt();
        //Saida de dados
        System.out.println("A área do retângulo é: " + (largura*altura));
    }
}
