public class Lab20{
  
  public static void main(String[] args){
    
    int[][] numbers = new int[5][5];
    
    for(int i = 0; i < numbers.length; i++){
      for(int j = 0; j < numbers[i].length; j++){
        numbers[i][j] = (int)(Math.random() * 5) + 1;
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }
    
    int[] sums = sumRows(numbers);
    for(int i = 0; i < sums.length; i++){
      System.out.print(sums[i] + " ");
    }
   
    System.out.println();
  }
  
  public static int[] sumRows(int[][] array){
    int[] sumArray;
    int sum = 0;
    int index = 0;
    
    if(array.length >= 0){
      sumArray = new int[array.length];
    }
    else{
      return null;
    }
    
    for(int i = 0; i < array.length; i++){
      sum = 0;
      for(int j = 0; j < array[i].length; j++){
        sum += array[i][j];
        
      }
      
      sumArray[index] = sum;
      index++;
    }
    
    return sumArray;
      
  }
}