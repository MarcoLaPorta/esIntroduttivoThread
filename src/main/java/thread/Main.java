package thread;

public class Main {
    public static void main(String[] args) {

        String nome = Thread.currentThread().getName();

        MyThread t = new MyThread("mioThread");
        t.start();

        for(int i = 0; i < 10; i ++){
            System.out.println(i + "- " + nome + " sta contando");;
            if(i == 5){
                try {
                    t.join();
                } catch (InterruptedException e) {
                    System.out.println("il thread si è interrotto in modo inaspettato");
                }
            }
        }

    }
}