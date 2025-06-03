/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class VerificarEdad {

    // Función para verificar si la persona puede votar
    public static boolean puedeVotar(int edad) {
        return edad >= 18; // Retorna verdadero si la edad es 18 o más
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt(); // Leer la edad ingresada por el usuario

        // Llamar a la función y mostrar el resultado
        boolean resultado = puedeVotar(edad);
        
        if (resultado) {
            System.out.println("Puedes votar.");
        } else {
            System.out.println("No puedes votar.");
        }

        scanner.close(); // Cerrar el objeto Scanner
    }
}