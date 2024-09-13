package c_control;

public class Ex04_switch_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor=90, eng=75, math=70;
		int total = kor + eng + math; 
		int avg = total/3; 
		System.out.println(avg);
		
		
		char score = '\u0000'; //char에서는 빈문자가 존재하지 않음 원래는 유니코드 0값을 써야 함 \u0000 
		switch(avg/10) { //문자, 문자열, 정수 밖에 못들어감. 
		case 10: //100점일 경우를 대비해서
		case 9: score='A'; break;
		case 8: score='B'; break;
		case 7: score='C'; break;
		default:score='F'; 
		}
		System.out.println("당신의 학점은" + score);
	}
}

/*
 * 평균을 구해서 90점 이상이면 'A'학점
 * 90미만 80이상이면 'B'학점
 * 80미만 70이상이면 'C'학점
 * 그외는 'F'
 * (switch문 이용)
 */
