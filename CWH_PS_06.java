public class CWH_PS_06 {
    public static void main(String[] args) {
        // practice problem 1

//        float [] marks ={ 45.7f, 67.8f , 44.5f, 78.5f , 100.0f};
//        float sum = 0;
//        for(float element:marks){
//            sum= sum + element;
        //       }
//        System.out.println("The value of sum is " + sum);

        // practice problem 2

//        float [] marks ={ 45.7f, 67.8f , 44.5f, 78.5f , 100.0f};
//        float num = 47.7f;
//        boolean isInArray = false;
//        for(float element:marks){
//            if(num==element){
//                isInArray = true;
        //               break;
//            }
//        }
//        if(isInArray){
//            System.out.println("The value is in the array");
//        }
//        else{
//            System.out.println("The value is not in the array");
//        }
//

        //Practice problem 3
//        float[] marks = {45.7f, 67.8f, 44.5f, 78.5f, 100.0f};
//        float sum = 0;
//        for (float element : marks) {
//            sum = sum + element;
//        }
//        System.out.println("The value of average marks is " + sum / marks.length);

        //Practice problem 4
 //       int[][] mat1 = {{1, 2, 3},
 //               {4, 5, 6}};
 //       int[][] mat2 = {{2, 3, 4,},
 //               {7, 8, 9}};
 //       int[][] result = {{0, 0, 0},
 //               {0, 0, 0}};

  //      for (int i = 0; i < mat1[i].length; i++) {
 //           for (int j = 0; j < mat1[i].length; j++) {
 //               System.out.format("%d %d %d\n", i, j);
 //               result[i][j] = mat1[i][j] + mat2[i][j];
 //           }
//
 //       }
       //Problem number 5
//        int [] arr = {1,23,3,45,5};
//        int l = arr.length;
//        int n =  Math.floorDiv(l,2);
//        int temp;
//        for(int i=0; i<n; i++){
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for(int element: arr){
//            System.out.println(element+ " ");
//        }

        //problem 6
        int [] arr = {34, 23, 12, 54, 78, 89};
        int max = 0;
        for(int e: arr){
            if(e>max){
                max= e;
            }
        }
        System.out.println("the value of maximum element is " + max);


    }
}
