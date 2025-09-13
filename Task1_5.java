import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово для проверки: ");
        String str = scanner.nextLine();
        String reStr = "";
        for (int i = str.length() - 1; 0 <= i; i--){
            reStr += str.charAt(i);
        }
        if (str.equals(reStr)) {
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Не палиндром");
        }
        scanner.close();
    }
}
