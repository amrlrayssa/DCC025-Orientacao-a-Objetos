package atividadeAvaliativa01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class BolsaValoresTest {
    BolsaValores bolsaValores;

    @BeforeEach
    void setUp() {
        bolsaValores = new BolsaValores();
    }

    @Test
    void deveInserirValorInvestir() {
        bolsaValores.setValorInvestir(50.0f);
        assertEquals(50.0f, bolsaValores.getValorInvestir());
    }

    @Test
    void naoDeveInserirValorInvestir() {
        try {
            bolsaValores.setValorInvestir(49.9f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro, valor menor que a taxa!", e.getMessage());
        }
    }

    @Test
    void deveInserirValorResgatar() {
        bolsaValores.setValorResgatar(1.0f);
        assertEquals(1.0f, bolsaValores.getValorResgatar());
    }

    @Test
    void naoDeveInserirValorResgatar() {
        try {
            bolsaValores.setValorResgatar(-1.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro, valor negativo!", e.getMessage());
        }
    }

    @Test
    void deveInvestir() {
        bolsaValores.setValorInvestir(51.0f);
        bolsaValores.investir();
        assertEquals(1.0f, bolsaValores.getSaldo());
    }

    @Test
    void deveResgatar() {
        bolsaValores.setValorInvestir(70.0f);
        bolsaValores.investir();
        bolsaValores.setValorResgatar(10.0f);
        bolsaValores.resgatar();
        assertEquals(10.0f, bolsaValores.getSaldo());
    }
}