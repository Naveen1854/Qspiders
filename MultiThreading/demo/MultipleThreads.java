package demo;

public class MultipleThreads implements Runnable{

    private String taskName;

    public MultipleThreads(String taskName){
        this.taskName = taskName;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " is running.step: "+i+" Executed by: " + Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){
                System.out.println(taskName + "was interrupted");
            }
        }
        System.out.println(taskName + " has completed!...");
    }
 public static void main(String[] args) {
    MultipleThreads mt1 = new MultipleThreads("Task 1");
    MultipleThreads mt2 = new MultipleThreads("Task 2");
    MultipleThreads mt3 = new MultipleThreads("Task 3");

    Thread t1 = new Thread(mt1);
    Thread t2 = new Thread(mt2);
    Thread t3 = new Thread(mt3);

    t1.start();
    t2.start();
    t3.start();
 }   
}