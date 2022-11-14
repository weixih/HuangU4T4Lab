public class Main {
    public static void main(String[] args) {
        String str1 = "apples and bananas";
        while (str1.indexOf(" ") != -1) {
            int index = str1.indexOf(" ");
            str1 = str1.substring(0, index) + str1.substring(index + 1);
        }
        System.out.println(str1);
    }
}