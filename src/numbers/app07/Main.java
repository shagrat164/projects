/*
 * @(#)Main.java 1.0 08.02.2017
 */

package numbers.app07;

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
        double percent;
        double summ;
        double vznos;
        int mount;

        System.out.println("Ипотечный калькулятор.");

        System.out.print("Общая сумма ипотеки: ");
        summ = Double.parseDouble(reader.readLine());

        System.out.print("Первоночальный взнос: ");
        vznos = Double.parseDouble(reader.readLine());

        System.out.print("Срок ипотеки (мес): ");
        mount = Integer.parseInt(reader.readLine());

        System.out.print("Процентная ставка: ");
        percent = Double.parseDouble(reader.readLine());

        
    }
}
