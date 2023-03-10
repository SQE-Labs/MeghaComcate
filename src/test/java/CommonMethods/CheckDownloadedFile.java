package CommonMethods;

import java.io.File;

public class CheckDownloadedFile {
	public static String isFileDownloaded(String fileName) {
		String home = System.getProperty("user.home");
		String file_name = fileName;
		String file_with_location = home + "\\Downloads\\" + file_name;
		File file = new File(file_with_location);
		if (file.exists()) {
			System.out.println(file_with_location + " is present");
			String result = "File Present";
			return result;
		} else {
			System.out.println(file_with_location + " is not present");
			String result = "File not Present";
			String result1 = result;
			return result1;
		}
	}
	
//	public static String isFileDownloadedPartial(String partialfileName) {
//		String home = System.getProperty("user.home");
//		String file_name = partialfileName;
//		String file_with_location = home + "\\Downloads\\" + file_name;
//		File file = new File(file_with_location);
//		String result="";
//		 if( file.exists() && file.isDirectory() )
//		   {
//		       String[] files = file.list(); //get the files in String format.
//		       for( String fileName : files )
//		       {
//		           if( fileName.contains( partialfileName ) ) {
//		        	   result="File present";
//		        	   return result;}
//		       }
//		   } 
//		 else {
//			   
//			System.out.println(file_with_location + " is not present");
//			 result = "File not Present";
//			return result;
//		}
//	}
}
