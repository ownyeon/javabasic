package a_datatype;

public class Ex03_연숩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//국어점수 변수 선언 
		int kor;
		//영어점수 변수 선언
		int eng;
		
		//국어점수 변수에 90점 지정
		kor = 91;
		//영어점수 변수에 100점 지정
		eng= 100;
		//총점 변수 선언
		int total;
		//총점 계산하기
		total = kor + eng;
		
		
		
		//총점 출력 
		System.out.println("총점:" + total);
	
	
		//평균을 구해서 출력 
		double avg; 
		avg = total/2.0; //avg를 계산할때 2.0으로 해야 한다. 
			//만약에 점수가 91이라면 191/2 = 95.5
			//정수형끼리 연산한 결과는 정수형임 (**중요) 
			//나는 실수형끼리 하고 싶기 때문에 avg를 2.0으로 바꿔야 한다. 
		System.out.println("평균: " + avg);
	
	
	
	}

}
