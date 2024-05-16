package thread;

public class Main {
    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();

        for(int i = 0; i < 10; i ++){
            System.out.println(i + "- il main sta contando");
        }

    }
}