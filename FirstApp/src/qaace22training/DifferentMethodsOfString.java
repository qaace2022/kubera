package qaace22training;

public class DifferentMethodsOfString {

	public static void main(String[] args)
	{
		String myString = "Kubera", myString2 = " Varman", myString3="Kubera";
        String s="    hello   ", s1="";
        System.out.println(myString.charAt(5));
        System.out.println(myString.length());
        System.out.println(myString.equals("Kubera"));
        System.out.println(myString.concat(myString2));
        System.out.println(myString.indexOf("a"));
        System.out.println(myString.compareTo(myString3));
        System.out.println(myString.toUpperCase());
        System.out.println(myString.toLowerCase());
        System.out.println(s.trim());
        System.out.println(myString.split(""));
        System.out.println(s1.join(":","5","20"));
        System.out.println(myString.contains("era"));
        System.out.println(myString.substring(0,4));
        System.out.println(myString.replace("a","7"));
		
	}

}
