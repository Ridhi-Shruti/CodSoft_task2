import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);

        System.out.println("Enter marks obtained in English: ");
        int english = sh.nextInt();
        System.out.println("Enter marks obtained in Math: ");
        int math = sh.nextInt();
        System.out.println("Enter marks obtained in Science: ");
        int science = sh.nextInt();
        System.out.println("Enter marks obtained in Computer: ");
        int computer = sh.nextInt();
        System.out.println("Enter marks obtained in Hindi: ");
        int hindi = sh.nextInt();

        int total = english + math + science + computer + hindi;
        float average = (float) total / 5;

        System.out.println("\nTotal marks: " + total);
        System.out.println("Average percentage: " + average);

        if (average >= 90)
            System.out.println("Grade: A");
        else if (average >= 80)
            System.out.println("Grade: B");
        else if (average >= 70)
            System.out.println("Grade: C");
        else if (average >= 60)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");

        sh.close();
    }
     
}
