package 메소드;

public class ValueParameter {

	public int increase(int n) {
		++n;
		return n;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var1 = 100;
		ValueParameter vp = new ValueParameter();
		int var2 = vp.increase(var1);
		System.out.println("var1: " + var1 + " var2: " + var2);
	}

}
