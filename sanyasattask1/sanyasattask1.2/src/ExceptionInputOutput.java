import java.util.Scanner;
public class ExceptionInputOutput {
    public static void main(String[] args) {

        System.out.println("Введите название цветов в букете: ");
        final Scanner scanner = new Scanner(System.in);
        final String FlowerInput = scanner.next();


        try {
            if (FlowerInput.matches("[a-zA-Z ]*\\d+.*")) {
                throw new IllegalArgumentException("Error: Ввод цифр не приветствуется! ");
            }

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println(0);

        }

    }

}








