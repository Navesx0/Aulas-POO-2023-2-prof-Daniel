/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fatecfranca.lista1;

import javax.swing.JOptionPane;

public class Lista1 {

    public static void main(String[] args) {
        // cria os objetos da classe Produto
        // () indica a chamada de um método, especial chamado construtor
        // método tem o mesmo nome da classe 
        Produto obj1 = new Produto(1, "bolacha", "recheada com chocolate", 30, false, 3.20f);
        // toda classe em Java recebe um pacote chamado 
        // java.lang, que possui várias classes
        System.out.println("Id: " + obj1.id + "\n Nome " + 
            obj1.nome + "\n Descrição " + obj1.descricao +
            "\n Qtde: " +obj1.qtde + "\n Preço " + obj1.preco);
        
        obj1.mostraObjeto();
        obj1.comprar(3);
        obj1.vender(10);
        obj1.mostraObjeto();
        
        Produto obj2 = new Produto(2, "sorvete", "sabor baunilha", 
                        12, true, 6.80f);
        // toda classe em Java recebe um pacote chamado 
        // java.lang, que possui várias classes
        System.out.println("Id: " + obj2.id + "\n Nome " + 
            obj2.nome + "\n Descrição " + obj2.descricao +
            "\n Qtde: " +obj2.qtde + "\n Preço " + obj2.preco);
        
        obj2.mostraObjeto();
        
        JOptionPane.showMessageDialog(null, 
           "Id: " + obj2.id + "\n Nome " + obj2.nome + "\n Descrição " + 
           obj2.descricao + "\n Qtde: " +obj2.qtde + "\n Preço " + obj2.preco);
        
        Produto obj3 = new Produto();
    }
    
    // crie um metodo para compar um produto. O valor a ser comprado deve ser passado como parametro.
    
    
}
