public class MyMath {

    public static void main(String[] args) {
        int c =4;
        int d = 10;
        int[] a = new int[] { 1, 20, 6, 5};
        System.out.println(howManyOfTheArray(c, d, a));
    }
    private static int howManyOfTheArray(int cc, int dd, int[] aa){
        int result = 0;
        for (int i=0; i < aa.length; i++){
            if ((aa[i] >= cc) & (aa[i]<= dd)) {
                result++;
            }
        }
        return result;
    }
}
