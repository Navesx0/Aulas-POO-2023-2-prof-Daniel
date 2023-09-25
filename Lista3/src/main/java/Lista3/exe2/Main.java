package Lista3.exe2;

public class Main {
    public static void main(String[] args) {
        // Cria um produto
        Person objPers1 = new Person("Fabio", "fabio_rorô");

        Mensage objTxt1 = new Mensage("O talarico vai mudar o mundo by: ", objPers1);

        
//           System.out.println(objCI1.toString());
//           System.out.println(objCI2.toString());
        Forum objForum = new Forum();
        objForum.setId(1337);
        objForum.addMensage(objTxt1);
        System.out.println(objForum.toString());
        
    }
}
