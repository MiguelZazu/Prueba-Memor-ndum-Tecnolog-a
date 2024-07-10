import java.util.Scanner;

public class CalcularIMC {

    public static void main(String[] args) {
    	
        // Ejemplo de uso de la clase IMCCalculadora
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Introduce un peso en KG:");
    	double peso = scanner.nextDouble();
    	
    	
    	
    	System.out.println("Introduce una altura en metros:");
    	double altura = scanner.nextDouble();
    	  	
        String resultado = calcularIMC(peso, altura);

        System.out.println("El resultado del IMC es: " + resultado);
        
        scanner.close();
    }
    
    //Calcula el IMC y determina la categoría basada en el IMC.
    
    public static String calcularIMC(double peso, double altura) {
    	
    	// Constantes
    	
        final double INFRAPESO_LIMITE = 18.5;
        final double NORMAL_LIMITE = 25.0;
        final double SOBREPESO_LIMITE = 30.0;

    	
    	//Calcula el IMC
    	
        double imc = peso / (altura * altura);
        
        //Determina la categoria de IMC
        
        if (imc <= INFRAPESO_LIMITE) {
            return "Infrapeso";
        } else if (imc <= NORMAL_LIMITE) {
            return "Normal";
        } else if (imc <= SOBREPESO_LIMITE) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
        
        
    }
}
