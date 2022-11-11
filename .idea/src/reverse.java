import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String userIn = scanner.nextLine();
        String string = "";
        char c;
        for (int i = 0; i < userIn.length(); i++) {
            c = userIn.charAt(i);
            string = c + string;

        }
        System.out.println(string);
    }
}

