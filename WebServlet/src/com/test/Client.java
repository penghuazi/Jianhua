package com.test;

//客户端调用的代码：
	public class Client{
	    public static void main(String[] args){
	       Singleton s1 = Singleton.getInstance();
	       System.out.println(s1.toString());
	       for(int i=0;i<10;i++){
	           Singleton s2 = Singleton.getInstance();
	           System.out.println("The randomed number is "+s2.toString());
	       }
	    }
	}
	
