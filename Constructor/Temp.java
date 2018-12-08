class Temp
{
int x=this.getX();
int getX()
{
System.out.println(x);//will show default value of x
return 20;
}
Temp()
{
System.out.println(x);
}
public static void main(String[] args)
{
new Temp();
}
}