/*
 * @(#)Main.java 1.0 07.02.2017
 */

package numbers.app03;

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

        System.out.println("Последовательность Фибоначчи.");
        System.out.println("Введите число (n>=2): ");

        Integer n = Integer.parseInt(reader.readLine());
        fib(n);
    }

    private static void fib(int n) {
        int a = 0;
        int b = 1;

        System.out.print(a + " " + b);
        for (int i = 0; i < n - 2; i++) {
            int summ = a + b;
            a = b;
            b = summ;
            System.out.print(" " + summ);
        }
        System.out.println();
    }
}
