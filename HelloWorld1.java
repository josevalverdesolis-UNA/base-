import java.util.function.*;

public class HelloWorld1 {
	public static void print(Object arg){ System.out.println(arg); }
	public static int pow(int x, int e){ return (int)Math.pow(x, e); }
	public static void main(String... args) {
		Integer x = 6;
		print(x);
		Integer y = 3;
		print(y);
		BiFunction<Integer, Integer, Integer> f = (x1, z) -> pow(z, x) + x * z + 1;
		print(f.apply(x, y));

		//---------------------------------------
		// Comments 
		//---------------------------------------
		// HelloWorld1.expresso
		/*
		  As HelloWorld0 but with a Binary Function
		  @author hooNous
		  @since Oct 6th, 2025
		*/
		// Expected 748
	}
}
