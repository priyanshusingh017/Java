class threads extends  Thread{

    threads(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println(getName() + " priority : " + getPriority());
    }
}

public class Thread_priorities {
    public static void main(String[] args) throws InterruptedException {

        threads t1 = new threads("Low Priority");
        threads t2 = new threads("Medium Priority");
        threads t3 = new threads("High Priority");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        // thread inheritance
        Thread main = Thread.currentThread();
        main.setPriority(8);

        threads t4 = new threads("t4 threads");
        t4.start();
    }
}
