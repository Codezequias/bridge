package padroesestruturais.bridge;

public class CardapioExecutivo extends Cardapio {

    public CardapioExecutivo(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase * (1 + this.tipoRefeicao.percentualAcrescimo());
    }

}
