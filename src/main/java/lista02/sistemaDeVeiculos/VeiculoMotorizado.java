package lista02.sistemaDeVeiculos;

public abstract class VeiculoMotorizado extends Veiculo{
    private float fatorFixo;

    public VeiculoMotorizado() {
        this.fatorFixo = 1.0f;
    }

    public float getFatorFixo() {
        return fatorFixo;
    }

    public void setFatorFixo(float fatorFixo) {
        this.fatorFixo = fatorFixo;
    }
}
