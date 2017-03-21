package exerciciobhaskara;
import java.util.Scanner;
public class ExercicioBhaskara {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       //ENTRADA
       System.out.print("xl: ");
       double x1 = leitor.nextDouble();
       
       System.out.print("x2: ");
       double x2 = leitor.nextDouble();
       
       System.out.print("c: ");
       double c = leitor.nextDouble();
       
       //PROCESSAMENTO
       double s = x1 +x2;
       double p = x1 +x2;
       double a = c / p;
       double b = -(a * s);
       
       //SAIDA
        System.out.println(a + "x² + " + b +"x + " + c +" =0");
        
           
        
        
    }
    
}
