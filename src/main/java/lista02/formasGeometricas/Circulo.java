package lista02.formasGeometricas;

public class Circulo extends FormaGeometrica {
    private float raio;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        if (raio < 0) {
            throw new IllegalArgumentException("Raio invalido");
        }
        this.raio = raio;
    }

    public float calcularArea() {
        return this.raio * this.raio * 3.1415f;
    }

    public float calcularPerimetro() {
        return 2 * 3.1415f * this.raio;
    }
}
