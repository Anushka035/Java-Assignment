import java.util.Scanner;

public class DigitExtraction{
    public static void main(String[] args) {
        Scanner xy=new Scanner(System.in);

        System.out.print("Enter a 3 digit number: ");
        int num=xy.nextInt();

        int h=num/100;
        int t=(num/10)%10;
        int u=num%10;

        System.out.println("Hundreds: " + h);
        System.out.println("Tens: " + t);
        System.out.println("Units: " + u);

        xy.close();
    }
}