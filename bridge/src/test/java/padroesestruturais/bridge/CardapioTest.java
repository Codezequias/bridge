package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CardapioTest {

    @Test
    void deveCalcularPrecoCardapioComumTradicional() {
        Cardapio cardapio = new CardapioComum(50.0f);
        cardapio.setTipoRefeicao(new RefeicaoTradicional());
        assertEquals(50.0f, cardapio.calcularPreco(), 0.001f);
    }

    @Test
    void deveCalcularPrecoCardapioComumPremium() {
        Cardapio cardapio = new CardapioComum(50.0f);
        cardapio.setTipoRefeicao(new RefeicaoPremium());
        assertEquals(50.0f, cardapio.calcularPreco(), 0.001f);
    }

    @Test
    void deveCalcularPrecoCardapioExecutivoTradicional() {
        Cardapio cardapio = new CardapioExecutivo(50.0f);
        cardapio.setTipoRefeicao(new RefeicaoTradicional());
        assertEquals(50.0f, cardapio.calcularPreco(), 0.001f);
    }

    @Test
    void deveCalcularPrecoCardapioExecutivoPremium() {
        Cardapio cardapio = new CardapioExecutivo(50.0f);
        cardapio.setTipoRefeicao(new RefeicaoPremium());
        assertEquals(55.0f, cardapio.calcularPreco(), 0.001f);
    }

    @Test
    void deveTrocarTipoRefeicaoDoMesmoCardapioExecutivo() {
        Cardapio cardapio = new CardapioExecutivo(50.0f);
        cardapio.setTipoRefeicao(new RefeicaoTradicional());
        assertEquals(50.0f, cardapio.calcularPreco(), 0.001f);
        cardapio.setTipoRefeicao(new RefeicaoPremium());
        assertEquals(55.0f, cardapio.calcularPreco(), 0.001f);
    }

    @Test
    void deveAtualizarPrecoBaseCardapioExecutivo() {
        Cardapio cardapio = new CardapioExecutivo(50.0f);
        cardapio.setTipoRefeicao(new RefeicaoPremium());
        cardapio.setPrecoBase(100.0f);
        assertEquals(110.0f, cardapio.calcularPreco(), 0.001f);
    }
}
