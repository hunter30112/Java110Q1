package p1;

class Cal_area
{
	double pi=3.14159;
	double radius;
	int length;
	int width;
	int height;
	double area1;
	double area2;
	
	void setRadius(double r)
	{
		radius=r;
	}
	
	void setBall_area()
	{
		area1 = ((4*(pi*(radius*radius*radius)))/3);
		System.out.println("˛y§ÎĹéżn"+area1);
	}
	
	void setWall_area()
	{
		area2 =2*((length*width)+(length*height)+(width*height));
		System.out.println("Ľß¤čĹéŞí­ążn"+area2);
		
	}
}

public class main {
	public static void main(String args[])
	{
		Cal_area s = new Cal_area();
		s.radius = 10;
		s.setBall_area();
		
		s.length =4;
		s.width =5;
		s.height =6;
		s.setWall_area();
		
	}

}
