package lista2.ex4;

/**
 * Created by Alunoinf_2 on 09/04/2019.
 */
public class EscreverTexto implements Runnable{
    public void run(){

       // for(int i = 0; i<10;i++)
        System.out.println("Print da Thread : "+Thread.currentThread().getName());

    }
}
