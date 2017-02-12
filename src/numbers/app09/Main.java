/*
 * @(#)Main.java 1.0 12.02.2017
 */
package numbers.app09;

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
        String str = reader.readLine();

        String toBinary = decimalToBinary(str);
        int toDecimal = binaryToDecimal(toBinary);

        System.out.println("bin: " + toBinary);
        System.out.println("dec: " + toDecimal);
    }

    private static String decimalToBinary(String str) {
        StringBuilder resultBin = new StringBuilder();
        int dec = Integer.parseInt(str);
        while (true) {
            if ((dec % 2) > 0) {
                resultBin.append(1);
            } else {
                resultBin.append(0);
            }
            dec /= 2;

            if (dec < 1) {
                break;
            }
        }
        resultBin.reverse();
        return new String(resultBin);
    }

    private static int binaryToDecimal(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        int[] ints = new int[stringBuilder.length()];
        int result = 0;

        stringBuilder.reverse();

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Character.getNumericValue(stringBuilder.charAt(i)) * (int) Math.pow(2, i);
        }

        for (int anInt : ints) {
            result += anInt;
        }

        return result;
    }
}
