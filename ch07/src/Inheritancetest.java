class MyPoint{
	int x;
	int y;
}

/*class Circle extends MyPoint{//상속
	int r;
}*/

class Circle{ //포함
	MyPoint p= new MyPoint();
	int r;
}
public class Inheritancetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		//c.x=1;
		//c.y=2;
		//c.r=3;
		//System.out.println(c.x);
		//System.out.println(c.y);
		//System.out.println(c.r);  //상속
		
		c.p.x=1;
		c.p.y=2;
		c.r=3;
		System.out.println(c.p.x);
		System.out.println(c.p.y);
		System.out.println(c.r);

	}

}
