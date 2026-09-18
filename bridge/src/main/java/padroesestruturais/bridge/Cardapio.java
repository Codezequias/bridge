package padroesestruturais.bridge;

public abstract class Cardapio {

    protected TipoRefeicao tipoRefeicao;

    protected float precoBase;

    public Cardapio(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setTipoRefeicao(TipoRefeicao tipoRefeicao) {
        this.tipoRefeicao = tipoRefeicao;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}
