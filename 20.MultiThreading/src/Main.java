class MyThread extends Thread {
    @Override
    public void run() {
        int i=0;
        while(i<40) {
            System.out.println("My Thread is running");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i=0;
        while(i<40) {
            System.out.println("My Thread2 is running");
            i++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread2 myThread2 = new MyThread2();
        myThread.start();
        myThread2.start();

    }
}
