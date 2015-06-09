import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		String input = sc.nextLine();
		int numberOfStudents = Integer.parseInt(input);
		int highest = 0, lowest = 100, sum = 0, i = 0;
		int [] grades = new int[numberOfStudents];
		for (i = 0; i < numberOfStudents; i++ )	{
			System.out.printf("Please enter the grade for student #%d\n", i+1);
			input = sc.nextLine();
			grades[i] = Integer.parseInt(input);
			if (grades[i] < lowest)
				lowest = grades[i];
			if (grades[i] > highest)
				highest = grades[i];
		}
		for (i = 0; i < numberOfStudents; i++ )	{
			System.out.printf("Grade for student %d was %d%%\n", i+1, grades[i]);
			sum += grades[i];
		}
		System.out.printf("Average Grade over %d students was %d%%\n", i, sum/i);
		System.out.printf("Lowest Grade was %d%%. Highest Grade was %d%%\n", lowest, highest);
	}
}
