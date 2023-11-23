public class ControleRemoto {
    private boolean ligada = false;

    public void ligarTV() {
        ligada = true;
    }

    public void desligarTV() {
        ligada = false;
    }

    public boolean estaLigada() {
        return ligada;
    }
}
