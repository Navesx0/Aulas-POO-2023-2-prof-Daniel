package lista2.exe0;

public class Pc {
    private String marca, modelo;
    private String processador;
    private int ram, disco;
    //-------------------------- Construtores ----------------------------------
    public Pc(String marca, String modelo, String processador, int ram, int disco){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setProcessador(processador);
        this.setRam(ram);
        this.setDisco(disco);
    }
    
    public Pc(){
    }
    //------------------------ Setters -----------------------------------------
    public final void setMarca(String marca){
        this.marca = marca;
    }
    public final void setModelo(String modelo){
        this.modelo = modelo;
    }
    public final void setProcessador(String processador){
        this.processador = processador;
    }
    public final void setRam(int ram){
        if((ram > 0) && (ram % 2 == 0)){
           this.ram = ram;
        } else {
            System.out.println("Ram invalida. Valor 0 atribuido para ela");
            this.ram = 0;
        }
    }     
    public final void setDisco(int disco){
        if (disco % 128 == 0){
            this.disco = disco;
        } else {
            this.disco = 0;
        }
    }
    //---------------------------- Getters -------------------------------------
    public int getRam(){
        return this.ram;
    }
    public int getDisco(){
        return this.disco;
    }
    public String getProcessador(){
        return this.processador;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    @Override
    public String toString(){
        return "Marca: " + this.marca + " Modelo: " + this.modelo + " Processador " + this.processador + " Ram " + this.ram + " Disco: " + this.disco;
    }
}

