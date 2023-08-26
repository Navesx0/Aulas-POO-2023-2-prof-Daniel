package fatecfranca.ex4;

public class TestaRio {
    public static void main(String[] args) {
        Rio rio1 = new Rio("Amazonas", 10.5f, false);
        rio1.chover(2.3f);
        rio1.ensolarar(1.1f);
        rio1.sujar();
        System.out.println(rio1.mostra());
        
        Rio rio2 = new Rio ();
        
        rio2.nome="Sapucai";
        rio2.nivel=1f;
        rio2.poluido=true;
        
        rio2.chover(1.9f);
        rio2.ensolarar(3.1f);
        rio2.limpar();
        System.out.println(rio2.mostra());
    }
}
