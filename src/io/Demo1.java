package io;

import java.io.File;
import java.io.IOException;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileDir="D:\\Users";
		String fileName="a.txt";
		File f1=new File(fileDir,fileName);
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
