import threads.JavaThread;

public class ProgramSingleThread {
    //простой запуск потока
    public static void main(String args[]) {
        System.out.println("Старт основного потока...");
        new JavaThread("threads.JavaThread").start();
        System.out.println("Финиш основного потока...");
    }
}
