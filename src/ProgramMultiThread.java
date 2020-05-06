import threads.JavaThread;

public class ProgramMultiThread {

    public static void main(String args[]) {
        System.out.println("Старт основного потока...");
        for (int i = 0; i < 5; i++) {
            new JavaThread(String.format("threads.JavaThread number %s", i+1)).start();
        }

        System.out.println("Финиш основного потока...");
    }
}
