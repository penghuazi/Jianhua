package com.test.classLoader;

public class HelloWorld {
    public static void main(String[] args)throws ClassNotFoundException {
             ClassLoader loader = HelloWorld.class.getClassLoader();
             System.out.println(loader); 
            //ʹ��ClassLoader.loadClass()�������࣬����ִ�г�ʼ����
             loader.loadClass("com.test.classLoader.Test2");
            //ʹ��Class.forName()�������࣬Ĭ�ϻ�ִ�г�ʼ����
             //Class.forName("com.test.classLoader.Test2");
            //ʹ��Class.forName()�������࣬��ָ��ClassLoader����ʼ��ʱ��ִ�о�̬��
             Class.forName("com.test.classLoader.Test2", true, loader);
     } 
    
   
}