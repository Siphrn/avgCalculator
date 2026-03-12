// Main function/declaring Grades Class

public class Grades {
    public static void main(String[] args) {
        // Declaring grades and avg. variables.
        int grades[] = {90, 100, 94, 85, 50};
        double avg = (grades[0] + grades[2] + grades[3] + grades[4] + grades[1]) / grades.length;

        // Conditional which goes through the grade, and outputs the Average: and Grade Letter: 
        if (avg > 90) {
            System.out.println("Average: " + avg);
            System.out.println("Grade: A");
        }
        else if (avg > 80) {
            System.out.println("Average: " + avg);
            System.out.println("Grade: B");
        }
        else if (avg > 70) {
            System.out.println("Average: " + avg);
            System.out.println("Grade: C");
        }
        else if (avg >= 60) {
            System.out.println("Average: " + avg);
            System.out.println("Grade: D");
        }
        else if (avg < 60) {
            System.out.println("Average: " + avg);
            System.out.println("Grade: F");
        } else{
            System.out.println("Not a valid average.");
        }

        }
    }
