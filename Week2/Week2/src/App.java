public class App {
    public static void main(String[] args) {
        
        //Grading System
        int mark = 55;
        String grade = GradingSystem.classifyMark(mark);
        System.out.println("Marks: " + mark);
        System.out.println("Grade: " + grade);
        //Leap Year 
        int[] years = {2024, 1900, 2000, 2023};
        for (int year : years) 
        {
            if (LeapYear.isLeapYear(year))
                System.out.println(year + " is a leap year.");
            else 
                System.out.println(year + " is not a leap year.");
        }
        //Prime Number 
        int[] numbers = {-5, 0, 1, 2, 3, 4, 17, 25, 97};
        for (int number : numbers) 
        {
            if (PrimeNumber.isPrime(number))
                System.out.println(number + " is a prime number.");
            else 
                System.out.println(number + " is not a prime number.");
        }
        //Greatest Common Divisor
        int[][] pairs = {{48, 18}, {56, 98}, {101, 10}, {0, 5}, {-24, -36}};
        for (int[] pair : pairs) 
        {
            int a = pair[0];
            int b = pair[1];
            int gcd = GreatestCommonDivisor.gcd(a, b);
            System.out.println("GCD of " + a + " and " +b + " is: " + gcd);
        }
        //Number Reversal
        int[] numbersToReverse = {12345, -6789, 1000, 0};
        for (int number : numbersToReverse) 
        {
            int reversed = NumberReversal.reverseNumber(number);
            System.out.println("Reversed of " + number + " is: " + reversed);
        }
        //Marks Processor
        int[] marks = {70,45,105,80,-1};
        MarksProcessor.processMarks(marks);
    }
}
