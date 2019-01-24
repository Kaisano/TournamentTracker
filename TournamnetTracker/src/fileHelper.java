import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @author Alex
 * Helper class to create files and manage them ie. editing the file/replacing data
 * 
 */

public class fileHelper {
	private static String fileName, folderName; //file name and folder name
	private static String location = System.getProperty("user.dir"); //gets current directory of the folder
	private static File folderMain, folderSub, document; //folder that holds the documents and the document itself
	
	public fileHelper(String fileN, String folderN) throws IOException
	{
		//set file name
		fileName = fileN;
		folderName = folderN;
		//creation of the main folder
		boolean fldrFlag = false;
		folderMain = new File(location + "\\Stream Files");
		try {
			fldrFlag = folderMain.mkdir();
		}
		catch(SecurityException Se)
		{
			System.out.println(folderMain.getName() + " | Error while creating directory in Java: " + Se);
		}
		//check status of file as to not corrupt it or destroy it
		if(fldrFlag) 
			System.out.println(folderMain.getName() + " | Directory sucessfully created");
		else if(folderMain.exists())
			System.out.println(folderMain.getName() + " | Directory already established");
		else
			System.out.println(folderMain.getName() + " | Directory unsuccessfully created");
		
		//creation of the sub folder
		boolean fldrSubFlag = false;
		folderSub = new File(location + "\\" + folderName);
		try {
			fldrSubFlag = folderSub.mkdir();
		}
		catch(SecurityException Se)
		{
			System.out.println(folderSub.getName() + " | Error while creating directory in Java: " + Se);
		}
		//check status of file as to not corrupt it or destroy it
		if(fldrSubFlag) 
			System.out.println(folderSub.getName() + " | Directory sucessfully created");
		else if(folderSub.exists())
			System.out.println(folderSub.getName() + " | Directory already established");
		else
			System.out.println(folderSub.getName() + " | Directory unsuccessfully created");
		
		//creation of the file txt document
		boolean docFlag = false;
		document = new File(folderSub.getPath() + "\\"+ fileName +".txt");
		try {
			docFlag = document.createNewFile();
		}
		catch(SecurityException Se)
		{
			System.out.println(document.getName() + " | Error while creating directory in Java: " + Se);
		}
		//check status of file as to not corrupt it or destroy it
		if(docFlag) 
			System.out.println(document.getName() + " | Directory sucessfully created");
		else if(document.exists())
			System.out.println(document.getName() + " | Directory already established");
		else
			System.out.println(document.getName() + " | Directory unsuccessfully created");		
	}
	
    public static void write(String message) throws IOException
    {
    	PrintWriter writer = new PrintWriter(document.getPath(), "UTF-8");
        writer.println(message);
        writer.close();
    }
}
