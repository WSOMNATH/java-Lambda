package JavaLambda;
import java.util.Arrays;
import java.util.List;

public class LambdaQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Orders> orders=Arrays.asList(new Orders(2344),
				new Orders(70000),
				new Orders(60000));
	orders.stream().filter(t->t.getPrice()>10000).forEach(t -> System.out.println("order is accepted:"+t));
	}}