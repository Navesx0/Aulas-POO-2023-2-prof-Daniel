package fatecfranca.lista1;

public class ZZZcondicionalCase {
    public static void main(String[] args){
        //Declaração de variavel
        String dia = "Seguna";
    
        //Processamento e saida de dados
        switch (dia) {
            case "Segunda":
                System.out.println("Hoje é Segunda-Feira");
            break;
            case "Terça":
                System.out.println("Hoje é Terça-Feira");
            break;
            case "Quarta":
                System.out.println("Hoje é Quarta-Feira");
            break;
            case "Quinta":
                System.out.println("Hoje é Quinta-Feira");
            break;
            case "Sexta":
                System.out.println("Hoje é Sexta-feira");
            break;
            case "Sabado":
                System.out.println("Hoje é Sabado");
            break;
            case "Domingo":
                System.out.println("Hoje é domingo");
            break;
            default:
                System.out.println("ERRO!! Dia não reconhecido");
        }
        
    }
}
