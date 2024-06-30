//importing scanner library 
import java.util.Scanner;
//declaring vthe class student grade caluclator
class StudenGradeCaluculator {
    //declaring the main method
    public static void main(String[] args) {
        //declarring scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subects:");
        int totalSubjects=sc.nextInt();
        //firstly we are declaring the total marks to be zero
        int totalMarks=0;
        
        System.out.println("Enter the marks of all the subjects:");
        //declaring the array to store the marks
        int[] marks=new int[totalSubjects];
        for(int i=0;i<totalSubjects;i++){
            marks[i]=sc.nextInt();
            totalMarks+=marks[i];
        }
        //average persentage is total marks divided by total number of subjects
        double averagePercent=(double)totalMarks/totalSubjects;
        
        
        String grade;
        if(averagePercent>=90){
            grade="O";
        }else if(averagePercent>=80){
            grade="A+";
            
        }else if(averagePercent>=70){
            grade="A";
        }else if(averagePercent>=60){
            grade="B+";
        }else if(averagePercent>=50){
            grade="B";
        }else if(averagePercent>=40){
            grade="C";
        }else{
            grade="F";
        }
        
        //printing the total marks, avereage percentage,grade
        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Average Percentage:"+ averagePercent);
        System.out.println("Grade:"+grade);
    }
}