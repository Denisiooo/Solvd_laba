package lambda;

public class OwnLambda {
    //1

    public interface IClassName<T> {
        String getClassName(T name);
    }

    public static IClassName<Object> name = x -> (x != null) ? x.getClass().getName() : null;

    public static void main(String[] args) {
        //1
        System.out.println(name.getClassName(new StudentsInfo()));
        //2
        Concat<String, String> concat = new Concat<>();
        concat.getString("hello", "world");
        //3
        GetSum<Integer, Integer> sum = new GetSum<>();
        sum.getSum(2,3);


    }
}

//2
class Concat<A, B> {

    public void getString(A s1, B s2) {

        concatSmth<A, B> con = (a1, a2) -> {
            String str1 = s1.toString();
            String str2 = s2.toString();
            return str1 + " " + str2;
        };

        String res = con.concat(s1, s2);
        System.out.println(res);
    }
}

interface concatSmth<T, Y> {
    String concat(T t1, Y t2);
}

//3
class GetSum<A extends Number, B extends Number> {
    public void getSum(A a, B b) {
        sumOfSmth<A, B> sumOfTwo = (a1, a2) -> {
            return a.intValue() + b.intValue();
        };

        int res = sumOfTwo.sum(a, b);
        System.out.println(res);
    }
}

interface sumOfSmth<A extends Number, B extends Number> {
    int sum(A a, B b);
}
