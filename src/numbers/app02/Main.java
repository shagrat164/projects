/*
 * @(#)Main.java 1.0 07.02.2017
 */

package numbers.app02;

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
        Integer n = Integer.parseInt(reader.readLine());
        if ((n >= 0) && (n < 16)) {
            System.out.println(generateE(n));
        }
    }

    private static String generateE(int n) {
        return String.format("%." + n + "f", Math.E);
    }
}
