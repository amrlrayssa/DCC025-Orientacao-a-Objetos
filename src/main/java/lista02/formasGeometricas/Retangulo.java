package lista02.formasGeometricas;

public class Retangulo extends FormaGeometrica {
    private float altura;
    private float largura;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("Altura invalida");
        }
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        if (largura < 0) {
            throw new IllegalArgumentException("Largura invalida");
        }
        this.largura = largura;
    }

    public float calcularArea() {
        return this.largura * this.altura;
    }

    public float calcularPerimetro() {
        return 2 * (this.largura + this.altura);
    }
}
