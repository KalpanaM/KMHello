import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondTestKM {
	public static void main(String args[])
	{
		int[] i= {11,22,33,44,55};
		String[] STR = {"Aa","Bbb","Cccc"};
		for (int x=0;x<i.length;x++)
		{
			if(i[x]%2 ==0)
			{
				System.out.println(i[x]);
				//break;
			}
			else
			{
				System.out.println(i[x]+"is not mulitple of 2");
			}
		}
		ArrayList<String> AR=new ArrayList<String>();
		AR.add("One");
		AR.add("Two");
		AR.add("Three");
		System.out.println(AR.getLast());
		
		List<String> newSTR = Arrays.asList(STR);
		System.out.println(newSTR.contains("Aa"));
		
		String s="Hello Welcome to Selenium";
		String[] SArray=s.split(" ");
		System.out.println(SArray[0]+SArray[1]+SArray[2]+SArray[3]);
		
	}

}
