public class Test0422{
	public static void main(String[] args){
		System.out.println("20150422�}�o�y�{�m��");
		int x=10, y=5;
		new A().minFunc(x, y);
		/* new B().maxFunc(x, y);
		new C().avgFunc(x, y);*/
	}
}


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
}