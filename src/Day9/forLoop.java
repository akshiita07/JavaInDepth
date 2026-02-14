package Day9;

public class forLoop {

    static void printArrElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void printArrElementsTwoSkip(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }

    static void printArrElementsInReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swapArrElements(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    static void findDivisorsOf(int x) {
        int cnt = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                cnt++;
                System.out.print(i + " ");
            }
        }
        System.out.println("No of divisors of " + x + " are: " + cnt);
    }

    static void print2Darray(int[][] arr) {
        int maxScore=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("In row "+i);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("In clm  "+j);
                System.out.println(arr[i][j] + " ");
                if(maxScore<arr[i][j]){
                    maxScore=arr[i][j];
                }
            }
        }
        System.out.println("Max score is  "+maxScore);
    }

    static void printDotProduct(int[] arr1,int[] arr2) {
        int ans=0;
        for (int i = 0; i < arr1.length; i++) {
            ans+=arr1[i]*arr2[i];
        }
        System.out.println("Dot product is  "+ans);
    }

    static void printMatrixAddition(int[][] arr1,int[][] arr2) {
        int m=arr1.length;
        int n=arr1[0].length;
        int[][] ans=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Matrix addition ans is:");
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printMatrixMultiplication(int[][] arr1,int[][] arr2) {
        // arr1: m*n
        int m=arr1.length;
        int n=arr1[0].length;
        // arr2: n*p
        int p=arr2[0].length;
        //ans: m*p
        int[][] ans=new int[m][p];
        for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
                for(int k=0;k<n;k++){
                    ans[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("Matrix multiplication ans is:");
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void forEachLoop(int[] arr){
        for(int it:arr){
            System.out.print(it+" , ");
        }
    }

    public static void print2DiceCombinations(){
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
            System.out.print("("+i+","+j+")");

            }
            System.out.println();
        }
    }

    public static void print2DiceCombinationsForEach(int[] dice1,int[] dice2){
        for(int i:dice1){
            for(int j:dice2){
                System.out.print("("+i+","+j+")");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        printArrElements(arr);
        System.out.println();
        printArrElementsTwoSkip(arr);
        System.out.println();
        printArrElementsInReverse(arr);
        int[] arr2 = {0, 1, 2, 3, 4, 5};
        System.out.println("Swapping:");
        swapArrElements(arr2);
        printArrElements(arr2);

        System.out.println("Finding divisors:");
        findDivisorsOf(24);

        int[][] arr3 = {{2, 4}, {6, 8}, {1, 3}};
        System.out.println("Printing 2d array:");
        print2Darray(arr3);

        printDotProduct(new int[]{2,4,6},new int[]{1,3,5});
        printMatrixAddition(new int[][]{{1,2,3},{4,5,6},{7,8,9}},new int[][]{{9,8,7},{6,5,4},{3,2,1}});
        printMatrixMultiplication(new int[][]{{1,2,3},{4,5,6},{7,8,9}},new int[][]{{9,8,7},{6,5,4},{3,2,1}});

        System.out.println("Printing using for each loop:");
        forEachLoop(arr);

        System.out.println("Printing 2D dice combos:");
        print2DiceCombinations();
        print2DiceCombinationsForEach(new int[]{1,2,3,4,5,6},new int[]{1,2,3,4,5,6});
    }
}
