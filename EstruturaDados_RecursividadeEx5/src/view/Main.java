
package view;
import controller.SomaSerie;
/**
 *
 * @author JM
 */
public class Main 
{
    public static void main(String[] args) 
    {
        SomaSerie soma =new SomaSerie();
        int n =3;
        double res=soma.funcaoSoma(n);//chamada da recursiva , variavel de resposta ficou como double devido soma de frações  .
        System.out.println(res);
                  
    }
    
}
