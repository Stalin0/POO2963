import java.util.Scanner;
public class SerieFibonacci {

    public static void main(String[] args) {
       
        Scanner teclado =new Scanner(System.in);
		int dato1=0, dato2=1, dato3, num;
		System.out.print("Enter a number for the Fibonacci series");
		num=teclado.nextInt();
		for(int i=0;i<num;i++){

	    	System.out.println(dato1);
	    	dato3=dato1+dato2;
	        dato1=dato2;
	        dato2=dato3;
	    }
	}
}