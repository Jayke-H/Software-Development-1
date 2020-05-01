//G00366827 Excersise 2
import java.util.Scanner;

	public class Excersice2{
   		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int result =0;

		System.out.println("Enter First number: ");
      	num1 = input.nextInt();
		System.out.println("Enter Second number: ");
      	num2 = input.nextInt();

      	result = num1 + num2;
      	System.out.println(num1+"+"+num2+"= "+result);

      	result = num1 - num2;
      	System.out.println(num1+"-"+num2+"= "+result);

      	result = num1 * num2;
      	System.out.println(num1+"*"+num2+"= "+result);

		Index.main(null);
	}
}






