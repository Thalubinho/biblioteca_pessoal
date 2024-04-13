import java.util.ArrayList;

public class Artigo {
    // atributos subclasse
    private String nomeRevista;
    private ArrayList <String> palavrasChave;

    // construtor
    public Artigo(String nomeRevista, ArrayList<String> palavrasChave) {
        this.nomeRevista = nomeRevista;
        this.palavrasChave = palavrasChave;
    }

    // métodos getters e setters
    public String getNomeRevista() {
        return nomeRevista;
    }
    public void setNomeRevista(String nomeRevista) {
        this.nomeRevista = nomeRevista;
    }
    public ArrayList<String> getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(ArrayList<String> palavrasChave) {
        this.palavrasChave = palavrasChave;
    }
}
