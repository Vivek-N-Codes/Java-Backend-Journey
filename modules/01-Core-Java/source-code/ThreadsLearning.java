class Str extends Thread {
    public void run() { // obj1.start(); runs this method run()
        for (int i = 0; i < 10; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(10); // sleep the currently executing thread for few millis.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Uvw extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Counter implements Runnable {
    public int count;

    public synchronized void increment() {
        count++;
    }



    public void run() {
        for (int i = 0; i < 10000; i++) {
            increment();
        }
    }
}

public class ThreadsLearning {
    public static void main(String[] args) throws InterruptedException {
        Str obj1 = new Str();
        Uvw obj2 = new Uvw();

        // obj1.setPriority(1);
        // System.out.println(obj1.getPriority());

        obj1.start(); // method name in class should be run() for calling using start();
        try {
            Thread.sleep(5); // optimization.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();

        // Usinf Runnable Interface.
        Runnable obj3 = new Runnable() { // can reduce the code using anonymous class instead of writing the extended
                                         // class.
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Ronaldo");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable obj4 = () -> { // can reduce the code more using lambda function.
            for (int i = 0; i < 5; i++) {
                System.out.println("Messi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(obj3); // Thread has multiple constructors and accept the object of the Runnable in a
                                      // constructor.
        Thread t2 = new Thread(obj4);

        // t1.setPriority(10); // scheduler schedule it as 10th priority only.
        // t2.setPriority(10);

        try {
            Thread.sleep(100); // for printing it after the Hii-Hello.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.start();
        t2.start();

        Counter c = new Counter();
        Thread t3 = new Thread(c);

        Thread t4 = new Thread(c);


        t3.start();
        t4.start();

        t3.join(); // Use to join the threads at a point on main thread (main thread executes after
                   // the join)
        t4.join();

        System.out.println("Count : " + c.count);
    }
}
