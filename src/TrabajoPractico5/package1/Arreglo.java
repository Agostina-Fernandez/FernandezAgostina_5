package TrabajoPractico5.package1;

public class Arreglo {
    public static void sumarLista(int listaNum[]){
        int sum = 0;
        int cant = 0;
        for(int i = 0 ; i < listaNum.length ; i++) {
            sum += listaNum[i];
            cant++;
        }
        
        System.out.println("La suma de todos los números de la lista es " + sum +
                " y el promedio es de " + (sum / cant));
    }
    
    public static void buscarMayor(int listaNum[][]){
        
        int max = 0;
        
        for (int[] listaNum1 : listaNum) {
            for (int n = 0; n < listaNum1.length; n++) {
                if (listaNum1[n] > max) {
                    max = listaNum1[n];
                }
            }
        }
        
        System.out.println("El número mayor de esta lista es el " + max);
    }
    
    /* VOCALES bocMm[0][0] = A      bocMm[1][0] = a */
    /* VOCALES bocMm[0][1] = E      bocMm[1][1] = e */
    /* VOCALES bocMm[0][2] = I      bocMm[1][2] = i */
    /* VOCALES bocMm[0][3] = O      bocMm[1][3] = o */
    /* VOCALES bocMm[0][4] = U      bocMm[1][4] = u */
    
    public static void cuentaVocales(String cadena){
        char caracteres[] = cadena.toCharArray();
        int bocMm[][] = {{0,0,0,0,0},{0,0,0,0,0}};
        int acentuadas = 0;
        
        for(int n = 0; n < caracteres.length ; n++) {
            switch(caracteres[n]){
                case 'a': {
                    bocMm[1][0]++;
                    break;
                }
                case 'e': {
                    bocMm[1][1]++;
                    break;
                }
                case 'i': {
                    bocMm[1][2]++;
                    break;
                }
                case 'o': {
                    bocMm[1][3]++;
                    break;
                }
                case 'u': {
                    bocMm[1][4]++;
                    break;
                }
                case 'A': {
                    bocMm[0][0]++;
                    break;
                }
                case 'E': {
                    bocMm[0][1]++;
                    break;
                }
                case 'I': {
                    bocMm[0][2]++;
                    break;
                }
                case 'O': {
                    bocMm[0][3]++;
                    break;
                }
                case 'U': {
                    bocMm[0][4]++;
                    break;
                }
                case 'á': case 'é': case 'í': case 'ó': case 'ú': 
                case 'Á': case 'É': case 'Í': case 'Ó': case 'Ú': {
                    acentuadas++;
                    break;
                }
            }
        }
        
        /* Calculamos cantidad de mayusculas y minusculas */
        int min = 0, may = 0;
        for(int z = 0 ; z < 5 ; z++){
                min += bocMm[1][z];
            }
        for(int z = 0 ; z < 5 ; z++){
                may += bocMm[0][z];
            }
        
        System.out.println("La frase \"" + cadena + "\" contiene:");
        System.out.println("a minúsculas:\t\t" + bocMm[1][0] + 
                "\tA mayúsculas:\t\t" + bocMm[0][0] + "\tA totales: \t\t" +
                (bocMm[1][0] + bocMm[0][0]));
        System.out.println("e minúsculas:\t\t" + bocMm[1][1] + 
                "\tE mayúsculas:\t\t" + bocMm[0][1] + "\tE totales: \t\t" +
                (bocMm[1][1] + bocMm[0][1]));
        System.out.println("i minúsculas:\t\t" + bocMm[1][2] + 
                "\tI mayúsculas:\t\t" + bocMm[0][2] + "\tI totales: \t\t" +
                (bocMm[1][2] + bocMm[0][2]));
        System.out.println("o minúsculas:\t\t" + bocMm[1][3] + 
                "\tO mayúsculas:\t\t" + bocMm[0][3] + "\tO totales: \t\t" +
                (bocMm[1][3] + bocMm[0][3]));
        System.out.println("u minúsculas:\t\t" + bocMm[1][4] + 
                "\tU mayúsculas:\t\t" + bocMm[0][4] + "\tU totales: \t\t" +
                (bocMm[1][4] + bocMm[0][4]));
        System.out.println("Vocales mayúsculas y minúsculas acentuadas: " + acentuadas);
        
        System.out.println("Vocales minúsculas:\t" + min +
                
                //(bocMm[1][0] + bocMm[1][1] + bocMm[1][2] + bocMm[1][3] + bocMm[1][4]) +
                "\tVocales mayúsculas:\t" + may +
                
                //(bocMm[0][0] + bocMm[0][1] + bocMm[0][2] + bocMm[0][3] + bocMm[0][4]) +
                "\tVocales totales:\t" + (may + min + acentuadas));
    }
    
    public static void cuentaCaracter(String cadena,char caracter){
        char caracteres[] = cadena.toCharArray();
        char charM = Character.toUpperCase(caracter);
        char charm = Character.toLowerCase(caracter);
        
        int cantMm[] = {0,0};
        
        for(int i = 0; i < caracteres.length ; i++){
            if(caracteres[i] == charm){
                cantMm[1]++;
            } else if (caracteres[i] == charM) {
                cantMm[0]++;
            }
        }
        
        if( cantMm[0] > 0 && cantMm[1] > 0) {
            System.out.println("Del valor ingresado \"" + caracter + 
                    "\" hay un total de " + cantMm[1] + " caracteres en minúsculas y " +
                    cantMm[0] + " en mayúscula, el total de dichos caracteres es de " + (cantMm[1] + cantMm[0]));
        } else if (cantMm[0] > 0 && cantMm[1] == 0) {
            System.out.println("Del valor ingresado \"" + caracter + "\" hay " +
                    cantMm[0] + " cantidad de letras y únicamente en mayúscula.");
        } else if (cantMm[0] == 0 && cantMm[1] > 0) {
            System.out.println("Del valor ingresado \"" + caracter + "\" hay " +
                    cantMm[1] + " cantidad de letras y únicamente en minúscula.");
        } else {
            System.out.println("No hay datos asociados");
        }
    }
}
