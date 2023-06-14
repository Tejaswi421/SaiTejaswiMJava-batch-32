package Day12;
import java.util.*;
public class program1 extends Thread {
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("first thread: "+i);
        }
    }
}
    class p2 extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("second thread: "+i);
            }
        }
            public static void main (String[]args)
            {
                program1 p1 = new program1();
                p2 p= new p2();
                p1.start();
                p.start();
            }
        }

