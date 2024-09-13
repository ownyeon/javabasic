package d_array;

public class Ex04_2차원배열연습2 {

	public static void main(String[] args) {
		int a[][]=new int[][]{{3,-5, 12 }, 
			{-2, 11, 2, -7},
			{21, -21, -35, -93, -11},
			{9, 14, 39, -98}
			};

		//출력
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + "/");
			}
			System.out.println();
		}
		
		//각 행의 값들의 합이 가장 큰 행을 출력하기 
		int hap[] = new int[a.length]; //4
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				
				hap[i] = hap[i] + a[i][j];  
			}
		}
		//출력
		for(int i=0; i<hap.length; i++) {
		System.out.println(i+ "번째 줄의 합" + hap[i]);
		}
		
		//합이 가장 큰 행을 출력하기
		int max = hap[0]; //첫번째 행을 이미 저장하고 있음 
		int idx = 0;
		for(int i=1; i<hap.length; i++) {
			if(max<hap[i]) {
				max = hap[i];
				idx = i;
			}
		}
		//max는 hap[0]번째 값으로 10이 들어가져 있음. 
		
		System.out.println("합이 가장 큰 값" + max);
		System.out.println("합이 가장 큰 행 " + idx);
		
		
	}

}
