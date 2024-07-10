import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoviendoCeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce los elementos del array separados por comas:");
        String datosConsola = scanner.nextLine();
        
        // Dividir la entrada por comas
        
        String[] elementosConsola = datosConsola.split(",");
        
        // Crear un array de Object para almacenar los elementos
        
        Object[] arr = new Object[elementosConsola.length];
        
        for (int i = 0; i < elementosConsola.length; i++) {
        	
        	//elimina espacios de cada elemento del array
        	
            String elemento = elementosConsola[i].trim();
            
            // Convierte elemento a Integer, Boolean o mantiene como String
            
            if (elemento.equals("true") || elemento.equals("false")) {
            	
                arr[i] = Boolean.parseBoolean(elemento);
                
            } else {
                try {
                    arr[i] = Integer.parseInt(elemento);
                } catch (NumberFormatException e) {
                    arr[i] = elemento;
                }
            }
        }
        
        Object[] result = moverCeros(arr);
        
        // Recorrer array y mostrar el resultado
        
        for (Object obj : result) {
            System.out.print(obj + ", ");
        }
        
        //cerrar scanner
        
        scanner.close();
    }

    public static Object[] moverCeros(Object[] arr) {
    	
    	//Crear array sin ceros
    	
        List<Object> elementosNoCero = new ArrayList<>();
        
        int contarCero = 0;

        // Recorremos el array principar para separar los elementos que no son ceros y añadirlos en nuevo array sin ceros
        
        for (Object obj : arr) {
            if (obj instanceof Integer && (Integer) obj == 0) {
            	contarCero++;
            } else {
            	elementosNoCero.add(obj);
            }
        }

        // Añadimos los ceros al final
        
        for (int i = 0; i < contarCero; i++) {
        	elementosNoCero.add(0);
        }

        return elementosNoCero.toArray();
    }
}