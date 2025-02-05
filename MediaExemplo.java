import java.util.Scanner;
//importa para o usuario escrever algo
    public class MediaExemplo{
        public static void main (String[] args) {
            Scanner entrada = new Scanner (System.in);
            System.out.print("Digite a primeira nota: ");
            double nota1 = entrada.nextDouble();
            
            System.out.print("Digite a segunda nota: ");
            double nota2 = entrada.nextDouble();
            
            double media = (nota1 + nota2) / 2;
            
            System.out.println("A média é: " + media);
            
            entrada.close();
        }
    }