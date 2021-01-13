package sorting;

import java.util.HashMap;
//bubbleSort using two loops
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		//HashMap<String, String> h = new HashMap<String, String>();
		int a[] = {5,1,12,-5,16};
		int k, temp = 0;
		for(int m = 0; m < a.length; m++)
		{
			for(int i = 0; i < a.length - 1; i++)
			{
				k = i+1;
				if(a[i]>a[k])
				{
					temp = a[i];
					a[i] = a[k];
					a[k] = temp;
				}
			}
		}
		for(int j : a)
		{
			System.out.println(j);

		}
	}
}
