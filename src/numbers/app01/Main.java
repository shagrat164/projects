/*
 * @(#)Main.java 1.0 06.02.2017
 */
package numbers.app01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Protsvetov Danila
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Количество знаков после запятой: ");
        Integer n = Integer.parseInt(reader.readLine());
        if ((n < 21) && (n >= 0)) {
            System.out.println(generatePi(n));
        } else {
            System.out.println("Неверный ввод.");
        }
    }

    private static String generatePi(int n) {
        return String.format("asd %."+n+"f", Math.PI);
    }
}
