package Day9;

import java.util.Scanner;

public class whileLoop {

    public static void printArrElements(int[] arr){
        int i=0;
        int n=arr.length;
        while(i<n){
            System.out.print(arr[i]+" ");
            i++;
        }
    }

    public static void printArrElementsInReverse(int[] arr){
        int n=arr.length;
        int i=n-1;
        while(i>=0){
            System.out.print(arr[i]+" ");
            i--;
        }
    }

    public static void swapArrElements(int[] arr){
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        printArrElements(arr);
    }


    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 10};
        System.out.println("Printing elements:");
        printArrElements(arr);
        System.out.println("Reversing elements:");
        printArrElementsInReverse(arr);
        int[] arr2 = {0, 1, 2, 3, 4, 5};
        System.out.println("Swapping:");
        swapArrElements(arr2);

        System.out.println("Menu:");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Cake");
        System.out.println("4. Coffee");
        System.out.println("5. Matcha");
        System.out.println("Select your choice from 1 to 5:");
        Scanner s=new Scanner(System.in);
        int choice=s.nextInt();
        while(!(choice>=1 && choice<=5)){
            System.out.println("Wrong choice selected. Select your choice from 1 to 5:");
            choice=s.nextInt();
        }
        System.out.println("Order placed :)");

    }
}
