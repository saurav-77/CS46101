public class Exp10Solution {
    public static void main(String[] args) {
        Thread.currentThread().setName("First Thread");
        Thread taskS = new Thread(new Loop2(), "Second Thread");
        taskS.start();
        Thread taskT = new Thread(new Loop3(), "Third Thread");
        taskT.start();
        for (int i = 1; i <= 4; ++i) {
            System.out.println(Thread.currentThread().getName() + " is excecuting the loop1...");
        }
        System.out.println(Thread.currentThread().getName() + " finished executing loop1.");
    }
}

class Loop2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; ++i) {
            System.out.println(Thread.currentThread().getName() + " is executing the loop2...");
        }
        System.out.println(Thread.currentThread().getName() + " finished executing loop2.");
    }
}

class Loop3 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; ++i) {
            System.out.println(Thread.currentThread().getName() + " is executing the loop3...");
        }
        System.out.println(Thread.currentThread().getName() + " finished executing loop3.");
    }
}
