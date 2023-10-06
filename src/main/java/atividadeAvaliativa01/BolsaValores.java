package atividadeAvaliativa01;

public class BolsaValores extends CarteiraInvestimento {
    private float valorInvestir;
    private float valorResgatar;
    /* Esse valor nao esta na classe abstrata, porque na classe BolsaValores nao se pode investir
    um valor menos que a taxa */

    public float getValorInvestir() {
        return valorInvestir;
    }

    public void setValorInvestir(float valorInvestir) {
        if (valorInvestir < 50.0f) {
            throw new IllegalArgumentException("Erro, valor menor que a taxa!");
        }
        this.valorInvestir = valorInvestir;
    }

    public float getValorResgatar() {
        return valorResgatar;
    }

    public void setValorResgatar(float valorResgatar) {
        if (valorResgatar < 0) {
            throw new IllegalArgumentException("Erro, valor negativo!");
        }
        this.valorResgatar = valorResgatar;
    }

    @Override
    public void investir() {
        this.setSaldo(-50.00f);
        this.setSaldo(this.valorInvestir);
    }

    @Override
    public void resgatar() {
        if (this.getSaldo() < this.getValorResgatar()) {
            throw new IllegalArgumentException("Erro, nao ha saldo!");
        }
        this.setSaldo(-this.valorResgatar);
    }
}
