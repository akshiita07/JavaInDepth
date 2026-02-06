package Day4;

public class Arrays {

    static void arraysMethod1(){
        System.out.println("\nIn method 1:");
        int[] scores=new int[4];
        scores[0]=90;
        scores[1]=70;
        scores[2]=80;
        scores[3]=100;
        System.out.println("Math score is= "+scores[0]);
        System.out.println("Science score is= "+scores[1]);
        System.out.println("English score is= "+scores[2]);
        System.out.println("Hindi score is= "+scores[3]);
    }

    static void arraysMethod2(){
        System.out.println("\nIn method 2:");
        int[] scores=new int[]{90,70,80,100};
        System.out.println("Math score is= "+scores[0]);
        System.out.println("Science score is= "+scores[1]);
        System.out.println("English score is= "+scores[2]);
        System.out.println("Hindi score is= "+scores[3]);
    }

    static void arraysMethod3(){
        System.out.println("\nIn method 3:");
        int[] scores= {90,70,80,100};
        System.out.println("Math score is= "+scores[0]);
        System.out.println("Science score is= "+scores[1]);
        System.out.println("English score is= "+scores[2]);
        System.out.println("Hindi score is= "+scores[3]);

        System.out.println("Size of array is= "+scores.length);
    }

    static void arraysMethod4(){
        System.out.println("\nIn method 4:");
        TypesOfVariables[] students=new TypesOfVariables[3];
        students[0]=new TypesOfVariables();
        students[0].name="Akshita";
        students[0].gender='F';
        students[0].age=20;
        students[1]=new TypesOfVariables();
        students[1].name="Saanvi";
        students[1].gender='F';
        students[1].age=13;
        students[2]=new TypesOfVariables();
        students[2].name="Ritesh";
        students[2].gender='M';
        students[2].age=52;

        System.out.println("Student 1 details: Age="+students[0].age+" Name= "+students[0].name+" Gender= "+students[0].gender);
        System.out.println("Student 2 details: Age="+students[1].age+" Name= "+students[1].name+" Gender= "+students[1].gender);
        System.out.println("Student 3 details: Age="+students[2].age+" Name= "+students[2].name+" Gender= "+students[2].gender);

        System.out.println("Size of array is= "+students.length);
    }

    static void twoDimArrays(){
        System.out.println("\nIn 2D array section:");
        int[][] arr1=new int[3][3];
        int[][] arr2=new int[][]{
                //{row,clm}
                {0,0},
                {0,1},
                {1,0},
                {1,1}
        };
        int[][] arr3={{0,0},{0,1},{1,0},{1,1}};

        System.out.println("Size of array1 is: Rows= "+arr1.length+" Clms= "+arr1[0].length);
        System.out.println("Size of array2 is: Rows= "+arr2.length+" Clms= "+arr2[0].length);
        System.out.println("Size of array3 is: Rows= "+arr3.length+" Clms= "+arr3[0].length);
    }

    public static void main(String[] args){
//        arraysMethod1();
//        arraysMethod2();
//        arraysMethod3();
//        arraysMethod4();
        twoDimArrays();
    }

}
