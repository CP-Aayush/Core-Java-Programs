import java.awt.*;
class MyFrameViaAssociation{
	Frame f;
	MyFrameViaAssociation(String s)
	{
		Frame f=new Frame(s);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new MyFrameViaAssociation("FF");
		new MyFrameViaAssociation("SF");
	}
}