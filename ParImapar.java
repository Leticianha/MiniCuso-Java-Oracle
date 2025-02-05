import java.util.Scanner;

public class ParImapar {
  
  public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in); 
    double num;
    
    System.out.println("Digite um número: ");
    num = entrada.nextDouble();
    
    if((num%2)==0) {
      System.out.println(num + " = par");
    } else {
      System.out.println(num + " = impar");
    }
    
    entrada.close();
  }
  
}