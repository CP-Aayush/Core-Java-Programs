class CallRun
{
public static void main(String s[])
{
Thread1 t1=new Thread1("thread1");
Thread2 t2=new Thread2("thread2");
Thread3 t3=new Thread3("thread3");

t1.run();
t2.run();
t3.run();

for(int i=1;i<=20;i++)
{
System.out.println(Thread.currentThread().getName());
try{
Thread.sleep(1000);
}
catch(Exception e)
{}
}
System.out.println(Thread.currentThread().getName()+" dead");
}
}
