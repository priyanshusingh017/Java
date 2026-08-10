class mythreads extends Thread {

    mythreads(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println(
                getName() + " started"
        );

        try {

            Thread.sleep(2000);

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

            System.out.println(
                    getName() + " interrupted"
            );
        }

        System.out.println(
                getName() + " finished"
        );
    }
}

public class Thread_Methods {

    public static void main(String[] args)
            throws InterruptedException {

        mythreads t1 = new mythreads("Worker");

        System.out.println("Name: " + t1.getName());

        System.out.println(
                "Alive before start: " + t1.isAlive()
        );

        t1.start();

        System.out.println(
                "Alive after start: " + t1.isAlive()
        );
        t1.interrupt();

        t1.join();

        System.out.println(
                "Alive after join: " + t1.isAlive()
        );
    }
}