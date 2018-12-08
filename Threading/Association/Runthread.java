class Thread1 implements Runnable
{
int x=10;
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(Thread.currentThreaad().getName());
}
}
Thread t1=new Thread("thread");
t1.start();
}

class RunThread
{
public static void main(String args[])
{
Thread1 t1=new Thread1();
Thread2 t1=new Thread2(t1,"thread");
t1.start();
Thread t2=new Thread2(t1,"thread2");
t2.start();
}
}
