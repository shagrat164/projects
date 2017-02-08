/*
 * @(#)Main.java 1.0 08.02.2017
 */

package numbers.app06;

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
        double w;
        double l;
        double price;
        double summ;

        System.out.print("Введите ширину помещения:");
        w = Double.parseDouble(reader.readLine());

        System.out.print("Введите длину помещения:");
        l = Double.parseDouble(reader.readLine());

        double s = w * l;

        System.out.print("Введите стоимость 1 кв.м. плитки:");
        price = Double.parseDouble(reader.readLine());

        summ = s * price;

        System.out.println("Стоимость плитки на помещение: " + summ);
    }
}
