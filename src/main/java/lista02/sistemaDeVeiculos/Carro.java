package lista02.sistemaDeVeiculos;

public class Carro extends VeiculoMotorizado {
    @Override
    public float calcularCusto() {
        return this.getPrecoBase() * this.getFatorFixo();
    }
}
