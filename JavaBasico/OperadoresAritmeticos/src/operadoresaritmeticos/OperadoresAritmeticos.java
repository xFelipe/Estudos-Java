/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

import java.util.Random;

/**
 *
 * @author felipe
 */
public class OperadoresAritmeticos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*int n1 = 3;
       int n2 = 5;
       float m = (n1+n2)/2;
       System.out.println("A média é:" + Float.toString(m));
       System.out.printf("\n\nA média também é%.5f\n\n",m);*/
      
       /*int numero = 10;
       int valor = 4 + numero--;
       System.out.println(valor);*/
       
       int x = 4;
       x+=2;//x = x+2
        System.out.println(x);
       x-=3;//x = x-3
        System.out.println(x);
       x/=3;//x = x/3
        System.out.println(x);
       x*=5;//x = x*5
        System.out.println(x);
        
        
       Double teste = Math.PI;
        System.out.println(teste);//Exibe a constante PI.
        
       int teste2 = (int) Math.pow(5, 2);//Raiz quadrada
        System.out.println("\n5 elevado ao quadrado é :"+teste2);
        
       float teste3 = (float) Math.sqrt(25);//Potência
        System.out.println("A raiz quadrada de 25 é: "+teste3);
       
       double teste4 = Math.cbrt(125);//Riz Cúbica
        System.out.println("A raiz cúbica de 125 = "+teste4);
        
        
        //arredondamentos
        int t1 = Math.abs(-10);//Número absoluto. O negativo do valor.
         System.out.println("\nO valor absoluto de -10 é: "+t1);
        
        int t2 = (int) Math.floor(4.9);//Arredonda pra baixo, truncage(simplesmente retira número decimal), ou divisão inteira.
         System.out.println("4.9 arredondado para baixo é: "+t2);
        
        int t3 = (int) Math.ceil(4.2);
         System.out.println("4.2 arredondado para cima é: "+t3);
        
        int t4 = (int) Math.round(4.49);
         System.out.println("4.5 arredondado aritméticamente é: "+t4);
        
        
        //aleatoriedade
        double ale = Math.random();//gera valor aleatório entre 0 e 1
         System.out.println(ale);
        double ale2 = 5 + ale * (10-5);//número aleatório entre 5 e 10;
         System.out.println("Numero aleatório entre 5 e 10: "+ale2);
        int ale2int = (int) Math.round(ale2);
         System.out.println("Numero INTEIRO aleatório entre 5 e 10: "+ale2int);
        
        //OU
        
        Random rand = new Random();//(necessário incluir java.util.Random)
        int result = rand.nextInt(11);//Gera número inteiro entre 0 e 10
         System.out.println("\n"+result);
        
         System.out.println("Divisão de 2 int = int"+5/2);
         System.out.println("Divisão com pelo menos 1 float = float"+5f/2);// 5f/2 ou 5/2f ou 5f/2f o resultado será um float
         float teste123 = 5/2;
         System.out.println(teste123);
         teste123 = 5/2f;
         System.out.println(teste123);

    }


    
}
