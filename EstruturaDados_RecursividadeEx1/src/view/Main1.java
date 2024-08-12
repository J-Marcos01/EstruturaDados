
package view;
import controller.Recursividade1;
import java.util.Scanner;
/**
 *
 * @author JM
 */
public class Main1
{
    public static void main(String[] args)
      {
          Scanner teclado = new Scanner(System.in);
          Recursividade1 natural =new Recursividade1(); 
          int n =teclado.nextInt();
          int soma=natural.somaNat(n);
          System.out.println(soma);
    }
    
}
