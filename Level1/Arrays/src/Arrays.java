import java.util.Scanner;


public class Arrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many students?");
		String input = scanner.nextLine();
		int numberOfStudents = Integer.parseInt(input);
		if (numberOfStudents > 1 && numberOfStudents < 50)	{
			int [] grades = new int[numberOfStudents];
			int total = 0;
			int min = 100, max = 0;
			for (int i = 0; i < numberOfStudents; ++i)	{
				System.out.printf("Please enter the grade for student %d: ", i+1);
				input = scanner.nextLine();
				grades[i] = Integer.parseInt(input);
			}
			for (int i = 0; i < numberOfStudents; ++i)	{
				System.out.printf("Student %d achieved %d%%%n", i+1, grades[i]);
				if (grades[i] < min) min = grades[i];
				if (grades[i] > max) max = grades[i];
				total += grades[i];
			}
			System.out.printf("Minimum Grade was %d%%%nMaximum Grade was %d%%%n", min, max);
			System.out.printf("Average grade: %d", total/numberOfStudents);
		} else	{
			System.out.println("Number out of range...");
		}
	}
}
