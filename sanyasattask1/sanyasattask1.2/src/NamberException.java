
import java.util.Scanner;

 class NumberException extends ExceptionInputOutput {
     public static void main(String[] args) {
         System.out.println("Введите колличество цветов: ");
         final Scanner scanner = new Scanner(System.in);
         final String number = scanner.next();

         try {
             final int i = Integer.parseInt(number);
             System.out.println(" Спасибо, вы ввели: " + i);

         } catch (NumberFormatException e) {
             System.out.println("Error: "+ e.toString() +" ввод букв не приветствуется! ");


         }

     }

 }
