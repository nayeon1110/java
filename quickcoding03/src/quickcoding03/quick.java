package quickcoding03;


import java.util.*;

import java.io.*;

 

 

public class quick {

 

	public static void main(String[] args) throws Exception{

		

			Scanner sc = new Scanner(System.in);

			

			String str1 = sc.nextLine();

			String str2 = sc.nextLine();

			

			int a, b;

			

			try{

				a = Integer.parseInt(str1);

				b = Integer.parseInt(str2);

				

				if ( a >= 1000 || b >= 1000 )

					throw new Exception();

				a /= b;

			}

			catch (NumberFormatException exc1){

				System.out.println("It is not number");

			}

			catch (ArithmeticException exc2){

				System.out.println("It can't Devided by Zero");

			}

			catch (Exception exc3){

				System.out.println("Number is too big");

			}

			

	}

}

