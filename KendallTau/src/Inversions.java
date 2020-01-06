
public class Inversions {
	 public static void main(String[] args) {

	        // two random permutation of size n
	        int n = Integer.parseInt(args[0]);
	        int[] a = KendallTau.permutation(n);
	        int[] b = KendallTau.permutation(n);


	        // print initial permutation
	        for (int i = 0; i < n; i++)
	        	System.out.println(a[i] + " " + b[i]);
	        System.out.println();

	        System.out.println("inversions = " + KendallTau.distance(a, b));
	    }
	}

