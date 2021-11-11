package JavaLambda;
//package JavaLambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ThreadQ8 extends Thread {
	public void run() {
	System.out.println(Thread.currentThread());
	List<Integer> values=Arrays.asList(12,10,15,15,13,15);
values.forEach(i-> System.out.println(i));}}