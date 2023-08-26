package fatecfranca.lista1;

public class ZZZcondicionalCase2 {
    public static void main(String[] args){
        //Declaração de variavel
        String dia = "Seguna";
    
        //Processamento e saida de dados
        switch (dia) {
            case "Segunda" -> System.out.println("Hoje é Segunda-Feira");
            case "Terça" -> System.out.println("Hoje é Terça-Feira");
            case "Quarta" -> System.out.println("Hoje é Quarta-Feira");
            case "Quinta" -> System.out.println("Hoje é Quinta-Feira");
            case "Sexta" -> System.out.println("Hoje é Sexta-feira");
            case "Sabado" -> System.out.println("Hoje é Sabado");
            case "Domingo" -> System.out.println("Hoje é domingo");
            default -> System.out.println("ERRO!! Dia não reconhecido");
        }
        
    }
}
