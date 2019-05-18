public class Calculadora {

    public String calcula(String sexo, int idade, double altura, double peso) {
        Pessoa pessoa = new Pessoa(sexo, idade, altura, peso);
        return pessoa.calculaImc();
    }

}
