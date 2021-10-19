public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    int[] arrsingle= {3,4,5,2,5};
    int[][]arr1 = {{2,8,3}, {7,4,2,75}, {1}};
    System.out.println(arrToString(arrsingle));
  }

  //0. Include function to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String result =  "";
    for(int i = 0; i < ary.length; i++){
      result += ary[i];
    }
    return result;
  }

  //The name can be the same, as long as the parameters are different!
  public static String arrToString(int[][]ary){
    String outcome = "";
    for(int i = 0; i < ary.length; i++){
      for(int j = 0; j<ary[i].length; j++){
        outcome += ary[i][j];
      }
    }
    return outcome;
  }

  //1. Calculate and return how many zeros are in the parameter.
  public static int countZeros2D(int[][] nums){
    return 0;
  }

  //2. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //When the row number is the same as the column number replace negative with 1
  //all other negatives replace with 0
  public static void replaceNegative(int[][] vals){

  }

  //3. Make a copy of the given 2d array. Make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  public static int[][] copy(int[][] nums){
    return new int[1][1];
  }
}
