//exercise 4

public class Max {

    public static int indexOfMax(int[] anArray) {
        
        int indNum = -1;
        int maxNum = 0;
        for (int i=0; i<anArray.length; i++) {
            if (anArray[i] > maxNum) {
                maxNum = anArray[i];
                indNum = i;
            }
        }
        return indNum;
        
    }


    public static void main(String[] arg) {
        
        //exercise 4 test
        int[] ex1Array = {1,8,3,4};
        int ex1 = indexOfMax(ex1Array);
        
        System.out.println(ex1);
    }

}


