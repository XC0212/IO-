package io;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String fileDirName="a";
//		String Src="D:\\";
//		File fileDir =new File(Src,fileDirName);
//		fileDir.mkdir();
		
//		String fileDirSrc="D:\\a";
//		String fileName="haha.mp3";
//		File text=new File(fileDirSrc,fileName);
//		try {
//			text.createNewFile();
//		} catch (IOException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
//		String Src="D:/A/B/C/D";
//		
//		File fileDir=new File(Src);
//		fileDir.mkdirs();
//		
		Date time=new Date(System.currentTimeMillis());
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString=format.format(time);
		System.out.println(dateString);
		
		

	}

}
