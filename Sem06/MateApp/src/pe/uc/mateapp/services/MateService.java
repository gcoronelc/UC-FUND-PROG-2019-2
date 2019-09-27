package pe.uc.mateapp.services;

public class MateService {

  public static int calcMCD(int num1, int num2) {
    while (num1 != num2) {
      if (num1 > num2) {
        num1 = num1 - num2;
      } else {
        num2 = num2 - num1;
      }
    }
    return num1;
  }
  
  
  public static int calcMCM(int num1, int num2) {
    int mcm;
    mcm = num1 * num2 / calcMCD(num1, num2);
    return mcm;
  }

}
