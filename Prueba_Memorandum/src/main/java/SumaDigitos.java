import java.util.Scanner;

public class SumaDigitos {
	
    public static void main(String[] args) {
    	
    	
    	//Introducir valor de N por consola
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Introduce el valor de N:");
    	int N = scanner.nextInt();
    	
    	//calcula resultado de la suma y lo muestra por consola
    	
        int resultado = sumaDeDigitos(N);
        System.out.println("La suma de los dígitos de todos los números de 1 a " + N + " es: " + resultado);
        
        //cerrar scanner
        
        scanner.close();
    }

    public static int sumaDeDigitos(int N) {
    	
    	//Acumula la suma de digitos
    	
        int sumaTotal = 0;
        
        //Suma todos los numeros de 1 hasta N
        
        for (int i = 1; i <= N; i++) {
        	
            int numero = i;
            
            //Descompone los numeros
            
            while (numero != 0) {
            	
                sumaTotal += numero % 10;
                numero /= 10;
                
            }
        }
        return sumaTotal;
    }
}
