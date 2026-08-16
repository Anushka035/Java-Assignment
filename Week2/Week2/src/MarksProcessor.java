public class MarksProcessor {
        public static boolean isValidMark(int mark) {
        if (mark >= 0 && mark <= 100)
            return true;
        else
            return false;
    }

   public static double average(int sum, int count) {
        return (double) sum / count;
    }

    public static void processMarks(int[] marks) {

        int count = 0;
        int sum = 0;
        int highest = 0;
        int passes = 0;
        int failures = 0;

        for (int mark : marks) {

            if (isValidMark(mark)) {

                count++;
                sum = sum + mark;

                if (count == 1 || mark > highest)
                    highest = mark;

                if (mark >= 50)
                    passes++;
                else
                    failures++;

            } else {
                System.out.println("Invalid mark: " + mark);
            }
        }
        System.out.println("Valid marks: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average(sum, count));
        System.out.println("Highest: " + highest);
        System.out.println("Passes: " + passes);
        System.out.println("Failures: " + failures);
    }
}

