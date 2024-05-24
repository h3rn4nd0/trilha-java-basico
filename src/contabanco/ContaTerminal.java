/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco;

import java.util.Scanner;

/**
 *
 * @author Licitação
 */
public class ContaTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Por favor, digite o número da Conta! ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        
        System.out.println("Por favor, digite o número da Agência! ");
        String agencia  = teclado.next();
        
        System.out.println("Por favor, digite o nome do Cliente! ");
        String nome_cliente  = teclado.next();
        
        System.out.println("Por favor, digite o Saldo! ");
        float saldo  = teclado.nextFloat();
        
        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma "
            + "conta em nosso banco, sua agência é " + agencia + ", conta"
            + " " + numero + " e seu saldo " + saldo + " já está disponível "
            + "para saque.");
    }
    
}
