import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach
    void setup() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Homem, 22 anos, 1.8 de altura, 55kg; IMC deve ser == Magreza")
    void test1() {
        String result = calculadora.calcula("M", 22, 1.8, 55);
        Assertions.assertEquals("Magreza", result);
    }

}
