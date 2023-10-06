package lista02.sistemaDeVeiculos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    Carro carro;
    @BeforeEach
    void setUp() {
        carro = new Carro();
    }

    @Test
    void deveCalcularCusto() {
        Carro carro = new Carro();
        carro.setPrecoBase(30000);
        carro.setFatorFixo(5.0f);
        assertEquals(150000, carro.calcularCusto());
    }
}