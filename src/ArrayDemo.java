
public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] age= {12,4,5,33,2,88};
		System.out.println("Using for loop: ");
		for(int i=0;i<age.length;i++)
		{
			if(i==4)
			{break;}
			System.out.println(age[i]);
		}

	}

}
