/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import controller.Fatorial;
import java.util.Scanner;
/**
 Fatorial
 */
public class Main
{
    public static void main(String[] args)
    {
        Fatorial funcao =new Fatorial();
        Scanner teclado =new Scanner(System.in);
        int n=teclado.nextInt();//não fiz validação de menor de que 12 
        int fat=funcao.fatorial(n);//chamada da recursiva enviando valor informado pelo usuario 
        System.out.println(fat);
    }
}
