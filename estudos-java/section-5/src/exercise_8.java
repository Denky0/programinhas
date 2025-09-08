import java.util.Locale;
import java.util.Scanner;

public class exercise_8 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double renda = sc.nextDouble();
        
        double imposto = 0.0; 
        if (renda >= 0.0 && renda <= 2000.0) { 
            System.out.println("Isento");
        }
        
        else if (renda > 2000.0 && renda <= 3000.0) { 
            imposto = (renda - 2000.0) * 0.08;
            System.out.printf("R$: %.2f%n", imposto);
        }
        
        else if (renda > 3000.0 && renda <= 4500.0) { 
            imposto = (renda - 3000.0) * 0.18 + 1000.0 * 0.08; 
            System.out.printf("R$: %.2f%n", imposto);
        }
        
        else if (renda > 4500.0) { 
            imposto = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08; 
            System.out.printf("R$: %.2f%n", imposto);
        }
        
        sc.close();
    }
}