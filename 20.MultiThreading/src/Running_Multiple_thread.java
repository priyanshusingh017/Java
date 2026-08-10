class thread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(
                    Thread.currentThread().getName() + " : " + i
            );
        }
    }
}

class thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}

class thread3 extends Thread {

    public void run() {

        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
    }
}

public class Running_Multiple_thread {

    public static void main(String[] args) throws InterruptedException {

        thread t1 = new thread();
        thread t2 = new thread();

        t1.start();
        t2.start();

//        thread2 t3 = new thread2();
//        t3.start();

        thread3 t4 = new thread3();
        t4.start();
        t4.join();

        System.out.println("Main thread continues...");
    }
}