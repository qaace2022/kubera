package qaace22training;

public class ReverseWIthoutLoop {

	public static void main(String[] args)
	{
		int number = 2999;
		String str = String.valueOf(number);
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		number = Integer.parseInt(builder.toString());
		System.out.println(number);

	}

}
