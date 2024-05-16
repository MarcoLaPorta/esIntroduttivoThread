package thread;

public class MyThread extends Thread{

    public MyThread(String nome){
        super(nome);
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i ++){
            System.out.println(i + "- " + this.getName() + " sta contando");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("il thread si è interrotto in modo inaspettato");
            }
        }
    }
}
