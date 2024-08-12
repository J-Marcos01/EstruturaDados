/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
/*calcule o somatório do N primeiros números NATURAIS ( a função deve retornar
zero para números negativos )
*/

public class Recursividade1
{
    public Recursividade1()
    {
        super ();
    }
    
    public int somaNat( int n)
    {
        if (n<0) //condição de parada , se numero for menor que zero (= negativo ) retorna zero. 
        {
            return 0; 
        }
        else
        {
            return n+somaNat (n-1);//chamada, valor fornecido pelo usuário é somado a ele menos um até chegar a zero ( ultimo número natural )
                    
        }
        
    }
    
}
