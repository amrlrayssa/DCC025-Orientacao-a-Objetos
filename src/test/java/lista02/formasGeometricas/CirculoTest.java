package lista02.formasGeometricas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CirculoTest {

    Circulo circulo;

    @BeforeEach
    void setUp() {
        circulo = new Circulo();
    }

    @Test
    void deveRetornarRaioValido() {
        circulo.setRaio(2);
        assertEquals(2, circulo.getRaio());
    }

    @Test
    void deveRetornarRaioInvalido() {
        try {
            circulo.setRaio(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Raio invalido", e.getMessage());
        }
    }

    @Test
    void deveCalcularArea() {
        circulo.setRaio(2);
        assertEquals(12.566f, circulo.calcularArea());
    }

    @Test
    void deveCalcularPerimetro() {
        circulo.setRaio(2);
        assertEquals(12.566f, circulo.calcularPerimetro());
    }
}