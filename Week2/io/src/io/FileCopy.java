package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCopy {

	public static void main(String[] args) {
		if (args.length == 2)	{
			PrintWriter p = null;
			BufferedReader r = null;
			String line;
			try	{
				try {
				p = new PrintWriter(new FileWriter(args[1], true));
				r = new BufferedReader(new FileReader(args[0]));
				while ((line = r.readLine()) != null)
					p.println(line);
				} finally	{
					if (p != null)
						p.close();
				}
			} catch (IOException e)	{
				System.out.printf("File I/O error: %s\n", e.getMessage());
			} 
		} else {
			System.out.printf("FileCopy\nCopies from one <file1> to <file2>\n Specified on commandline.\nusage: FileCopy <filespec1> <filespec2>\n");
		}
	}
}
