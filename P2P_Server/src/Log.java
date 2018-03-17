import java.io.File;
import java.time.LocalDateTime;


/**
 * 
 * @author guill
 * @version 0.1
 * Class who manage every transaction of the application
 */


public class Log {
	/**
	 * {@value} 1 : OK
	 * 			2 : Warning
	 * 			3 : Error
	 */
	int[] level = new int[3]; 
	File file;
	
	
	public Log ()
	{
		System.out.println("test;");
	}
	
	public void CreateLogFile()
	{
		
	}
	public void CreateLog(int level, String description)
	{
		System.out.println(LocalDateTime.now().toString());
		// file.write ... (Date - Warning - Description
	}
}
