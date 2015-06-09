import java.io.File;
import java.util.Date;


public class Fileinfo {

	public Fileinfo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		if (args.length >= 1)	{
			File fs = new File(args[0]);
			if (fs.exists())	{
				if (fs.isDirectory())	{
					System.out.printf("--------------------------\nDirectory %s\n--------------------------\n", args[0]);
					listFiles(fs);
					
				} else	{
					System.out.printf("--------------------------\nFile %s\n", args[0]);
					System.out.printf("Size: %d\n", fs.length());
				}
				System.out.printf("--------------------------\nModified: %s\nPermissions: %c%c%c\n--------------------------\n", 
						new Date(fs.lastModified()*1000), 
						fs.canRead()?'r':'-',
						fs.canWrite()?'w':'-',
						fs.canExecute()?'x':'-');
				
			}
		} else	{
			System.out.printf("fileinfo\nDisplays information about a file or directory\nusage: fileinfo <filespec>\n");
		}
	}
	
	private static void listFiles(File fs)	{
		File file;
		for (String f: fs.list())	{
			file = new File(fs.getAbsolutePath() + "/" + f);
			if (file.isFile() && !file.isHidden())	{
				System.out.printf("%-65s%-10d\t%s\t%c%c%c\n", f, file.length(),
						new Date(fs.lastModified()*1000), 
						file.canRead()?'r':'-',
						file.canWrite()?'w':'-',
						file.canExecute()?'x':'-');
				
			}
		}
	}
}
