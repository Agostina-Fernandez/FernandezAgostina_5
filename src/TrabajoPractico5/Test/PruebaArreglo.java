package TrabajoPractico5.Test;

import TrabajoPractico5.package1.Arreglo;
import java.util.Arrays;
import java.util.Scanner;

public class PruebaArreglo {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int enteros[][] = {{12,24,32,44,76,82,-5,-24,75,20}, {15,27,35,-5,-3,-87,73,26,-84,73,103,76,96,19,69,-12,31,23}};
        int numeros[] = {15,40,23,00,82,26,65,10,31,59,4,31,27,23,15,23};
        
        /* Probando método sumarLista() */
        
        Arreglo.sumarLista(numeros);
        
        /* Probando método buscarMayor() */
        
        Arreglo.buscarMayor(enteros);
        
        /* Probando método cuentaVocales() */
        
        Arreglo.cuentaVocales("Tres tristes tigres tragaban trigo en un campo de plantas gramíneas");
        
        /* Probando método cuentaCaracter() */
    
        Arreglo.cuentaCaracter("Pablito clavo un clavito, ¿Qué clavito clavó pablito?", 'p');
        
        /* Game Time */
        
        Scanner sc = new Scanner(System.in);
        char opciones = 'a';
        String user;
        int bu[] = null;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Desea agregar sus propios parámetros?");
            System.out.println("Presione 'X' + enter para no o 'S' + enter para sí");
            
            opciones = sc.next().charAt(0);
            
            if (opciones == 'x' || opciones == 'X') {
                System.out.println("\t\tGracias por testear\n\t\t\t\tAtte: Agostina Fernández");
                
                System.exit(0);
                
            } else if (opciones == 'S' || opciones == 's'){
                do{
                    System.out.println("Seleccione una opción y presione enter");
                    System.out.println("'A' -> Método sumarLista()");
                    System.out.println("'B' -> Método buscarMayor())");
                    System.out.println("'C' -> Método cuentaVocales()");
                    System.out.println("'D' -> Método cuentaCaracter()");
                    System.out.println("'X' -> Salir");
                
                    opciones = sc.next().charAt(0);
                
                    switch(opciones){
                        case 'A': case 'a': {
                            do {
                                System.out.println("Para el método sumarLista() necesitamos "
                                    + "una lista de números enteros");
                                System.out.println("\nLista predefinida -> " + Arrays.toString(numeros) + 
                                        "\n\n'G' -> utilizar la lista predefinida\n"
                                                + "'N' -> crear nueva lista\n"
                                                + "'R' -> volver al menú de ejercicios\n"
                                                + "'X' -> cerrar programa");
                                
                                opciones = sc.next().charAt(0);
                                
                                switch(opciones){
                                    case 'g': case 'G': {
                                        Arreglo.sumarLista(numeros);
                                        break;
                                    }
                                    case 'n': case 'N': { 
                                        System.out.println("¿Cuántos enteros desea ingresar?");
                                        int max;
                                        do {
                                             max = sc.nextInt();
                                        } while( max <= 0);
                                        
                                        int ingreso[] = new int[max];
                                        
                                        for (int i = 0 ; i < max ; i++) {
                                            System.out.println((i + 1) + " -> ");
                                            ingreso[i] = sc.nextInt();
                                        }
                                        bu = ingreso;
                                        Arreglo.sumarLista(ingreso);
                                        
                                        do {
                                            System.out.println("'R' -> volver al menú de ejercicios\n"
                                                + "'X' -> cerrar programa");
                                            opciones = sc.next().charAt(0);
                                        
                                            /*switch(opciones){
                                                case 'r': case 'R': break;
                                                case 'x': case 'X': System.exit(0);
                                            }*/
                                            break;
                                        } while (opciones != 'r' || opciones != 'R' || opciones != 'x' || opciones != 'X');
                                        break;
                                    }
                                }
                                break;
                            } while (opciones != 'g' || opciones != 'G' || opciones != 'n' || opciones != 'N' || opciones != 'r' || opciones != 'R' || opciones != 'x' || opciones != 'X');
                            break;
                        }
                        case 'B': case 'b': {
                            do {
                                System.out.println("Para el método buscarMayor() necesitamos "
                                    + "una lista bidimensional e irregular");
                                System.out.println("\nLista bidimensional e irregular predefinida -> " + Arrays.toString(enteros) + 
                                        "\nLista unidimensional predefinida -> " + Arrays.toString(numeros));
                                if (bu != null) {
                                    System.out.println("Hay una lista de respaldo de otro ejercicio: " + Arrays.toString(bu) + 
                                        "\nLista unidimensional backup -> " + Arrays.toString(bu));
                                }
                                System.out.println("\n\n'G' -> utilizar la lista bidimensional e irregular predefinida");
                                if (bu != null) {
                                    System.out.println("'B' -> utilizar lista backup y agregar otra\n"
                                            + "'P' -> utilizar lista predefinida y agregar otra\n"
                                            + "'M' -> utilizar lista predefinida con la lista backup");
                                }
                                System.out.println("'N' -> crear nueva lista\n"
                                        + "'R' -> volver al menú de ejercicios\n"
                                        + "'X' -> cerrar programa");
                                
                                                
                                                
                                opciones = sc.next().charAt(0);
                                
                                switch(opciones){
                                    case 'g': case 'G': {
                                        Arreglo.buscarMayor(enteros);
                                        break;
                                    }
                                    case 'n': case 'N': { 
                                        int max, max2;
                                        
                                        System.out.println("¿Cuántos enteros desea ingresar en la primer lista?");

                                        do {
                                             max = sc.nextInt();
                                        } while( max <= 0);
                                        
                                        
                                        int ingreso[][] = new int[2][max];
                                        
                                        System.out.println("Ingresar valores");
                                        for (int j = 0 ; j < max ; j++){
                                            System.out.println("_ ");
                                            ingreso[0][j] = sc.nextInt();
                                        }
                                        
                                        System.out.println("¿Cuántos enteros desea ingresar en la segunda lista?");
                                        
                                        
                                        do {
                                             max2 = sc.nextInt();
                                        } while( max2 <= 0);
                                        
                                        System.out.println("Ingresar valores");
                                        
                                        for (int i = 0 ; i < max2 ; i++) {
                                            System.out.println( "_ ");
                                            ingreso[1][i] = sc.nextInt();
                                        }
                                        Arreglo.buscarMayor(ingreso);
                                        
                                        do {
                                            System.out.println("'R' -> volver al menú de ejercicios\n"
                                                + "'X' -> cerrar programa");
                                            opciones = sc.next().charAt(0);
                                        
                                            /*switch(opciones){
                                                case 'r': case 'R': break;
                                                case 'x': case 'X': System.exit(0);
                                            }*/
                                            break;
                                        } while (opciones != 'r' || opciones != 'R' || opciones != 'x' || opciones != 'X');
                                        break;
                                    }
                                    case 'B': case 'b': {
                                        System.out.println("Utilizaremos la lista backup del juego anterior: " + Arrays.toString(bu));
                                        System.out.println("¿Cuántos enteros desea ingresar?");
                                        int max;
                                        do {
                                             max = sc.nextInt();
                                        } while( max <= 0);
                                        
                                        int ingreso[][] = null;
                                        
                                        for (int n = 0 ; n < bu.length ; n++){
                                            ingreso[0][n] = bu[n];
                                        }
                                            
                                        
                                        for (int i = 0 ; i < max ; i++) {
                                            System.out.println((i + 1) + " -> ");
                                            ingreso[1][i] = sc.nextInt();
                                        }
                                        
                                        Arreglo.buscarMayor(ingreso);
                                        
                                        do {
                                            System.out.println("'R' -> volver al menú de ejercicios\n"
                                                + "'X' -> cerrar programa");
                                            opciones = sc.next().charAt(0);
                                        
                                            /*switch(opciones){
                                                case 'r': case 'R': break;
                                                case 'x': case 'X': System.exit(0);
                                            }*/
                                            break;
                                        } while (opciones != 'r' || opciones != 'R' || opciones != 'x' || opciones != 'X');
                                        break;
                                    }
                                    case 'P': case 'p': {
                                        System.out.println("Utilizaremos la lista predefinida: " + Arrays.toString(bu));
                                        System.out.println("¿Cuántos enteros desea ingresar en su lista?");
                                        int max;
                                        do {
                                             max = sc.nextInt();
                                        } while( max <= 0);
                                        
                                        int ingreso[][] = null;
                                        
                                        for (int n = 0 ; n < numeros.length ; n++){
                                            ingreso[0][n] = numeros[n];
                                        }
                                            
                                        
                                        for (int i = 0 ; i < max ; i++) {
                                            System.out.println((i + 1) + " -> ");
                                            ingreso[1][i] = sc.nextInt();
                                        }
                                        
                                        Arreglo.buscarMayor(ingreso);
                                        
                                        do {
                                            System.out.println("'R' -> volver al menú de ejercicios\n"
                                                + "'X' -> cerrar programa");
                                            opciones = sc.next().charAt(0);
                                        
                                            /*switch(opciones){
                                                case 'r': case 'R': break;
                                                case 'x': case 'X': System.exit(0);
                                            }*/
                                            break;
                                        } while (opciones != 'r' || opciones != 'R' || opciones != 'x' || opciones != 'X');
                                        break;
                                    }
                                    case 'M': case 'm': {
                                        System.out.println("Utilizaremos la lista backup del juego anterior y la lista predefinida: " + Arrays.toString(bu));
                                        
                                        int ingreso[][] = null;
                                        
                                        for (int n = 0 ; n < bu.length ; n++){
                                            ingreso[0][n] = bu[n];
                                        }
                                            
                                        
                                        for (int i = 0 ; i < numeros.length ; i++) {
                                            ingreso[1][i] = numeros[i];
                                        }
                                        
                                        Arreglo.buscarMayor(ingreso);
                                        
                                        do {
                                            System.out.println("'R' -> volver al menú de ejercicios\n"
                                                + "'X' -> cerrar programa");
                                            opciones = sc.next().charAt(0);
                                        
                                            /*switch(opciones){
                                                case 'r': case 'R': break;
                                                case 'x': case 'X': System.exit(0);
                                            }*/
                                            break;
                                        } while (opciones != 'r' || opciones != 'R' || opciones != 'x' || opciones != 'X');
                                        break;
                                    }
                                    case 'R': case 'r': break;
                                    case 'X': case 'x': System.exit(0);
                                }
                                break;
                            } while (opciones != 'g' || opciones != 'G' || opciones != 'n' || opciones != 'N' || opciones != 'r' || opciones != 'R' || opciones != 'x' || opciones != 'X');
                            break;
                        }
                        case 'C': case 'c': {
                            do {
                                String frase;
                                
                                    System.out.println("Ingrese una frase para reviasar sus vocales");
                                    frase = scan.nextLine();
                            
                                Arreglo.cuentaVocales(frase);
                                
                                System.out.println("'R' -> repetir\n'S' -> salir");
                                
                                opciones = sc.next().charAt(0);
                                break;
                            } while (opciones != 'S' || opciones != 's');
                            
                            break;
                        }
                        case 'D': case 'd': {
                            do {
                                String frase;
                                char letra;
                                System.out.println("Ingrese la letra a filtrar");
                                letra = sc.next().charAt(0);
                                
                                System.out.println("Ingrese la frase de la que quiere extraer la letra " + letra);
                                frase = scan.nextLine();
                            
                                Arreglo.cuentaCaracter(frase, letra);
                                
                                System.out.println("'R' -> repetir\n'S' -> salir");
                                
                                opciones = sc.next().charAt(0);
                                break;
                            } while (opciones != 'S' || opciones != 's');
                            
                            break;
                        }
                        case 'X': case 'x': {
                            System.exit(0);
                        }
                        default: System.out.println("Valor no válido");
                    }
                } while ( opciones != 'x' || opciones == 'X');
            }
        } while (opciones != 'x' || opciones != 'X' || opciones != 's' || opciones != 'S');
    }
}
