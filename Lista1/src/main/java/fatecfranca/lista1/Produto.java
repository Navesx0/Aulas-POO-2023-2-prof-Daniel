package fatecfranca.lista1;

public class Produto {
    int id; // int é um tipo de dado primitivo
    String nome; // String é um tipo de dado de Classe
    int qtde; // int é um tipo de dado primitivo
    float preco; // float é um tipo de dado primitivo
    boolean estoqueCritico; // boolean é um tipo de dado primitivo
    String descricao; // String é um tipo de dado de Classe
    // outros exemplo do tipo Classe: Integer, Float, Boolean

    public Produto(int id, String nome, String descricao, int qtde, boolean estoqueCritico, float preco){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.qtde = qtde;
        this.estoqueCritico = estoqueCritico;
        this.preco = preco;
    }
    public Produto(){
    
}
    
    public void mostraObjeto(){
        System.out.println("Id: " + this.id + "\n Nome " + this.nome + "\n Descrição " + this.descricao +
            "\n Qtde: " + this.qtde + "\n Preço " + this.preco + (this.estoqueCritico ? "Sim" : "Não"));
    }
    
    public void comprar(int x){
        this.qtde = this.qtde + x;
        System.out.println("compra realizada com sucesso");
    }
    
    public void vender(int y){
        if(y <= this.qtde){
            this.qtde -= y;
            System.out.println("Vendido");
        } else{
            System.out.println("Estoque insificiente");
        }
    }
    
    public void aumentarPreco(float x){
        this.preco = this.preco + (this.preco*x)/100;
        System.out.println("Aumento realizado com sucesso");
    }
    
    public void diminuirPreco(float x){
        float desconto = (this.preco*x)/100;
        if (desconto <= this.preco){
            this.preco -=desconto;
            System.out.println("Reducao de preço realizado com sucesso");
        }
    }
}
