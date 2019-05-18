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

    private String calculaImcPopulacaoBase(double imc) {
        if (imc < 16) return GrauObesidade.BaixoPesoMuitoGrave.name();
        if (imc <= 16.99) return GrauObesidade.BaixoPesoGrave.name();
        if (imc <= 18.49) return GrauObesidade.BaixoPeso.name();
        if (imc <= 24.99) return GrauObesidade.PesoNormal.name();
        if (imc <= 29.99) return GrauObesidade.Sobrepeso.name();
        if (imc <= 34.99) return GrauObesidade.ObesidadeGrauI.name();
        if (imc <= 39.99) return GrauObesidade.ObesidadeGrauII.name();
        return GrauObesidade.ObesidadeGrauIII.name();
    }

    private String calculaImcMenino(double imc) {
        if (this.idade <= 2) {
            if (imc <= 15) return GrauObesidade.BaixoPeso.name();
            if (imc <= 18) return GrauObesidade.PesoNormal.name();
            if (imc <= 21) return GrauObesidade.Sobrepeso.name();
            return GrauObesidade.ObesidadeGrauI.name();
        }

        if (this.idade <= 4) {
            if (imc <= 14) return GrauObesidade.BaixoPeso.name();
            if (imc <= 17) return GrauObesidade.PesoNormal.name();
            if (imc <= 18) return GrauObesidade.Sobrepeso.name();
            return GrauObesidade.ObesidadeGrauI.name();
        }

        if (this.idade <= 6) {
            if (imc <= 14) return GrauObesidade.BaixoPeso.name();
            if (imc <= 17) return GrauObesidade.PesoNormal.name();
            if (imc <= 18.3) return GrauObesidade.Sobrepeso.name();
            return GrauObesidade.ObesidadeGrauI.name();
        }

        if (this.idade <= 8) {
            if (imc <= 14) return GrauObesidade.BaixoPeso.name();
            if (imc <= 18) return GrauObesidade.PesoNormal.name();
            if (imc <= 20) return GrauObesidade.Sobrepeso.name();
            return GrauObesidade.ObesidadeGrauI.name();
        }

        if (this.idade <= 10) {
            if (imc <= 14.5) return GrauObesidade.BaixoPeso.name();
            if (imc <= 19) return GrauObesidade.PesoNormal.name();
            if (imc <= 22) return GrauObesidade.Sobrepeso.name();
            return GrauObesidade.ObesidadeGrauI.name();
        }

        if (this.idade <= 12) {
            if (imc <= 15.2) return GrauObesidade.BaixoPeso.name();
            if (imc <= 21) return GrauObesidade.PesoNormal.name();
            if (imc <= 23) return GrauObesidade.Sobrepeso.name();
            return GrauObesidade.ObesidadeGrauI.name();
        }

        if (this.idade <= 14) {
            if (imc <= 16.3) return GrauObesidade.BaixoPeso.name();
            if (imc <= 22.5) return GrauObesidade.PesoNormal.name();
            if (imc <= 26) return GrauObesidade.Sobrepeso.name();
            return GrauObesidade.ObesidadeGrauI.name();
        }

        if (this.idade <= 16) {
            if (imc <= 16.8) return GrauObesidade.BaixoPeso.name();
            if (imc <= 24) return GrauObesidade.PesoNormal.name();
            if (imc <= 26.5) return GrauObesidade.Sobrepeso.name();
            return GrauObesidade.ObesidadeGrauI.name();
        }

        if (this.idade <= 18) {
            if (imc <= 18.9) return GrauObesidade.BaixoPeso.name();
            if (imc <= 25.7) return GrauObesidade.PesoNormal.name();
            if (imc <= 27.9) return GrauObesidade.Sobrepeso.name();
            return GrauObesidade.ObesidadeGrauI.name();
        }

        if (imc <= 19.9) return GrauObesidade.BaixoPeso.name();
        if (imc <= 26) return GrauObesidade.PesoNormal.name();
        if (imc <= 30.5) return GrauObesidade.Sobrepeso.name();
        return GrauObesidade.ObesidadeGrauI.name();
    }

    private String calculaImcHomemIdoso(double imc) {
        if (imc < 21.99) return GrauObesidade.BaixoPeso.name();
        if (imc <= 27) return GrauObesidade.PesoNormal.name();
        if (imc <= 30) return GrauObesidade.Sobrepeso.name();
        if (imc <= 35) return GrauObesidade.ObesidadeGrauI.name();
        if (imc <= 39.99) return GrauObesidade.ObesidadeGrauII.name();
        return GrauObesidade.ObesidadeGrauIII.name();
    }

    private String calculaImcHomem(double imc) {
        if (this.idade <= 20) return calculaImcMenino(imc);
        if (this.idade > 65) return calculaImcHomemIdoso(imc);
        return this.calculaImcPopulacaoBase(imc);
    }

    private String calculaImcMulherIdosa(double imc) {
        if (imc < 21.99) return GrauObesidade.BaixoPeso.name();
        if (imc <= 27) return GrauObesidade.PesoNormal.name();
        if (imc <= 32) return GrauObesidade.Sobrepeso.name();
        if (imc <= 37) return GrauObesidade.ObesidadeGrauI.name();
        if (imc <= 41.99) return GrauObesidade.ObesidadeGrauII.name();
        return GrauObesidade.ObesidadeGrauIII.name();
    }

    private String calculaImcMulher(double imc) {
        if (this.idade > 65) return this.calculaImcMulherIdosa(imc);
        return this.calculaImcPopulacaoBase(imc);
    }

    public String calculaImc() {
        double imc =  this.peso / (this.altura * this.altura);

        if (this.sexo.equals("M"))
            return this.calculaImcHomem(imc);
        else if (this.sexo.equals("F"))
            return this.calculaImcMulher(imc);

        return "Sexo inválido";
    }
}
