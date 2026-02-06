package Day4;

public class Methods {

    static double computeSum(double x,double y){
        return (x+y);
    }

    static double computeAvg(double x,double y){
        double sum=computeSum(x,y);
        return (sum/2);
    }

    static boolean searchEle(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        double x=3.0;
        double y=2.0;
        System.out.println("Sum of "+x+" and "+y+" = "+computeSum(x,y));
        System.out.println("Avg of "+x+" and "+y+" = "+computeAvg(x,y));
        //Passing arrays:
        int[] arr=new int[]{2,4,6,8};
        int k=10;
        System.out.println("Key "+k+" exists? = "+searchEle(arr,k));

    }
}
