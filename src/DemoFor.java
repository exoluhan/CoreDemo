
public class DemoFor {

	public static void main(String[] args) {
		int i;
		
		for(i=1;i<=10;i++)
		{
			if(i==5) { continue;} // 5 will not be displayed
			System.out.println(i);
		}

	}

}
