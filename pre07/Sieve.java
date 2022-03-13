//exercise 5

public class Sieve {

    public static boolean[] sieve(int n) {

        boolean[] isPrime = new boolean[n];
        
        for (int i=0; i<n; i++) {
            boolean prime = true;
            for (int j=2; j<n; j++) {
                if (i != j) {
                    if (i%j == 0) {
                        prime = false;
                    }
                }
                
            }
            isPrime[i] = prime;
        }
        return isPrime;
    }


    public static void main(String[] arg) {
        
        //exercise 5 test
        boolean[] ex1 = sieve(10);
        
        System.out.print("{" + ex1[0]);
        for (int i=1; i<ex1.length;i++) {
            System.out.print(", " + ex1[i]);
            
        }
        System.out.println("}");
    }

}


