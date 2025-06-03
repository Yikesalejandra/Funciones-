/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class CirculoCalculos {

    // Función para calcular el área
    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2); // Fórmula: π * r²
    }

    // Función para calcular el perímetro
    public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio; // Fórmula: 2 * π * r
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada

        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble(); // Leer el radio ingresado por el usuario

        // Llamar a las funciones y mostrar los resultados
        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);

        System.out.printf("El área del círculo es: %.2f\n", area);
        System.out.printf("El perímetro del círculo es: %.2f\n", perimetro);

        scanner.close(); // Cerrar el objeto Scanner
    }
}