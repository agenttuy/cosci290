/*
  randomNum = minimum + (int)(Math.random() * maximum);
*/

public class TestRandomStuff{

  public static void main(String[] args){
    for(int i = 0; i < 10; i++){
      int random = 0 + (int)(Math.random() * 2);
      System.out.println(random);
    }
  }
}