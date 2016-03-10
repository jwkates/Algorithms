class Main {
	public static int[] convert(String phrase)
	{
		int[] values = new int[phrase.length()];
		for(int i = 0; i < phrase.length(); i++)
		{
			values[i] = (int) phrase.charAt(i); 
		}
		return values;
	}
	
	public static void main(String[] args) {u
		float pi = 3.14159;
		System.out.println("This is a line");
		System.out.println("Pi is equal to " + pi + ". Everyone knows that.");
                System.out.println("This is the next best thing in middle of a print statement");
                int[] mysteryNums = convert("camel");
                for(int i = 0; i< mysteryNums.length; i++)
                {
                	System.out.print(mysteryNums[i] + " ")
                }

	}
	//Andrew Turley was here all the time in the past of the future
	//Jack Kates is using git.
}
