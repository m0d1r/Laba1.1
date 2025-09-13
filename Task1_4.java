public class Task1_4 {
    public static void main(String[] args) {
        double sum = 0;
        double n = 2;
        do {
            double a = 1/(n*n+n-2);
            // System.out.println(a);
            sum += a;
            // System.out.println(sum);
            n++;
            if (a < (0.000001)) {
                break;
            };
        } while (n != 0);
    System.out.printf("Вывод: %s", sum);
    };
}
