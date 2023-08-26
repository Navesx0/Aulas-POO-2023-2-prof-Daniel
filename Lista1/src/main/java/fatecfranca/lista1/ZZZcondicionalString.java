package fatecfranca.lista1;
public class ZZZcondicionalString {
    public static void main(String[] args){
        // Declaração de variáveis
        String dia = "Segunda";
        
        // Processamento de dados
        if (dia.equals("Segunda")){
            System.out.println("Hoje é Segunda-Feira");
        } else if (dia.equals("Terça")){
            System.out.println("Hoje é Terça-Feira");
        } else if (dia.equals("Quarta")){
            System.out.println("Hoje é Quarta-Feira");
        } else if (dia.equals("Quinta")){
            System.out.println("Hoje é Quinta-Feira");
        } else if (dia.equals("Sexta")){
            System.out.println("Hoje é Sexta-Feira");
        } else if (dia.equals("Sabado")){
            System.out.println("Hoje é sabado");
        } else if (dia.equals("Domingo")) {
            System.out.println("Hoje é domingo");
        } else {
            System.out.println("ERRO!! Dia não identificado!!");
        }
        
    }
}
