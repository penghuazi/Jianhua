package com.test;

public class Demo01 {
	  
    public static void main(String[] args) {
         final Function f=new Function();
        new Thread(
                new Runnable(){

                    @Override
                    public void run() {
                        for(int i=0;i<50;i++){
                            f.sub("sub");
                        }
                    }
                
                }
                ).start();
        try {
			f.wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       // for(int i=0;i<50;i++){
            f.main();
      //  }
    }
}