public class ThreadA extends Thread {

    public ThreadA() {
    }

    public ThreadA(Runnable target) {
        super(target);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Thread!");
    }

    public static void main(String[] args) {
        new ThreadA().start();
        new ThreadA(new MyRunnable()).start();
    }
}
