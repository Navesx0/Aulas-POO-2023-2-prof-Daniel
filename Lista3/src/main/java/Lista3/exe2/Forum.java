package Lista3.exe2;

import java.util.ArrayList;

public class Forum {
    private int id;
    private ArrayList<Mensage> mensage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Mensage> getMensage() {
        return mensage;
    }

    public void setMensage(ArrayList<Mensage> mensage) {
        this.mensage = mensage;
    }
    
    public Forum() {
        this.mensage = new ArrayList();
    }

    public Forum(int id, ArrayList<Mensage> mensage) {
        this.id = id;
        this.mensage = mensage;
    }
    
    public String addMensage(Mensage mensage){
        this.mensage.add(mensage); 
        return null;
    }
    
        @Override
    public String toString() {
        // carItens irá percorer o vetor e chamar o toString
        return "Forum{" + "id=" + id + ", mensage=" + mensage + '}';
    }
}
