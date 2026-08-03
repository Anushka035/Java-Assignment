import java.util.Scanner;
public class ArithmeticCalculator{
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int x=ab.nextInt();
        System.out.print("Enter 2nd number: ");
        int y=ab.nextInt();
        int sum=x+y;
        int difference=x-y;
        int product=x*y;
        int quotient=x/y;
        int remainder=x%y;
        System.out.println("Sum:" +sum);
        System.out.println("Difference:" +difference);
        System.out.println("Product:" +product);
        System.out.println("Quotient:" +quotient);
        System.out.println("Remainder:" +remainder);
        ab.close();
        
    }
}