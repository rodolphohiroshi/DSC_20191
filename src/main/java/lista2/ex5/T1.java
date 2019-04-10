package lista2.ex5;

/**
 * Created by Alunoinf_2 on 09/04/2019.
 */
public class T1 implements Runnable{
    int num;
    public T1(int num) {
        this.num = num;

    }
    public void run(){
        while(true){
            System.out.println("Thread : "+this.num);
        }
    }

}

