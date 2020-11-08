package com.secondshops.utils;

import java.io.File;

public class FileCheck {
	public String checkGoodFolderExist(String filePath) {
		Boolean success = false;
		String classpath = FileCheck.class.getResource("/").getPath()
				.replaceFirst("/", "");
		String path = classpath.replaceAll("/WEB-INF/classes/", "") + filePath;
		File file = new File(path);
		success = checkFileExist(file);
		if (success) {
			return path + "/";
		} else {
			return "";
		}
	}
	
	public Boolean checkFileExist(File file) {
		if (file.exists()) {
			System.out.println("�ļ����Ѵ��ڣ�");
			return true;
		} else {
			System.out.println("�ļ��в����ڣ����ڴ�����");
			file.mkdirs();
			if (file.exists()) {
				System.out.println("�ļ��д����ɹ���");
				return true;
			} else {
				System.out.println("����ʧ�ܣ�");
				return false;
			}
		}
	}
	
	

}
