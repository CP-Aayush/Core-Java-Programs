class Thread1 extends Thread
{
Thread1(String s)
{
super(s);
}
public void run()
{
for (int i=0;i<=5;i++)
{
System.out.println(Thread.currentThread().getName());
try{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(getName()+"dead");
}
}
}
}
class OneClassMultipleObject
{
public static void main(String args[])
{
Thread t1=new Thread("thread1");
Thread t2=new Thread("thread2");
Thread t3=new Thread("thread3");

t1.start();
t2.start();
t3.start();

for(int i=1;i<=5;i++)
{
System.out.println(Thread.currentThread().getName()+"dead");
}
}
}
