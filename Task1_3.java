import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Уравнение: [a]x^2 + [b]x +[c]\n\nВведите значение переменных (целые числа)\n");
        System.out.println("a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("c: ");
        int c = Integer.parseInt(scanner.nextLine());
        
        int D = b*b - 4*a*c;
        if (D >= 0){
            if (D == 0){
                int answ = -b/2*a; 
                System.out.printf("Корень: %s\n", answ);
            }
            else if ((-b+Math.sqrt(D))/(2*a) % 1 == 0 && (-b-Math.sqrt(D))/(2*a) % 1 == 0){       
                double x1 = ((-b+Math.sqrt(D))/(2*a));
                double x2 = ((-b-Math.sqrt(D))/(2*a));
                String answ = x1 + ", " + x2;
                System.out.printf("Корни: %s", answ);
            }
        }
        else {
            System.out.println("Нет вещественных корней");
        }
        scanner.close();
    }
}
