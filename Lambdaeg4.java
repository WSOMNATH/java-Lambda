package JavaLambda;

import java.util.ArrayList;

public class Lambdaeg4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method st
		ArrayList<String> listOfName= new ArrayList<>();
		listOfName.add("somabha");
		listOfName.add("Sachinbro");
		listOfName.add("Panjabib");
		System.out.println("before removing namee from  list "+listOfName);
		listOfName.removeIf(name ->(name.length()%2!=0));
		//if(name.length/2==0)
			//{
			//System.out.println(lastOfName);
			//};
		System.out.println("after removing");
		System.out.println(listOfName);
	}

}
