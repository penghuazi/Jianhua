package com.test;

class Function{
	public  boolean flag=true;
    //���߳�Ҫʵ�ֵĹ���
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
            //forѭ���ڶ������̵߳Ĺ���,����򵥵ļ���Ϊ��ӡһ�仰,���߳�ͬ��
            System.out.println("sub"+title);
        //}
        
        flag=true;
        this.notify();
    }
    //���߳�Ҫʵ�ֵĹ���
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
