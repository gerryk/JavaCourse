import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many students?");
		String input = scanner.nextLine();
		int numberOfStudents = Integer.parseInt(input);
		if (numberOfStudents > 1 && numberOfStudents < 50)	{
			int [][] grades = new int[numberOfStudents][3];
			for (int i = 0; i < numberOfStudents; ++i)	{
				for (int j = 0; j < 3; ++j)	{
					do	{
						System.out.printf("Please enter grade %d for student %d: ",j+1, i+1);
						input = scanner.nextLine();
						grades[i][j] = Integer.parseInt(input);
						if (grades[i][j] < 1 || grades[i][j] > 100)	{
							System.out.println("That doesn't seem to be a valid grade...");
						}
					} while(grades[i][j] < 1 || grades[i][j] > 100);
				}
			}
			for (int i = 0; i < numberOfStudents; ++i)	{
				System.out.printf("Student %d achieved %d%% %d%% %d%%%n", i+1, grades[i][0], grades[i][1], grades[i][2]);
			}
		} else	{
			System.out.println("Number out of range...");
		}
	}
}
