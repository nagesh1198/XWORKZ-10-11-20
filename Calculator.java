class Calculator{
	
	public static int add(int a,int b){
	
		int sum=a+b;
		return sum;
	}
	public static int multiply(int a,int b){
	
		int mul=a*b;
		return mul;
	}
		public static double division(double a,double b){
	
		double div=b/a;
		return div;
	}
		public static double substraction(double a,double b){
	
		double sub=b-a;
		return sub;
	}
	public static void main(String args[]){
	int mam=Calculator.add(20,30);
	int mul=Calculator.multiply(50,60);
	double div=Calculator.division(25,50);
	double sub=Calculator.substraction(50,100);
	System.out.println("the sum is "+mam);
	System.out.println("the mul is "+mul);
	System.out.println("the div is "+div);
	System.out.println("the sub is "+sub);
	}
	
}