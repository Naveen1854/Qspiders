package demo;

class ThreadDemo extends Thread {
    @Override
    public void run(){
        System.out.println("Thread is Running");
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable thread running");
    }
}

public class Multithreading{
    public static void main(String args[]){
        ThreadDemo td = new ThreadDemo();
        td.start();
        Thread t2 = new Thread(new MyRunnable());
            t2.start();
    }
}

