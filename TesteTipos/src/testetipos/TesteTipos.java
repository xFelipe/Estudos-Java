
package testetipos;


public class TesteTipos {


    public static void main(String[] args) {
        int idade = 30;
        String valor =  Integer.toString(idade);
        
        System.out.println(valor+"\n\n");
        
        
        valor = "40";
        idade = Integer.parseInt(valor);
        System.out.println(idade);
        
        
        
        String valor2 = "40.5";
        Float idade2 = Float.parseFloat(valor2);
        System.out.println(idade2);
        System.out.printf("%.4f\n", idade2);
    }
    
}
