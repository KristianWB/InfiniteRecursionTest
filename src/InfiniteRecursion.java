public class InfiniteRecursion {
    public static void main(String[] args)   {
        int i=0;
        infiniteLoopRecursion(i);

    }


    public static int infiniteLoopRecursion(int i)   {

        if (i==10) {
            System.out.print(i);
            return 10;
        }
        else {
            System.out.println(i);
            return infiniteLoopRecursion(i + 1);
        }


    }
}
