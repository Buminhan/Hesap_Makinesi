import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b;
        String c;
        Scanner input = new Scanner(System.in);
        Scanner charr = new Scanner(System.in);
        a = input.nextInt();
        c = charr.nextLine();
        b = input.nextInt();

        switch(c){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
                case "*":
                    System.out.println(a*b);
                    break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Yanlış operatör girdiniz.");
                break;
        }
    }
}