public class Test0422{
	public static void main(String[] args){
		System.out.println("20150422開發流程練習");
		int x=10, y=5;
		new A().minFunc(x, y);
		/* new B().maxFunc(x, y);
		new C().avgFunc(x, y);*/
	}
}

<<<<<<< HEAD

class A{

	public void minFunc(int c,int d){

		if(c>d)
		{
			System.out.println(c);
		}
		else
		{
			System.out.println(d);
		}
	}	
=======
class C{
	public void avgFunc( int i, int j ){
		System.out.println( "平均 = " + (i+j)/2 );
	}
>>>>>>> 155bc6ca3c7a2ca2a924690444a8c284b433fca2
}