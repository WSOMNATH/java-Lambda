package JavaLambda;
interface Addition {
	int add(int a,int b);
}
interface Subtract{

	int sub(int a,int b);
}
interface Multification{
	int mul(int a, int b);

}
interface Division{
	int div(int a, int b);
}
public class ArthematicOperationQ1 {
	public static void main(String[] args)
	{
		System.out.println("print addition ");
		Addition Add =(a,b)-> (a+b);
		System.out.println(Add.add(100,10));
		System.out.println("printing subtraction" );
		Subtract  Sub=(a,b)-> (a-b);
		System.out.println(Sub.sub(100,10));
	System.out.println("print multificatio");
Multification Mul =(a,b) -> (a*b);
System.out.println(Mul.mul(110,10));
System.out.println("print division");
Division Div = (a,b) -> (a/b);
System.out.println(Div.div(100,10));
}

	
}
