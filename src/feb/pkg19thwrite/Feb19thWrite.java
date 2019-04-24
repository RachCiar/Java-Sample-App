/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feb.pkg19thwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author rciarl8967
 */
public class Feb19thWrite {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        String input;
        String brandName;
        String itemSku;
        String productName;
        String itemPrice;

        Scanner keyboard = new Scanner(System.in);
        FileWriter productCatalog = new FileWriter("storedatabase.txt",true);
        PrintWriter products = new PrintWriter(productCatalog);

        do {
            System.out.println("Please enter brand name:");
            brandName = keyboard.nextLine();
            products.println(brandName);

            System.out.println("Please enter SKU:");
            itemSku = keyboard.nextLine();
            products.println(itemSku);

            System.out.println("Please enter productName:");
            productName = keyboard.nextLine();
            products.println(productName);

            System.out.println("Please enter price:");
            itemPrice = keyboard.nextLine();
            products.println(itemPrice);

            System.out.println("Do you want to enter another product? Y/N");
            input = keyboard.nextLine();
           
        } while (input.equalsIgnoreCase("y"));

        products.close();

      
    }

}
