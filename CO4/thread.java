class fibo implements Runnable
{
  int x=0,y=10,sum=0,i,b=1;
 public void run() {
     System.out.println(x);
        System.out.println(b);
 for(i=2;i<y;i++) {
    sum=x+b;
    x=b;
    b=sum;
    System.out.println(sum);
   }
}
}
 class even implements Runnable {
 int x=0,y=10,i;
  public void run() {
 for(i=x;i<=y;i++)
   {
    if(i%2==0)
    System.out.println(i);
   }
}
}
public class thread {
 public static void main (String args[]) {
 fibo f1=new fibo();
 Thread t1=new Thread(f1);
 t1.start();
even e1=new even();
Thread t2=new Thread(e1);
t2.start();
}
}
