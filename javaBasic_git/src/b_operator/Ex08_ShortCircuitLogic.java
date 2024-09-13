package b_operator;

public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {
		
		int a = 3; 
		if (a>3 & ++a>3) { //&&를 쓰면 a가 4? , 이미 a>3이 false가 나왔기 때문에 뒤에 있는 걸 개발하지 않는다.
			//근데 자바에서는 &를 하나로만 하면 4가 나온다. 이것의 이름을 shortcircuitlogic이라고 한다. 
			System.out.println("조건만족");
		}
		
		System.out.println("A=" + a);
		
		
		//----------------------------
		int b = 3;
		if(b>1 | ++b>3) { //||를 쓴다면 앞에서 true이다. 이미 앞에서 결론이 났기 때문에 ++b가 적용되지 않음.
			//그래서 일반논리를 못쓰게 이진논리로 써주자. 
			System.out.println("조건만족2");
		}
		System.out.println("B=" + b);
		
	}

}
