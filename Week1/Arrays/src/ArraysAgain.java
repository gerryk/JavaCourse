import java.util.Scanner;

public class ArraysAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		String input = sc.nextLine();
		int numberOfStudents = Integer.parseInt(input);
		int highest = 0, lowest = 100, sum = 0, i = 0, j = 0;
		int [][] grades = new int[numberOfStudents][3];
		for (i = 0; i < numberOfStudents; i++ )	{
			for (j = 0; j < 3; j++)	{
				System.out.printf("Please enter grade #%d for student #%d\n", j+1, i+1);
				input = sc.nextLine();
				grades[i][j] = Integer.parseInt(input);
			}
		}
	}
}
