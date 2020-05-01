import java.util.Scanner;

public class Index{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	int choice = 0;

	System.out.println("Select an option (1-8):");
	System.out.println();
	System.out.println("1. Excersice 1");
	System.out.println("2. Excersice 2");
	System.out.println("3. Excersice 3");
	System.out.println("4. Excersice 4");
	System.out.println("5. Excersice 5");
	System.out.println("6. Excersice 6");
	System.out.println();

	System.out.print("Choice: ");
	choice = input.nextInt();
	System.out.println();

	if(choice == 1){
		System.out.println("Excercise 1");
		System.out.println();
		Excersice1.main(null);
	}else if(choice == 2){
		System.out.println("Excercise 2");
		System.out.println();
		Excersice2.main(null);
	}else if(choice == 3){
		System.out.println("Excercise 3");
		System.out.println();
		Excersice3.main(null);
	}else if(choice == 4){
		System.out.println("Excercise 4");
		System.out.println();
		Excersice4.main(null);
	}else if(choice == 5){
		System.out.println("Excercise 5");
		System.out.println();
		Excersice5.main(null);
	}else if(choice == 6){
		System.out.println("Excercise 6");
		System.out.println();
		Excersice6.main(null);
	}else{
		System.out.println("Exit");
		System.out.println();
	}
  }
}