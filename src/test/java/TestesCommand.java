import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class TestesCommand {

    @Test
    void testLigarTV() {
        ControleRemoto controleRemoto = new ControleRemoto();
        LigarTV ligarTV = new LigarTV(controleRemoto);

        ligarTV.realizar();

        assertEquals(true, controleRemoto.estaLigada());
    }

    @Test
    void testDesligarTV() {
        ControleRemoto controleRemoto = new ControleRemoto();
        LigarTV ligarTV = new LigarTV(controleRemoto);
        ligarTV.realizar();

        DesligarTV desligarTV = new DesligarTV(controleRemoto);
        desligarTV.realizar();

        assertEquals(false, controleRemoto.estaLigada());
    }

    @Test
    void testExecutarOperacoes() {
        ControleRemoto controleRemoto = new ControleRemoto();
        LigarTV ligarTV = new LigarTV(controleRemoto);
        DesligarTV desligarTV = new DesligarTV(controleRemoto);

        ControleRemotoInvoker controleInvoker = new ControleRemotoInvoker();
        controleInvoker.adicionarOperacao(ligarTV);
        controleInvoker.adicionarOperacao(desligarTV);

        controleInvoker.executarOperacoes();

        assertEquals(false, controleRemoto.estaLigada());
    }
}
