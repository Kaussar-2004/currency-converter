import java.text.NumberFormat;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double payment = sc.nextDouble();  // Example input value

        
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        
        String us = usFormat.format(payment);
        
        
        String india = indiaFormat.format(payment).replace("\u20B9", "Rs.");
        
        // Format for China (ensure it matches the expected format)
        String china = chinaFormat.format(payment);
        
        // Format for France
        String france = franceFormat.format(payment);
        
        // Print the formatted values
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
