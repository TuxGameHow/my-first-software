/***
 * 
 * Programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários em JOptionPane e devolvendo a média em DOS. 
 * 
 * 1- Criar banco de dados // Imaginagio xD // armazenarei dados em blocos
 * 2- pedir usuario para informar numero de Funcionarios
 * 3- Pedir usuario para informar nome dos funcionarios
 * 4- Pedir usuario para informar salario dos funcionarios
 * 5- Calcular media
 * 6- Mostrar media salarial
 * 
 * Tentando resolver problema =D - logica tecnica
 * 1 - capturar quantidade Pessoas / for 
 * 2 - Enquanto pessoas for = 1 Pedir nome Pessoas
 * 3 - Enquanto pessoas for = 1 Pedir salario Pessoas
 * 4 - calcular media "Apenas Salario Pessoas"
 */

import java.util.*;

public class Funcionarios {
    
public static void main(String[] args){
        
    Scanner Entrada = new Scanner (System.in);
    System.out.println("Informe quantidade de Funcionarios");
    short Funcionarios = Entrada.nextShort();
        
    for (byte x = 0; Funcionarios > x; ++x){
            
        int Numero = x + 1;
            
        System.out.println("Informe Nome é Salario do "+Numero+"° Funcionario\n\n");
        System.out.print("Nome: $ ");
        String NomeFuncionario = Entrada.next();
        System.out.print("Salario: $ ");
        double SalarioFuncionario = Entrada.nextDouble();
            
        if (Numero > 0){
                
            double Resultado = (SalarioFuncionario / Funcionarios) * 2;
            System.out.println("Media Calculada #: "+Resultado);
                
        } else {
            System.out.println("Erro 100.\nO Apricativo Falhou !");
        }
            
    }
        
        
        
} 
}

