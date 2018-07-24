
class base1 {
	base1(int i){
		System.out.println("Number is "+i);
	}
}
class sub1 extends base1{
	sub1(){
		super(10);
	}
	sub1(int i){
		super(i);
		System.out.println("Number is "+i);
	}
	sub1(int i,int j){
		super(j);
		System.out.println("Number is "+i+" and "+j);
	}
	
}
