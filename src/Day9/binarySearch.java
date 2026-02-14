package Day9;

public class binarySearch {

    public static void binarySearch(int key, int[] arr) {
        //on sorted arrays only
        int l = 0;
        int h = arr.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if(arr[mid]==key){
                System.out.println("Found key "+key+" at index: "+mid);
                return;
            }else if (arr[mid] > key) {
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println("Cannot find key "+key);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        binarySearch(7, arr);
        binarySearch(6, arr);
    }
}
