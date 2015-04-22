public class Test0422{
	public static void main(String[] args){
		System.out.println("20150422開發流程練習");
		int x=10, y=5;
		new A().minFunc(x, y);
		new B().maxFunc(x, y);
		new C().avgFunc(x, y);
	}
}

class B{
	public void maxFunc(int x,int y){
		if(x>y){
			System.out.println("max:"+x);
		}
	
		if(x<y){
			System.out.println("max:"+y);
		}
	}
}