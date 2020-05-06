package threads;

public class JavaThread extends Thread{
    //простой поток, который ждет полсекунды
    public JavaThread(String name){
        super(name);
    }

    public void run(){

        System.out.printf("поток %s стартовал... \n", Thread.currentThread().getName());
        try{
            //ценные действия потока
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Поток прерван");
        }
        System.out.printf("поток %s закончил работу... \n", Thread.currentThread().getName());
    }

}
