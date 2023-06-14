package Day12;

public class program2 implements Runnable
{
    public void run()
    {
      for(int i=1;i<=10;i++)
      {
          System.out.println(i);
      }
    }
    public static void main(String[] args)
    {
        program2 p2 = new program2();
        Thread t1 = new Thread(p2);
        t1.start();
    }
}
