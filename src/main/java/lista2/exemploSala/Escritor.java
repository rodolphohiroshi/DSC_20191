package lista2.exemploSala;

/**
 * Created by Alunoinf_2 on 09/04/2019.
 */
public class Escritor implements Runnable{
    public void run(){

        for(int cont = 0; cont<10; cont++ ) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
