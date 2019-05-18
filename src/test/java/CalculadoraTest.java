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
    @DisplayName("Homem, 22 anos, 1.8 de altura, 40kg; Baixo Peso Muito Grave")
    void test1() {
        String result = calculadora.calcula("M", 22, 1.8, 40);
        Assertions.assertEquals(GrauObesidade.BaixoPesoMuitoGrave.name(), result);
    }

    @Test
    @DisplayName("Homem, 22 anos, 1.8 de altura, 55kg; Baixo Peso Grave")
    void test2() {
        String result = calculadora.calcula("M", 22, 1.8, 55);
        Assertions.assertEquals(GrauObesidade.BaixoPesoGrave.name(), result);
    }

    @Test
    @DisplayName("Homem, 22 anos, 1.8 de altura, kg; Baixo Peso")
    void test3() {
        String result = calculadora.calcula("M", 22, 1.8, 58);
        Assertions.assertEquals(GrauObesidade.BaixoPeso.name(), result);
    }

    @Test
    @DisplayName("Homem, 22 anos, 1.8 de altura, 65kg; Peso Normal")
    void test4() {
        String result = calculadora.calcula("M", 22, 1.8, 65);
        Assertions.assertEquals(GrauObesidade.PesoNormal.name(), result);
    }

    @Test
    @DisplayName("Homem, 22 anos, 1.8 de altura, 85kg; Peso Normal")
    void test5() {
        String result = calculadora.calcula("M", 22, 1.8, 85);
        Assertions.assertEquals(GrauObesidade.Sobrepeso.name(), result);
    }

    @Test
    @DisplayName("Homem, 22 anos, 1.8 de altura, 100kg; Obesidade Grau I")
    void test6() {
        String result = calculadora.calcula("M", 22, 1.8, 100);
        Assertions.assertEquals(GrauObesidade.ObesidadeGrauI.name(), result);
    }

    @Test
    @DisplayName("Homem, 22 anos, 1.8 de altura, 115kg; Obesidade Grau II")
    void test7() {
        String result = calculadora.calcula("M", 22, 1.8, 115);
        Assertions.assertEquals(GrauObesidade.ObesidadeGrauII.name(), result);
    }

    @Test
    @DisplayName("Homem, 22 anos, 1.8 de altura, 135kg; Obesidade Grau III")
    void test8() {
        String result = calculadora.calcula("M", 22, 1.8, 135);
        Assertions.assertEquals(GrauObesidade.ObesidadeGrauIII.name(), result);
    }

    @Test
    @DisplayName("Sexo S; Sexo inválido")
    void test9() {
        String result = calculadora.calcula("S", 22, 1.8, 135);
        Assertions.assertEquals("Sexo inválido", result);
    }

    @Test
    @DisplayName("Homem; 12 anos; 1.5 de altura; 40kg; Peso normal")
    void test10() {
        String result = calculadora.calcula("M", 12, 1.5, 40);
        Assertions.assertEquals(GrauObesidade.PesoNormal.name(), result);
    }

    @Test
    @DisplayName("Homem; 12 anos; 1.5 de altura; 50kg; Sobrepeso")
    void test11() {
        String result = calculadora.calcula("M", 12, 1.5, 50);
        Assertions.assertEquals(GrauObesidade.Sobrepeso.name(), result);
    }

    @Test
    @DisplayName("Homem; 12 anos; 1.5 de altura; 30kg; Baixo peso")
    void test12() {
        String result = calculadora.calcula("M", 12, 1.5, 30);
        Assertions.assertEquals(GrauObesidade.BaixoPeso.name(), result);
    }

}
