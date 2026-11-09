import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ekspresi infix: ");
        String infix = input.nextLine();
        System.out.println("Hasil postfix: " + InfixToPostfix.hasil(infix));
    }
}
