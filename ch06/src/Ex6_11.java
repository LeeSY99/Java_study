class Data_1 {
	int value;  //생성자가 하나도 없는경우 자동생성
}

class Data_2 {
	int value;
	
	//Data_2() {}//기본생성자 꼭 넣어주기 바람
	Data_2(int x) {   // 매개변수 있는 생성자
		value = x;
	}
}

class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		//Data_2 d2 = new Data_2(); // compile error //기본생성자가 없어서 그럼
		
	}
}