package padroesestruturais.bridge;

public class CardapioComum extends Cardapio {

    public CardapioComum(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase;
    }
}
