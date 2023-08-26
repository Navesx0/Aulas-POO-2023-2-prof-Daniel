package fatecfranca.ex4;

public class Rio {
    String nome;
    float nivel;
    boolean poluido;

    // Construtor sem parâmetros
    public Rio() {
    }

    // Construtor com parâmetros
    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    // Método para aumentar o nível do rio
    public void chover(float quantidade) {
        nivel += quantidade;
    }

    // Método para diminuir o nível do rio
    public void ensolarar(float quantidade) {
        nivel -= quantidade;
        if (nivel < 0) {
            nivel = 0;
        }
    }

    // Método para limpar o rio
    public void limpar() {
        poluido = false;
    }

    // Método para poluir o rio
    public void sujar() {
        poluido = true;
    }

    // Método para mostrar informações do rio
    public String mostra() {
        return "Nome do rio: " + nome + " \n Nível do rio: " + nivel + "\n Rio poluído? " + (poluido ? "Sim" : "Não");
    }
}

