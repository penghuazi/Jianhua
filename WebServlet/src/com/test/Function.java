package com.test;

class Function{
	public  boolean flag=true;
    //子线程要实现的功能
    public synchronized void sub(String title){
        while(flag){
            try {
            	System.out.println("wait sub "+title);
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
               
        //for(int i=0;i<10;i++){
            //for循环内定义子线程的功能,这里简单的假设为打印一句话,主线程同理
            System.out.println("sub"+title);
        //}
        
        flag=true;
        this.notify();
    }
    //主线程要实现的功能
    public synchronized void main(){
        while(!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       // for(int i=0;i<20;i++){
            System.out.println("main");
       // }
        
        flag=false;
        this.notify();
    }
    
}
