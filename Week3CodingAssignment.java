package week3LabsArraysAndMethods;

public class Week3CodingAssignment {

	public static void main(String[] args) {
		
		
	// 1. Created an array with the given values
	
		int [] ages = {3,9,23,64,2,8,28,93,98};
		// 1a Subtracted first value from the last value
		System.out.println(ages[ages.length - 1] - ages[0]);
		// 1b The 98 is my added value
		double sum = 0;
		for (int number : ages) {
			sum += number;		
		}
		double average = sum / ages.length;
			System.out.println(average);
		//	1c Used a loop to calculate the average
	
	// 2. Created the String array with the given names
		
		String [] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		// 2b Used a loop to iterate and calculate the average number of letters per name
		
		double sumOfLetters = 0;
		for (String name : names) {
			 sumOfLetters += name.length();
		 }
		 double averageLetters = sumOfLetters / names.length;
			System.out.println(averageLetters);
		// 2c	
		 for (String name : names) {
			 System.out.print(name + " ");
		 }
		 System.out.println();// I put this here to separate the concatenated list and the next question
		 
	// 3. 
		System.out.println(names[names.length - 1]);
	
	// 4.
		System.out.println(names[0]);
	
	// 5.
		int [] nameLengths = new int[names.length];
		for (int i = 0; i > names.length; i++) {
			System.out.println(nameLengths[i]);
		}
	// 6.
			int sumNames = 0;
			int [] nameLengths1 = new int[names.length];
			for (int j = 0; j < nameLengths1.length; j ++) {
				nameLengths1[j]=names[j].length();
			sumNames += names[j].length();
			}
			System.out.println(sumNames);
		
	// 7.Write a method that takes a String and an int and returns the word
	//	Concatenated to itself n number of times. 
		writeTheWord("Hello", 3);
		 System.out.println();
	// 8.Write a method that takes two strings, firstName and lastName, and returns a full name.
		writeFullName("Eduard", "Supler");
	// 9.Write a method that takes an array of int and returns true if the sum of all the ints
	//   is greater than 100
		int [] numbers = {1,7,55,6,8,10,45};
		System.out.println(isIt100(numbers));
	// 10.Write a method that takes and array of double and returns the average of all the 
	// elements in the array.
		double [] doubles = {2.5,3.6,4.56,8,25};
		System.out.println(arrayAverage(doubles));
	// 11. Wrete a method that takes two arrays and returns true if 1 average is greater than 2 average 	
		double [] doubles2 = {3.4,5.6,7.8,10.4};
		System.out.println(isAverageGreater(doubles,doubles2));
	// 12.Write a method willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
	// and returns true if it is hot outside and money is greater than 10.5
		boolean isHotOutside = true;
		double moneyInPocket = 9;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	// 13.My method will take words typed with caps lock on and lower case them.
		String word = "I'M NOT YELLING, YOU'RE YELLING!";
		System.out.println(whisper(word));
		
		
		
	}	
	// 7 method
		public static void writeTheWord(String word, int n) {
		for (int i = 0; i < n; i++) {
		 System.out.print(word);
		}}
	// 8 method	
		public static void writeFullName(String firstName, String lastName) {
			System.out.println(firstName + " " + lastName);
		}
	// 9 method	
		public static boolean isIt100 (int [] numbers) {
			int sum = 0;
		for (int num : numbers) {
			sum += num;}
			if (sum > 100) {
				return true;
			} else { 
				return false;
			}}
	// 10 method
		public static double arrayAverage(double[] doubles) {
			double sum = 0;
			for (double num : doubles) {
			sum += num;
			}
			return sum / doubles.length;
			}	
	// 11 method
		public static boolean isAverageGreater(double[]doubles, double[]doubles2) {
			double sum1 = 0;
			double sum2 = 0;
			for (double num : doubles) {
				sum1 += num;}
			for (double num : doubles2) {
				sum2 += num;
			if (sum1 > sum2);}
			return true;
			}
	// 12 method			
		public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket) {
			if ((isHotOutside = true) && (moneyInPocket > 10.5)){
			return true;
			}
			return false;
			}
	// 13 method
			public static String whisper(String word) {
			return word.toLowerCase();	
			 
			 
			 
			 
				
	
	
}}
	
