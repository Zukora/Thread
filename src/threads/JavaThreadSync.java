package threads;

public class JavaThreadSync extends Thread{
    CommonResource res;
    public JavaThreadSync(String name, CommonResource res){
        super(name);
        this.res = res;
    }
    //потоки ждут освобождения ресурса, передаваемого в конструкторе, изменяют его поочередно
    public void run(){
        synchronized(res){
            res.x = 1;
            for (int i=1; i<6;i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
            }
        }
    }

}
