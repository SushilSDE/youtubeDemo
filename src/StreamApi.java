import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) 
	{
		String[] str = {"I", "AM", "LONGEST", "WORD"};
		
		Arrays.stream(str).sorted((x,y)->y.length()-x.length()).map(x->"$"+x+"$").forEach(x->System.out.println(x.length()+" : "+x));//.collect(Collectors.toList());
		//Test the Student Object.
		Student std = new Student(2,"SushilSingh");
		System.out.println("FirstObject>>"+std.toString());
		Student std1 = new Student(3,"SushilKumar");
		System.out.println("SecondObject>>"+std1.toString());
		//print(lst);
	}

	private static void print(List<String> lst) 
	{
		for(String str_Var: lst)
		{
			System.out.println(str_Var.length()+" : "+str_Var);
		}
	}

}
//String str="Sush";
//O/P: 
//7 : LONGEST
//4 : WORD
//2 : AM
//1 : I