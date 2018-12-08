class Thread3 implements Runnable
{
int x;
public void run(){
for(int i=1;i<=5;i++)
{
System.out.println(Thread.currentThread().getName()+" "+x);
try{
Thread.sleep(1000);
}
catch(Exception e){}
}
}
}

class RunThread3
{
public static void main(String s[])
{
Thread3 t1=new Thread3();
t1.x=50;
Thread tt1=new Thread(t1,"thread1");
t1.start();

Thread t2=new Thread3();
t2.x=100;
Thread tt2=new Thread(tt,"Thread3");
tt3.start();
for(int i=1;i<=5;i++)
{
System.out.println(Thread.currentThread().getName());
try{
Thread.sleep(1000);
}
catch(Exception e){}
}
}
}
