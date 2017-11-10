import java.lang.Math;

public class Shuffler{
  
    static int VALUE_COUNT = 15;   
    static int SHUFFLE_COUNT = 7; 
    
    public static void main (String args[]) {
         System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive perfect shuffles:");
        int[] values1 = new int[VALUE_COUNT];
        for (int i = 0; i < values1.length; i++) {
            values1[i] = i;
            }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.printf(" %2d", values1[k]);
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive efficient selection shuffles:");
        int[] values2 = new int[VALUE_COUNT];
        for (int i = 0; i < values2.length; i++) {
            values2[i] = i;
            }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.printf(" %2d", values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void perfectShuffle (int[] values) {
        int [] half1 = new int[VALUE_COUNT / 2];
        int [] half2 = new int[VALUE_COUNT - VALUE_COUNT / 2];
       
        
        
        for (int j = 0; j < VALUE_COUNT / 2; j++) {
            half1[j] = values[j];
        }
        for (int j = 0; j < VALUE_COUNT - VALUE_COUNT / 2; j++) {
            half2[j] = values[j + VALUE_COUNT / 2];
        }
        
        for (int j = 0; j < VALUE_COUNT / 2; j++) {
            half2[j] = values[2 * j];
            half1[j] = values[2 * j + 1];
        }
        
        if (VALUE_COUNT % 2 != 1) {
            half2[VALUE_COUNT - VALUE_COUNT / 2] = values[VALUE_COUNT - 1]; 
        }
    }
    
    public static void selectionShuffle (int[] values) {
        for( int k = VALUE_COUNT - 1; k >= 0; k-- ) {
            int r = (int)(Math.random() * k);
            int tmp = values[r];
            values[r] = values[k];
            values[k] = tmp;
        }
    }
}








