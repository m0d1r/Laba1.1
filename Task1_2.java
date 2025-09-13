public class Task1_2 {
    public static void main(String[] args) {
        String str = "make install";
        String result = "";
        for (int i = str.length() - 1; 0 <= i; i--){
            result += (str.charAt(i));
        }
        System.out.print(result);
    }
}
