package atividadeAvaliativa01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class InvestimentoTest {
    Investimento investimento;

    @BeforeEach
    void setUp() {
        investimento = new Investimento();
    }

    @Test
    void deveInserirValor() {
        investimento.setValor(1.0f);
        assertEquals(1.0f, investimento.getValor());
    }

    @Test
    void naoDeveInserirValor() {
        try {
            investimento.setValor(-0.01f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro, valor negativo!", e.getMessage());
        }
    }

    @Test
    void deveInvestir() {
        investimento.setValor(1.0f);
        investimento.investir();
        assertEquals(1.0f, investimento.getSaldo());
    }

    @Test
    void deveResgatar() {
        investimento.setValor(1000.0f);
        investimento.investir();
        investimento.setValor(100.0f);
        investimento.resgatar();
        assertEquals(899.0f, investimento.getSaldo());
    }
}