/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
Fatorial 
*/
public class Fatorial 
{
    public Fatorial()
    {
        super();
    }
    
    public int fatorial (int x)
    {
        if(x==1)//condição de parada 
        {
        return 1; //se valor chegar a 1 , retorne 1 pois última multiplicação do fatorial é *1.
        }
        else
        {
        return x*fatorial(x-1);//chamada , valor recebido *valor -1 até atingir a condição de parada .    
        }
    }
}
