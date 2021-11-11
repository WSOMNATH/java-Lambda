package JavaLambda;

import java.util.ArrayList;
import java.util.List;

public class FirstlettrerQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int newArrayList;
List<String> Names=new ArrayList<>();
{
	Names.add("soma");
    Names.add("Momabhai");
    Names.add("sachin");
    StringBuilder result =new StringBuilder();
    Names.forEach(s ->result.append(s.charAt(2)));
    System.out.println(result);
    
	}

}
}