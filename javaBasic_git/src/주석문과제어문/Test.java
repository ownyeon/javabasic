package 주석문과제어문;

class Test{

	   static String str = "";

	static void method( int i ){ //2  //8

	     try{

	if ( i == 10 ) throw new Exception(); //3 //9

	str += "A"; //4 

	     } catch( Exception ex ) { //10

	 str += "B"; //11

	 return; //12

	     } finally {

	str += "C"; //5 //13

	     }

	str += "D"; //6

	}

	public static void main( String [] args ) {   

	    method( 5 ); //1

	    method( 10); //7

	System.out.println(str); //14

	}

	}