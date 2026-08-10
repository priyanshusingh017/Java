class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("I am thread");
    }
}

class mythrs  implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" is running...");
    }
}


public class Constructores_thread {
    public static void main(String[] args) throws InterruptedException {
        Mythr thread1 = new Mythr("hello");
        thread1.start();
        Mythr thread2 = new Mythr("world");
        thread2.start();
        System.out.println("The id of the thread1 is " +thread1.getId());
        System.out.println("The name of the thread1 is " +thread1.getName());
        System.out.println("The id of the thread2 is " +thread2.getId());
        System.out.println("The name of the thread2 is " +thread2.getName());

        mythrs mythrs = new mythrs();
        Thread thread3 = new Thread(mythrs , "Download thread");
        thread3.start();
    }
}
