public class Ready01 {
    public static void main(String[] args) {
		int number = 100;
		int evenSum = 0;
		
		for ( int i = 1; i<= number; ++ i ) {
			if ( i % 2 == 0 ) {
		        evenSum += i;
		        System.out.println( evenSum );
		    }
		
		}
	}

}
