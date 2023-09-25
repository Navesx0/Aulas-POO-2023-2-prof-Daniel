package lista2.exe0;

/**
 *
 * @author Leonardo
 */
public class TestaPC {
    public static void main(String[] args) {
        Pc obj1 = new Pc();
        obj1.setMarca("Lenovo");
        obj1.setModelo("Thinkpad");
        obj1.setRam(16);
        System.out.println("Ram");
        
        System.out.println("Ram" + obj1.getRam());
        
        Pc obj2 = new Pc("Dell", "Vostro 15", "i5", 18, 256);
    }
}
