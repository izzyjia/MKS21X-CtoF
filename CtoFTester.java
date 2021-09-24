//the type should be int
public class CtoFTester{
  public static void main(String[] args){
    celsiusToFahrenheit(20);
    fahrenheitToCelsius(20);
  static void celsiusToFahrenheit(int x){
    return((x * 9/5) + 32));
  static void fahrenheitToCelsius(int y){
    return((y - 32) * (5/9));
  }
  }
}
