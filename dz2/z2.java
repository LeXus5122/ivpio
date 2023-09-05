package dz2;

public class z2 {
    public static void main(String[] args) {
        int[] intArray = new int[10]; 

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching array index out of bounds exception: " + e);
        }
    }
}
