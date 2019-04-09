package lista2.ex4;

/**
 * Created by Alunoinf_2 on 09/04/2019.
 */
public class Start  {
    public static void main(String[] args){
        EscreverTexto et1 = new EscreverTexto();
        Thread t1 = new Thread(et1);

        EscreverTexto et2 = new EscreverTexto();
        Thread t2= new Thread(et1);

        EscreverTexto et3 = new EscreverTexto();
        Thread t3 = new Thread(et1);

        EscreverTexto et4 = new EscreverTexto();
        Thread t4 = new Thread(et1);

        EscreverTexto et5 = new EscreverTexto();
        Thread t5 = new Thread(et1);

        EscreverTexto et6 = new EscreverTexto();
        Thread t6 = new Thread(et1);

        EscreverTexto et7 = new EscreverTexto();
        Thread t7 = new Thread(et1);

        EscreverTexto et8 = new EscreverTexto();
        Thread t8 = new Thread(et1);

        EscreverTexto et9 = new EscreverTexto();
        Thread t9 = new Thread(et1);

        EscreverTexto et10 = new EscreverTexto();
        Thread t10 = new Thread(et1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

    }

}
