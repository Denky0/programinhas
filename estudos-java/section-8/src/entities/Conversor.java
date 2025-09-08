package entities;

public class Conversor {

	public static double price;
	public static double quantity;

	public static double Reais() {
		return price * quantity * 1.06;
	}
}