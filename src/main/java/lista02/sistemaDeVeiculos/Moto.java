package lista02.sistemaDeVeiculos;

public class Moto extends VeiculoMotorizado {
    @Override
    public float calcularCusto() {
        return this.getPrecoBase() * this.getFatorFixo();
    }
}
