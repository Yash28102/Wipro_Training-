package Day9;

import java.util.concurrent.*;

// 1. Even-Odd
class NumberPrinter {
    int num = 1;

    synchronized void printOdd() {
        while(num <= 10){
            if(num % 2 == 0){
                try{ wait(); } catch(Exception e){}
            } else {
                System.out.print(num + " ");
                num++;
                notify();
            }
        }
    }

    synchronized void printEven() {
        while(num <= 10){
            if(num % 2 != 0){
                try{ wait(); } catch(Exception e){}
            } else {
                System.out.print(num + " ");
                num++;
                notify();
            }
        }
    }
}


// 2. ABC
class ABCPrinter {
    int state = 0;

    synchronized void printA(){
        for(int i=0;i<5;i++){
            while(state != 0){
                try{ wait(); } catch(Exception e){}
            }
            System.out.print("A ");
            state = 1;
            notifyAll();
        }
    }

    synchronized void printB(){
        for(int i=0;i<5;i++){
            while(state != 1){
                try{ wait(); } catch(Exception e){}
            }
            System.out.print("B ");
            state = 2;
            notifyAll();
        }
    }

    synchronized void printC(){
        for(int i=0;i<5;i++){
            while(state != 2){
                try{ wait(); } catch(Exception e){}
            }
            System.out.print("C ");
            state = 0;
            notifyAll();
        }
    }
}


// 3. Bank
class BankAccount {
    int balance = 1000;

    synchronized void deposit(int amount){
        balance += amount;
        System.out.println("Deposited: " + amount + " Balance: " + balance);
    }

    synchronized void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}


// 4. Food Delivery
class OrderTask implements Runnable {
    int orderId;

    OrderTask(int id){
        this.orderId = id;
    }

    public void run(){
        System.out.println("Processing Order " + orderId + " by " + Thread.currentThread().getName());
    }
}


// MAIN CLASS
public class Assignment9 {

    public static void main(String[] args) throws Exception {

        // 1. Even-Odd
        System.out.println("1. Even-Odd:");
        NumberPrinter np = new NumberPrinter();

        Thread t1 = new Thread(() -> np.printOdd());
        Thread t2 = new Thread(() -> np.printEven());

        t1.start(); t2.start();
        t1.join(); t2.join();


        // 2. ABC
        System.out.println("\n2. ABC:");
        ABCPrinter abc = new ABCPrinter();

        Thread a = new Thread(() -> abc.printA());
        Thread b = new Thread(() -> abc.printB());
        Thread c = new Thread(() -> abc.printC());

        a.start(); b.start(); c.start();
        a.join(); b.join(); c.join();


        // 3. Bank
        System.out.println("\n3. Bank:");
        BankAccount acc = new BankAccount();

        Thread d1 = new Thread(() -> acc.deposit(500));
        Thread d2 = new Thread(() -> acc.withdraw(700));

        d1.start(); d2.start();
        d1.join(); d2.join();


        // 4. Food Delivery
        System.out.println("\n4. Food Delivery:");

        ExecutorService service = Executors.newFixedThreadPool(2);

        for(int i=1;i<=5;i++){
            service.execute(new OrderTask(i));
        }

        service.shutdown();
    }
}