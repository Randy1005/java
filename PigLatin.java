package homework1;

public class PigLatin {
	/*method to convert to upper case*/
	public static String upperCase(String input){
		//convert string to character array
		char[] arr = input.toCharArray();
		//modify first letter to upper case
		arr[0] = Character.toUpperCase(arr[0]);
		//return result
		return new String(arr);
	}

	public static void main(String[] args) {
		
		String inputStr;
		String firstCh;
		for(int i=0;i<args.length;i++)
		{
			inputStr = args[i];
			firstCh = inputStr.substring(0,1);
			if(firstCh.equals("a") || firstCh.equals("e") || firstCh.equals("i") || firstCh.equals("o") || firstCh.equals("u"))
			{
				String result = upperCase(inputStr);
				System.out.printf("%say ",result);
			}
			else
			{
				String strNoFirstChar;
				//get the string without the first character
				strNoFirstChar = inputStr.substring(1);
				//capitalize
				String result = upperCase(strNoFirstChar);
				//then print out in the format of "fLetter(uppercase) + the rest of strNoFirstChar + original firstChar +  'ay'"
				System.out.printf("%s%say ",result,firstCh);
			}
				
		}

	}

}
