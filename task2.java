import java.util.*;

public class task2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of subjects: ");
    int numSubjects = input.nextInt();

    int[] marks = new int[numSubjects];
    for (int i = 0; i < numSubjects; i++) {
      System.out.print("Enter marks obtained in subject " + (i+1) + ": ");
      marks[i] = input.nextInt();
    }

    int totalMarks = 0;
    for (int i = 0; i < numSubjects; i++) {
      totalMarks += marks[i];
    }

    double averagePercentage = (double) totalMarks / numSubjects;

    String grade;
    if (averagePercentage >= 90) {
      grade = "A+";
    } else if (averagePercentage >= 80) {
      grade = "A";
    } else if (averagePercentage >= 70) {
      grade = "B";
    } else if (averagePercentage >= 60) {
      grade = "C";
    } else if (averagePercentage >= 50) {
      grade = "D";
    } else {
      grade = "F";
    }

    System.out.println("Total marks: " + totalMarks);
    System.out.println("Average percentage: " + averagePercentage);
    System.out.println("Grade: " + grade);
  }
}
