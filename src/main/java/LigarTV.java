public class LigarTV implements Operacao {
    private ControleRemoto controleRemoto;

    public LigarTV(ControleRemoto controleRemoto) {
        this.controleRemoto = controleRemoto;
    }

    @Override
    public void realizar() {
        controleRemoto.ligarTV();
    }
}