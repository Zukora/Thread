import threads.CommonResource;
import threads.JavaThread;
import threads.JavaThreadSync;

public class ProgramMultiThreadSync {
    //потоки ждут освобождения ресурса
    public static void main(String args[]) {
        System.out.println("Старт основного потока...");
        CommonResource res = new CommonResource();
        for (int i = 0; i < 5; i++) {
            JavaThreadSync javaThread =new JavaThreadSync(String.format("threads.JavaThread number %s", i+1), res);
            javaThread.start();
            try {
                javaThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Финиш основного потока...");
    }
}
