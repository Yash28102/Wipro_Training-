package Collection_Objects;

class MyThread extends Thread {
    public void run() {
        for(int i = 0; i <=3; i++) {
            //System.out.println(Thread.currentThread().getName());
        System.out.println("Thread 1 : "+i);
        Thread.yield();
        
        }
    }
}

public class Threadding{
    public static void main(String[] args) throws InterruptedException {
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//        MyThread t3 = new MyThread();
//       
//        t1.start();
//        t1.join();
//        t2.start();
//        t2.join();//join function is to wait for the thread to finish its task before moving ahead.
//        t3.start();
//        
//      
//        t3.join();
        
    	
    	Thread t1=new Thread(() -> {
    		for(int i=0;i<=3;i++) {
    			System.out.println("Thread 1 : "+i);
    			Thread.yield();
    		}
    	});
    	
    	Thread t2=new Thread(() -> {
    		for(int i=0;i<=3;i++) {
    			System.out.println("Thread 2 : "+i);
    			Thread.yield();
    		}
    	});
    	
    	
    	t1.start();
    	t2.start();
        
        
        
    }
}
