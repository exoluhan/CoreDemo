import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] n1= {2,3,12,4,12,-2};

        int[] n3 = new int[5];
 
        // Creating n2 array of having length of n1 array
        int[] n2 = new int[n1.length];
        // copying entire array n1 to n2
        System.arraycopy(n1,0,n2,0,n1.length);
        System.out.println("n2 = "+ Arrays.toString(n2));
        
        //copying elements from index 2 on n1 array
        //copying elements to index 1of n3 array
        //2 elements will be copied
        System.arraycopy(n1,1,n3,1,2);
        System.out.println("n3= "+ Arrays.toString(n3));
        

	}

}
