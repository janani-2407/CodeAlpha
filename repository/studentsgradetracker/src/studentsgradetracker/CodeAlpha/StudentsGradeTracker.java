package studentsgradetracker.CodeAlpha;
import java.util.Scanner;
public class StudentsGradeTracker {
	
    public static double calcAverage(int[] Grades) {
        int sum = 0;
        for(int mark : Grades) {
            sum += mark;
        }
        return (double) sum / Grades.length;
    }

    public static int find_Highestscore(int[] Grades) {
        int Highest_score = Grades[0];
        for(int mark : Grades) {
            if(mark > Highest_score) {
            	 mark = Highest_score;
            }
        }
        return Highest_score;
    }
 
    public static int find_Lowestscore(int[] Grades) {
        int Lowest_score = Grades[0];
        for(int mark : Grades) {
            if(mark < Lowest_score) {
            	mark = Lowest_score;
            }
        }
        return Lowest_score;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of students to be entered: ");
        int numofStudents = scan.nextInt();
        int[] Grades = new int[numofStudents];
        for(int i=0; i<numofStudents; i++) {
            System.out.print("Enter the marks for student " +(i+1)+ ": ");
            Grades[i] = scan.nextInt();
        }
 
        double Average = calcAverage(Grades);
        int Highest_score = find_Highestscore(Grades);
        int Lowest_score = find_Lowestscore(Grades);

        System.out.println("Here is the Students' Grade Tracker Results");
        System.out.println("Average: " + Average);
        System.out.println("Highest score: " + Highest_score);
        System.out.println("Lowest score: " + Lowest_score);
        
        scan.close();
    }
    
}
