import java.util.Scanner;

public class Ebob_EkokTest {

	public static void main(String[] args) {
		 int number1;
		 int number2;
		 int i = 1;
		 int ebob = 1;
		 Scanner input=new Scanner(System.in);
		 
		 System.out.print("Birinci sayıyı giriniz:  ");
		 number1=input.nextInt();
		 
		 System.out.print("İkinci sayıyı giriniz:  ");
		 number2=input.nextInt();
		 
		 if (number1 < number2) {
			 
			while ( i  <= number1) {
				 if ((number1%i == 0) && (number2%i == 0)) {
					ebob=i;
					
					} i++;
					
			 }System.out.println("Girdiğiniz sayıların en büyük ortak böleni " + ebob);
		 } 
		 if (number2 < number1) {
			 while ( i  <= number2) {
				 if ((number1%i == 0) && (number2%i == 0)) {
					ebob=i;
					
					} i++;
					
			 }System.out.println("Girdiğiniz sayıların en büyük ortak böleni "+ ebob);
			 
		 }
		 
		 int ekok = (number1 * number2) / ebob;
		 System.out.println("Girdğiniz sayıların en küçük ortak katı: " + ekok);
	}

}
