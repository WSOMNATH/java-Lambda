package JavaLambda;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class lammbdaQ3 {
    public static void main(String[] args) {

        Predicate<String> checkL=str->str.length()>4;
        System.out.println(checkL.test("somanath"));


        Person p=new Person();
        Consumer<Person> setname=s->s.setName("soma");
        setname.accept(p);
        System.out.println(p.getName());


        Function<Integer,String> test1=i->i+5+" integer added to 5";
        test1.apply(6);
    }
}
class Person{
    String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}

