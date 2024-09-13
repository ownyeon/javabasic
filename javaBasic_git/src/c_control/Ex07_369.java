package c_control;

public class Ex07_369 {

	public static void main(String[] args) {

		//1부터 50까지 369
		//각 자리수별로 한글자씩 뽑아내서 숫자가 있는지 아닌지 감지해야 한다. 
		for(int i=1; i<=50; i++) {
			int su = i;
			boolean su369 = false;
			
			//몇개인지 몰라서 while문을 씀
			while(su!=0) {
				int na = su%10; //26을 10으로 나누면 나머지는 6 
				//나머지 값으로 비교 
				if(na == 3 || na == 6 || na == 9) {
					System.out.print("짝");
					su369 = true;
				}
				su = su/10; //몫을 다시 넣음 2 -> 0 
			
			}
			//if문에 걸렸는지 안걸렸는지 여부가 필요함. 
			//true가 아니면 숫자 출력 
			if(!su369) {
				System.out.println(i);
			}else {
				System.out.println();
			}
			
		}
		
	}

}
