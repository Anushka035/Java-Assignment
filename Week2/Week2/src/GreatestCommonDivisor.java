public class GreatestCommonDivisor {
    public static int gcd(int a,int b){
        a=Math.abs(a);
        b=Math.abs(b);  
        int remainder;
        while(b!=0){
            remainder =a%b;
            a=b;
           b=remainder;
        }
        return a;

    }
    
}
