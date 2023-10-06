package lista02.sistemaDeVeiculos;

public class Bicicleta extends Veiculo {
    @Override
    public float calcularCusto() {
        return this.getPrecoBase();
    }
}