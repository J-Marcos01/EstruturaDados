/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author JM
 */
public class ContaNegativo 
{
    public ContaNegativo()
    {
        super();
    }
    public int vetorNegativo (int []vet , int negativos, int tamanho)
    {
        
        if(tamanho==0)//condição de parada , se chegar a primeira posição do vetor tamanho =0 , retorne a contagem dos negativos .
        {
            return negativos;
        }
        else if(vet[tamanho-1]<0)//se o valor da posição for menor que zero , conte um negativo a mais ( negativo ++)
            {
                negativos++;
                return vetorNegativo (vet,negativos,tamanho-1);//chamada da recursiva , enviando o vetor completo , a contagem de negativos e o indice de comparação ( tamanho -1)
            }
         else
            {
                 return vetorNegativo (vet,negativos,tamanho-1);//chamada da recursiva , enviando o vetor completo , a contagem de negativos e o indice de comparação ( tamanho -1)
            }
        
    }
    
}
