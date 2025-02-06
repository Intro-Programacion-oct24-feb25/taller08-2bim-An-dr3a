/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador = 0;
        double farenheit;
        double celcius;
        String cadena = "";

        for (farenheit = 20; farenheit <= 100; farenheit += 4) {
            celcius = (5.0 / 9.0) * (farenheit - 32);
            cadena = String.format("%s\nOperacion(%d) Grados Farenheit: %.2f ===> Grados Celcius: %.2f",
                    cadena, contador, farenheit, celcius);

        }
        System.out.println(cadena);

    }

}
