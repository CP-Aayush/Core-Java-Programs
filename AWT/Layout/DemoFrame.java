import java.awt.*;
class DemoFrame
{
	Frame f;
	Button b;
	Label l;
	TextField tf;
	DemoFrame(String s)
	{
		f=new Frame(s);
		l=new Label("Enter the number");
		l.setBounds(40,40,80,20);
		f.add(l);
		tf= new TextField();
		tf.setBounds(150,40,50,20);
		f.add(tf);
		b=new Button("OK");
		b.setBounds(40,100,50,50);
		f.add(b);
		Toolkit t=f.getToolkit();
		Dimension screenSize=t.getScreenSize();
		int width=screenSize.width*8/10;
		int height=screenSize.width*8/10;
		//f.setBounds(width/8,height/8,width,height);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new DemoFrame("FF");
	}
}