
class Base
{
	int x=50;
}
class Child extends Base
{
	int x=20;
	void show()
	{
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(this);
	}
	public static void main(String s[])
	{
		Child c1=new Child();
		c1.show();
	}
}