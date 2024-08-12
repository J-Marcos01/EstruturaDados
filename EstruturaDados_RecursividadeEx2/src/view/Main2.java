/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import controller.Recursividade2;
/*
recebendo um vetor de inteiros , o tamanho do vetor e o valor da última posição do vetor
como primeiro menor valor , retorne o menor valor contido neste vetor .
@author JM
 */
public class Main2
{
    public static void main(String[] args)
    {
        Recursividade2 funcao = new Recursividade2();
        int []vet={1,7,44,4,8};
        int tamanho=vet.length;//variavel carrega o tamanho do vetor
        int menor =vet[tamanho-1];//carregando o valor da última posição do vetor como menor valor 
        int resultado=funcao.menorVetor(vet, menor, tamanho);//chamada da recursiva 
        System.out.println(resultado);
        
    }
}
