//exercise 1

public class Array {

    public static double[] powArray(double[] dblArray, int n) {
        double[] newArray = dblArray;
        int i = 0;
        while (i < dblArray.length) {
            int j = 1;
            double curr = 1;
            while (j<=n) {
                curr *= dblArray[i];
                j+= 1;
            }
            newArray[i] = curr;
            i+=1;
        }

        return newArray;
    
    }


    public static void main(String[] arg) {
        
        //exercise 2 test
        double[] ex1Array = {1,2,3,4};
        double[] ex1 = powArray(ex1Array,3);
        
        System.out.print("{" + ex1[0]);
        for (int i=1; i<ex1.length;i++) {
            System.out.print(", " + ex1[i]);
            
        }
        System.out.println("}");
    }

}


