public class Task1_1 {
        public static void main(String[] args){
        for (int i = 1; i <= 500; i++){
            System.out.println(i);
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("fizzbuzz");
            } 
            else if (i % 5 == 0){
                System.out.println("fizz");
            }
            else if (i % 7 == 0){
                System.out.println("buzz");
            }
        }
    }
}
