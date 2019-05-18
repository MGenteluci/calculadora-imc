public class Pessoa {
    private String sexo;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(String sexo, int idade, double altura, double peso) {
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String calculaImc() {
        double imc =  this.peso / (this.altura * this.altura);

        if (imc < 18.5) return GrauObesidade.Magreza.name();
        if (imc <= 24.9) return GrauObesidade.Normal.name();
        if (imc <= 29.9) return GrauObesidade.Sobrepeso.name();
        if (imc <= 39.9) return GrauObesidade.Obesidade.name();
        return GrauObesidade.ObesidadeGrave.name();
    }
}
