package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	 public static void main(String[] args) throws IOException {  
	        File file=new File("d:\\a.txt");  
	        FileInputStream fis=null;  
	        fis=new FileInputStream(file);  
	        byte[] by=new byte[(int) file.length()];  
	        int len=0;  
	        int count=0;  
	        while((len=fis.read(by))!=-1){  
	            by[count++]=(byte) fis.read();  
	            System.out.println(new String(by));  
	            
	        }  
	        
	        if(fis!=null){  
                fis.close();  
            }  
	    }  
}
