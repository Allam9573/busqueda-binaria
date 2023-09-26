/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lukanka
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arreglito = {1, 5, 8, 3, 5};
        int inicio = 0;
        int fin = arreglito.length - 1;
        int posicion = 0;
        int resultado = 0;
        String mensaje = "";

        System.out.print("Digite el numero que desea buscar: ");
        int numeroBuscado = scan.nextInt();

        while (inicio <= fin) {
            posicion = (inicio + fin) / 2;
            if (arreglito[posicion] == numeroBuscado) {
                resultado = posicion;
                break;
            } else if (arreglito[posicion] < numeroBuscado) {
                inicio = posicion + 1;
            } else {
                fin = posicion - 1;
            }
        }
        System.out.println("Numero: " + resultado);
    }

    public static void busquedaBinaria() {

    }
}
