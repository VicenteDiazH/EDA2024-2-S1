//Escribe un programa en Java que convierta un número entero a su representación binaria.

import java.util.Scanner;

public class DecimalBinario {
    public static String convertirABinario(int numero) {
        StringBuilder resultado = new StringBuilder();

        while (numero > 0) {
            int residuo = numero % 2;
            resultado.insert(0, residuo);
            numero /= 2;
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        
        String binario = convertirABinario(numero);
        System.out.println("El número en binario es: " + binario);
    }

}