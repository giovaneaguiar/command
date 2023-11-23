public class DesligarTV implements Operacao {
    private ControleRemoto controleRemoto;

    public DesligarTV(ControleRemoto controleRemoto) {
        this.controleRemoto = controleRemoto;
    }

    @Override
    public void realizar() {
        controleRemoto.desligarTV();
    }
}