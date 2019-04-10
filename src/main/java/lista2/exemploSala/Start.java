package lista2.exemploSala;

/**
 * Created by Alunoinf_2 on 09/04/2019.
 */
public class Start {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Escritor());

        if (t1.isAlive()) {
            System.out.println("Thread viva");
        } else{
            System.out.println("Thread nascendo");
        }

        t1.start();

        if (t1.isAlive()) {
            System.out.println("Thread viva");
        } else{
            System.out.println("Thread morta");
        }

        t1.join(); // aguarda a thread t1 terminar

        if (t1.isAlive()) {
            System.out.println("Thread viva");
        } else{
            System.out.println("Thread morta");
        }
    }


}
