public class Principal {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(50, 1.60);
        Paciente paciente2 = new Paciente (80, 1.75);
        Paciente paciente3 = new Paciente (110, 1.70);


        System.out.println("Paciente 1: IMC = " + paciente1.calcularIMC()+ " -> " + paciente1.diagnostico());
        System.out.println("Paciente 2: IMC = " + paciente2.calcularIMC()+ " -> " + paciente2.diagnostico());
        System.out.println("Paciente 3: IMC = " + paciente3.calcularIMC()+ " -> " + paciente3.diagnostico());
    }
}
