package Oops_programs;

class Sum{
	void sumopertion() {
		int b=4;
		int a=2;
		System.out.println("sum is="+(a+b));
	}
} 
class multiply extends Sum{
	void multiplicationopertion() {
		int c=9;
		int d=3;
		System.out.println("sum is="+(c*d));
	}
} 
public class Single_inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiply mul=new multiply();
		mul.sumopertion();
		mul.multiplicationopertion();
	}

}
