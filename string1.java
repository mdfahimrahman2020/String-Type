public class string1
{
	public static void main(String[] args)
	{
	  String name1 = " Fahim ";
	  String name2 = new String (" Rahman ");

	  // Printing String
	  System.out.println("\n\n\nFirst Name : "+name1);
	   System.out.println("\nLast Name : "+name2);

	   

	   //Check Length
	   int len1 = name1.length();
	   int len2 = name2.length();

	   System.out.print("\n\nLength of First Name : "+len1);
	   System.out.print("\n\nLength of Last Name : "+len2);

	   //Check Equals name1 and name2

	   if(name1.equalsIgnoreCase(name2))
	   {
	   	System.out.print("\n\nFirst Name and Last Name are equal");
	   }

	   else
	   {
	   	System.out.print("\n\nFirst Name and Last Name are not equal");
       }

       //Taking input char type 

	   char[] letters = {'a','b','c','d','e'};
	   System.out.println("\n\nCharacter type value : "+letters);

	   //Check which variable is contain which value.
	   boolean con = name1.contains("Fahim");
	   System.out.print("\n\nFirst name is contain \"Fahim\" : "+con);

	   //Check that the variable is empty or not empty.

	   boolean check = name1.isEmpty();
	   System.out.print("\nThe name1 variable is empty : "+check);


       //Addition string
	   String fullname = name1 + name2;
	   System.out.print("\nFull Name : "+fullname);

	   String name3 = "Md.";
	   String name4 = " Rahi";
       
       //Addition string by concat.
	   String fullname1 = name3.concat(name4);
	   System.out.println("\n\nFull Name : "+fullname1);

	   //Upper case

	   String upperName = fullname.toUpperCase();
	   System.out.println("Upper Name : "+upperName);
       
       //Lower case
	   String lowerName = fullname.toLowerCase();
	   System.out.println("Lower Name : "+lowerName);

	   //Starts with
	   boolean s = name1.startsWith("A");
	   System.out.println("Name Starts With A : "+s);

	   //Ends with
	   boolean e = name1.endsWith("m");
	   System.out.println("Name ends With m : "+e);

	   String country = "The name of my country is Bangladesh";
	   System.out.println("\n\n"+country);

	   //Check character at index
	   char ch = country.charAt(0);
	   System.out.println("At 0 index the character is : "+ch);

	   //ASCII value count.
	   int value = country.codePointAt(0);
	   System.out.println("ASCII value of index 0 : "+value);

	   //check index at character
	   int pos = country.indexOf('i');
	   System.out.println("\nFirst position of \"i\" is : "+pos);

	   int pos1 = country.lastIndexOf('i');
	   System.out.println("\nLast position of \"i\" is : "+pos1);

	   //Space remove.
	   String sp = country.trim();
	   System.out.println(country);

	   //Split the input
	   String[] si = country.split(" ");
	   for(String x : si)
	   {
	   	System.out.println(x);
	   }





	}
}