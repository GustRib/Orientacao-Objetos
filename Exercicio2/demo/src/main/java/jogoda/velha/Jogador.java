package jogoda.velha;

public class Jogador {
    //Atributos
    private int id;
    private String tipo;
    private boolean jogaAutomaticamente;

    
    
    // Construtor
    public Jogador(int id) {
        this.id = id;
        
        if (id == 1) {
            this.tipo = "Jogador 1";
            this.jogaAutomaticamente = false;
        } else if (id == 2) {
            this.tipo = "Jogador 2";
            this.jogaAutomaticamente = false;
        } else if (id == 3) {
            this.tipo = "Máquina";
            this.jogaAutomaticamente = true;
        }
    }

    //Métodos Especiais
    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isJogaAutomaticamente() {
        return jogaAutomaticamente;
    }
    
    public void setJogaAutomaticamente(boolean jogaAutomaticamente) {
        this.jogaAutomaticamente = jogaAutomaticamente;
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Joga automaticamente: " + (jogaAutomaticamente ? "Sim" : "Não"));
    }
}
