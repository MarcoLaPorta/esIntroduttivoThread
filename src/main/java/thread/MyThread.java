package thread;

public class MyThread extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 10; i ++){
            System.out.println(i + "- il thread sta contando");
        }
    }
}