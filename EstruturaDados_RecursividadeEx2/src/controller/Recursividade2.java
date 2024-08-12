
package controller;

/**
recebendo um vetor de inteiros , o tamanho do vetor e 0o valor da última posição do vetor
* como primeiro menor valor , retorne o menor valor contido neste vetor .
 */
public class Recursividade2
{
    public Recursividade2()
    {
        super ();
    }
    
    public int menorVetor (int[]vet,int menor , int tamanho )//comparação da recursiva será da última posição do vetor até a primeira 
    {
        if (tamanho==0)//condição de parada, se tamanho que servirá como indice da comparação chegar a zero , retorne menor.
        {
            return menor;
        }
        if(vet[tamanho-1]<menor) //comparar o valor da posição atual do vetor com o valor capturado em menor e trocá-lo caso cumpra o requisito IF.
        {
            menor=vet[tamanho-1];
        }  
        return menorVetor(vet,menor,tamanho-1);//chamada da recursiva , enviando o vetor ,o valor da rodada que corresponde o menor do vetor e a próxima posição a ser comparada(anterior a atual ).
        
    }
    
}
