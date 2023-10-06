package atividadeAvaliativa01;

public class Investimento extends CarteiraInvestimento {
    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Erro, valor negativo!");
        }
        this.valor = valor;
    }

    @Override
    public void investir() {
        this.setSaldo(this.valor);
    }

    @Override
    public void resgatar() {
        if (this.getSaldo() < this.getValor()) {
            throw new IllegalArgumentException("Erro, nao ha saldo!");
        }
        float resgate = -(this.valor + this.valor * 0.01f);
        this.setSaldo(resgate);
    }
}
