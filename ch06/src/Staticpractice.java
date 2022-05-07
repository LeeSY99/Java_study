
public class Staticpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}

class Mymath22{
	long a,b;
	long add() {
		return a+b; //iv를 사용하기때문에 매개변수 필요없음
	}
	
	static long add(long a, long b) {
		return a+b;
	}
}

class test{
	public static void main(String[] args) {
		System.out.println(Mymath22.add(200L,100L)); //객채생성 없이 호출가능
		
		Mymath22 mm = new Mymath22(); //인스턴스생성 , iv를 사용할때 사용바람
		mm.a=200L;
		mm.b=100L;
		System.out.println(mm.add());
	}
}