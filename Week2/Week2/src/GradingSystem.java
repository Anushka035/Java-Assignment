public class GradingSystem{
    public static String classifyMark(int mark){
        String grade;
        if(mark<0||mark>100)
            grade= "Invalid mark";
        else if(mark>=80)
           grade="Distinction";
        else if(mark>=70)
            grade="Merit";
        else if(mark>=50)
            grade="Passs";
        else
            grade="Fail";        
        return grade;
    }
}
