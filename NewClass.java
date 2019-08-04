
import java.util.*; 

public class NewClass 
{ 
	static String OTP(int len) 
	{  
		System.out.print("You OTP is : "); 
		String numbers = "0123456789"; 

		 
		Random rndm_method = new Random(); 

		String otp = ""; 

		for (int i = 0; i < len; i++) 
		{ 
			
			otp+= 
			numbers.charAt(rndm_method.nextInt(numbers.length())); 
		} 
		return otp; 
	} 
	public static void main(String[] args) 
	{ 
		Scanner s=new Scanner(System.in);
		int i=1,length = 4; 
		String input,result=OTP(length);
		System.out.println(result);
		System.out.println("Enter OTP as shown above");
		Boolean bool=true;
		i=1;
		while(bool && i<6)
		{
		input=s.next();
		if (result.equals(input)) {

			System.out.println("You are Verified");
			bool=false;
		}
		else if(i==5){
			System.out.println("Sorry You have tried maximum times ###\nPlease Try again after some times :(This is For Security Purpose");
		}
		else
			System.out.println("Enter correct value");
		i++;
	}

	} 
} 
