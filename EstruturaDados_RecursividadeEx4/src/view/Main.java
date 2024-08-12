/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import controller.ContaNegativo;
/**
 *
 * @author JM
 */
public class Main 
{
    public static void main(String[] args) 
    {
        ContaNegativo contagem = new ContaNegativo();
        int []vet ={-5,5,-8,-2,11,-3};
        int tamanho=vet.length;//carregando número de elementos do vetor na variavel tamanho .
        int res = contagem.vetorNegativo(vet, 0, tamanho );//chamando recursiva com parâmetros , enviei 0 como contagem inicial de nenhum negativo .
        System.out.println(res);
        
            
    }
    
}
