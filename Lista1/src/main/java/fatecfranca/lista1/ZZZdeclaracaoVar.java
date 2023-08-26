package fatecfranca.lista1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonardo
 */
public class ZZZdeclaracaoVar {
    public static void main(String[] args){
    //declarando variaveis
    int quantidade = 35; // declaraçao inicialização da variavel quantidade com o valor de 30 
    double salario; // Declaração de variável de ponto flutuante (número decimal)
    String nome; // Declaração do tipo String (teto)
    boolean ativo; // Declaração de uma variável booeana (armazena true ou false)
    
    // A partir do JDK 10 o Java introduziu a inferência de tipo var, permitindo que o tipo de variável seja inferido pelo compilador:
    var idade = 25; // O tipo da variável idade é inferido como int
    var preco = 29.99; // O tipo da variável preco é inferido como double
    }
}
