package lista02.formasGeometricas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    Retangulo retangulo;

    @BeforeEach
    void setUp() {
        retangulo = new Retangulo();
    }

    @Test
    void deveRetornarAlturaValida() {
        retangulo.setAltura(2);
        assertEquals(2, retangulo.getAltura());
    }

    @Test
    void deveRetornarAlturaInvalida() {
        try {
            retangulo.setAltura(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Altura invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarLarguraValida() {
        retangulo.setLargura(2);
        assertEquals(2, retangulo.getLargura());
    }

    @Test
    void deveRetornarLarguraInvalida() {
        try {
            retangulo.setLargura(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Largura invalida", e.getMessage());
        }
    }

    @Test
    void deveCalcularArea() {
        retangulo.setAltura(1.0f);
        retangulo.setLargura(1.0f);
        assertEquals(1.0f, retangulo.calcularArea());
    }

    @Test
    void deveCalcularPerimetro() {
        retangulo.setAltura(1.0f);
        retangulo.setLargura(1.0f);
        assertEquals(4.0f, retangulo.calcularPerimetro());
    }
}