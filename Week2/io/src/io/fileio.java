package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class fileio {

	public static void main(String[] args) {
		if (args.length >= 1)	{
			Scanner s = new Scanner(System.in);
			String input;
			PrintWriter p = null;
			Boolean go = true;
			System.out.printf("Writing to file: %s. Please enter text && press enter. A blank line terminates.\n", args[0]);
			try	{
				p = new PrintWriter(new FileWriter(args[0], true));
				do	{
					input = s.nextLine();
					if (input.length() > 0)
						p.println(input);
					else
						go = false;
				} while (go);
			} catch (IOException e)	{
				System.out.printf("File I/O error: %s\n", e.getMessage());
			} finally	{
				if (p != null)	{
					try	{
						p.close();
					} catch	(Exception e)	{
						System.out.println("File close failed");
					}
				}
			}
		} else {
			System.out.printf("fileio\nTakes lines from console and writes to a file,\nwhich has been specified on the comamndline \nusage: filefo <filespec>\n");
		}
	}

}
