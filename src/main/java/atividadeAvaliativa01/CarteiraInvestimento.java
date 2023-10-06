package atividadeAvaliativa01;

public abstract class CarteiraInvestimento {
    private int numeroCarteira;
    private float saldo;

    public int getNumeroCarteira() {
        return numeroCarteira;
    }

    public void setNumeroCarteira(int numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }

    public float getSaldo() {
        return saldo;
    }

    protected void setSaldo(float saldo) {
        this.saldo += saldo; // O saldo += para poder atualizar os valores
        // O metodo eh protegido para o usuario nao poder setar um valor e burlar o investir
    }

    public abstract void investir();
    public abstract void resgatar();
}
