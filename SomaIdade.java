import java.util.Scanner;

public class SomaIdade {

  public static void main (String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    int idade, acumaladorIdades = 0; //acumulador
    int cont; //contador
    
    for (cont = 0; cont < 5; cont++) {
      System.out.println("Digite sua idade: ");
      idade = entrada.nextInt();
      acumaladorIdades += idade;
    }
    
    System.out.println("A soma das idades é : " + acumaladorIdades);
    
    entrada.close();
  }

}