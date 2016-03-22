import java.util.*;

public class Passwd { 
    
    public static void main(String[] args){
        
        int[] Valor = new int [2];
        Scanner Entrada = new Scanner (System.in);
        
        Valor [0] = 1527958;
        System.out.println("Informe a senha padão");
        Valor [1] = Entrada.nextInt();
        
        while (Valor [0] != Valor [1]) {
                
            System.out.println("Senha Padão Incorreta. Tente Novamente !");
            Valor [1] = Entrada.nextInt();
    
        }
        
        if (Valor [1] == Valor [0]){
            System.out.println("Parabens! Vc acertou a senha Padão =D");
        }
    }
}

