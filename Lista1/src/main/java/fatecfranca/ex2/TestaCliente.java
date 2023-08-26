package fatecfranca.ex2;

public class TestaCliente {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, 123, "Fulano", 0f);
        
        cliente1.retornaInfo();
        
        cliente1.realizarDeposito(732);
        cliente1.realizarSaque(132);
        
        Cliente cliente2 = new Cliente(2, 123, "Beltrano", 700f);
        
        cliente2.retornaInfo();
        cliente2.realizarSaque(300);
        cliente2.realizarDeposito(600); 
    }
    
}
