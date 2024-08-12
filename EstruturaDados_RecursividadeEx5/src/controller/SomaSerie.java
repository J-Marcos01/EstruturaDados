
package controller;

/**
 *
 * @author JM
 */
public class SomaSerie
{
    public SomaSerie()
    {
        super ();
    }
    
    public double funcaoSoma (int n)
    {
        double soma=0;//criação variavel soma com zero . 
        if(n==1)//condição de parada ,se parâmetro chegar a 1 retorne 1.
        {
          return 1;
        }
        else
        {
        soma = soma+1/(double)n; //soma recebe a soma +1 / n (convertido em double), na primeira passagem soma receberá 1/n 
        return soma+funcaoSoma(n-1);//chamada da recursiva , soma + recursiva de n-1 até atingir condição de parada.
        }
    
    }
}