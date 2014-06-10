package com.example.filetest;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import android.content.Context;
import android.os.Environment;

public class NotesDaoImpl  {

	// variable to hold context to get the path
	private Context context;
	private String appPath;

	public NotesDaoImpl(Context context) {
		this.context = context;
		File currentFile = context.getFilesDir();
		appPath=currentFile.getAbsolutePath();
	//	System.out.println("App Path is : " + appPath);				
					File file = new File(appPath.concat("/" + (UUID.randomUUID() + ".txt")));
			
					try {
						file.createNewFile();
						file.setWritable(true);
						FileWriter fileWriter = new FileWriter(file);
						fileWriter.write("some title" + "\n" + "some description");
						fileWriter.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println("new added file is : " + file.getName());
					System.out.println("new created file is : " + file.getName() );
			
				}		
	}

	// private String appPath =getapp
	// getExternalFilesDir();//Environment.getExternalStorageDirectory().toString().concat("/notes app");
	// TODO remove 'title' and 'description'

//	@Override
//	public void deleteNoteByID(String ID) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public String addNote() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getTitleByID() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getDescriptionByID(String ID) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String[] getAllIDs() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void editNoteByID() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteNOteByID() {
//		// TODO Auto-generated method stub
//
//	}


