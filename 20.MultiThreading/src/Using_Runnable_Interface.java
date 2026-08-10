class MyThreads implements Runnable {
    @Override
    public void run() {
        int i=0;
        while (i<=10) {
            System.out.println("I am thread1 not a treat1");
            i++;
        }
    }
}

class MyThreads2 implements Runnable {
    @Override
    public void run() {
        int i=0;
        while (i<=10) {
            System.out.println("I am thread2 not a treat2");
            i++;
        }
    }
}

public class Using_Runnable_Interface {
    public static void main(String[] args) {
        MyThreads myThreads1 = new MyThreads();
        Thread thread1 = new Thread(myThreads1);
        MyThreads2 myThreads2 = new MyThreads2();
        Thread thread2 = new Thread(myThreads2);
        thread1.start();
        thread2.start();
    }
}
