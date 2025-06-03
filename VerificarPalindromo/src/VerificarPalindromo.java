/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class VerificarPalindromo {

    // Función para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String texto) {
        // Limpiar el texto: eliminar espacios y convertir a minúsculas
        texto = texto.replaceAll("\\s+", "").toLowerCase();
        
        // Comparar caracteres desde el principio y el final
        int longitud = texto.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (texto.charAt(i) != texto.charAt(longitud - 1 - i)) {
                return false; // No es un palíndromo
            }
        }
        return true; // Es un palíndromo
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada

        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine(); // Leer la cadena ingresada por el usuario

        // Llamar a la función y mostrar el resultado
        boolean resultado = esPalindromo(texto);
        
        if (resultado) {
            System.out.println("Es un palindromo.");
        } else {
            System.out.println("No es palindromo.");
        }

        scanner.close(); // Cerrar el objeto Scanner
    }
}
