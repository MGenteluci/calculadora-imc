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

        if (imc < 16) return GrauObesidade.BaixoPesoMuitoGrave.name();
        if (imc <= 16.99) return GrauObesidade.BaixoPesoGrave.name();
        if (imc <= 18.49) return GrauObesidade.BaixoPeso.name();
        if (imc <= 24.99) return GrauObesidade.PesoNormal.name();
        if (imc <= 29.99) return GrauObesidade.Sobrepeso.name();
        if (imc <= 34.99) return GrauObesidade.ObesidadeGrauI.name();
        if (imc <= 39.99) return GrauObesidade.ObesidadeGrauII.name();
        return GrauObesidade.ObesidadeGrauIII.name();
    }
}
