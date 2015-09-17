/*
* @author Carlos
*
*/

import java.util.*;

class File {
	private static String fileType;
	private static Byte[] content;
	private static double size;

	public File(String fileType, Byte[] content, double size) {
		this.fileType = fileType;
		this.content = content;
		this.size = size;
	}

	public void download(){
		// ...
	}

	public void share(){
		// ...
	}
}
