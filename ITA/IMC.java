public class IMC {

    private double peso;
    private double altura;

    public IMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String diagnostico() {
        double imc = calcularIMC();

        if (imc < 16)
            return "baixo peso muito grave";
        else if (imc >= 16 && imc <= 16.99)
            return "baixo peso grave";
        else if (imc >= 17 && imc <= 18.49)
            return "baixo peso";
        else if (imc >= 18.50 && imc <= 24.99)
            return "peso normal";
        else if (imc >= 25 && imc <= 29.99)
            return "sobrepeso";
        else if (imc >= 30 && imc <= 34.99)
            return "obesidade grau 1";
        else if (imc >= 35 && imc <= 39.99)
            return "obesidade grau 2";
        else
            return "obesidade grau 3 (obesidade mórbida)";
    }
}
