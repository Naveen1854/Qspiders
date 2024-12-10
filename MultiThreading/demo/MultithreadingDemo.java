package demo;

class MultithreadingDemo extends Thread{
//     @Override
//     public void run(){
//     System.out.println("run method is called by JVM");
//     }

        // @Override
        // public void run(){
        // Thread t = Thread.currentThread();
        // System.out.println(t);
        // }

        // String name;
        // MultithreadingDemo(String name){
        //     this.name=name;
        // }
        // @Override
        // public void run(){
        //     for (int i = 1; i <= 5; i++) {
        //         System.out.println(name + ":" + i);
        //     }
        // }

        @Override
        public void run(){
            System.out.println("run method automatically invoked by JVM");
            System.out.println(Thread.currentThread().getName());
        }

    public static void main(String args[]){
//         MultithreadingDemo mtd = new MultithreadingDemo();
//         Thread t1 = new Thread(mtd);
//         t1.start();   
            
            // MultithreadingDemo md = new MultithreadingDemo();
            // Thread t1 = new Thread(md);
            // t1.start();
            // Thread t = Thread.currentThread();
            // System.out.println(t);

        //     MultithreadingDemo mt1 = new MultithreadingDemo("Thread1");
        //     MultithreadingDemo mt2 = new MultithreadingDemo("Thread2");
        //     Thread t1 = new Thread(mt1);
        //     Thread t2 = new Thread(mt2);
        //     t1.start();
        //     t2.start();

        //     for(int i=0;i<=5;i++){
        //         System.out.println("main: " + i);
        // }
        
        MultithreadingDemo mtd = new MultithreadingDemo();
        MultithreadingDemo mtd1 = new MultithreadingDemo();
        // mtd.start();
        Thread t = new Thread(mtd);
        Thread t1 = new Thread(mtd1);

        t.start();
        t1.start();
        System.out.println("start method involed");
    }
}