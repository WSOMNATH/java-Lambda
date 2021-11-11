package JavaLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

class Myoperator implements UnaryOperator<String>{

	@Override
	public String apply(String t) {
		// TODO Auto-generated method stub
		return t.toUpperCase();
	}
	
}

public class UpperCaseQ6{
	//ivate static final UnaryOperator<String>  = null;

	public static void main(String[] args)
	{
		List<String>  str=new ArrayList<>();
		str.add("soma");
		str.add("sachin");
		str.add("rushi");
System.out.println("all element iinlist");
System.out.println(str);
System.out.println(".....................................");
System.out.println(" ");
str.replaceAll(new Myoperator());
System.out.println(".......................................");
System.out.println("element inlist after replacing with upper case letter");
System.out.println(str);
		
}
	
}
