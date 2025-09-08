package entities;

public class Student {

	public static String name;
	public static double nota_1;
	public static double nota_2;
	public static double nota_3;
	
	public static double notaFinal() {
		return nota_1 + nota_2 + nota_3;
	}
	
	public static double pontosRestantes() {
		if (notaFinal() >= 60) {
			return 60 - notaFinal();
		} else {
			return 0;
		}
	}
}
