package com.banco.util;

import com.banco.bean.ContaBanco;
import java.util.Scanner;

/**
 *
 * @author SYNC
 * @since 07/08/2024
 * @version 1.0
 */
public class ContaTerminal {

    public static void main(String[] args) {
        ContaBanco addBanco = new ContaBanco();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número da agência:");
        addBanco.setNumero(entrada.nextInt());
        System.out.println("Digite a agência:");
        addBanco.setAgencia(entrada.nextLine());
        entrada.nextLine();
        System.out.println("Digite o nome do cliente");
        addBanco.setNomeCliente(entrada.nextLine());
        System.out.println("Digite o saldo");
        addBanco.setSaldo(entrada.nextDouble());

        System.out.println("===========================================================================");
        System.out.println();
        System.out.println();
        System.out.println("Olá " + addBanco.getNomeCliente() + " obrigado por criar uma conta em nosso banco, sua agência é " + addBanco.getAgencia() + " e seu saldo " + addBanco.getSaldo() + " já está disponível para saque ");
        System.out.println();
        System.out.println();
        System.out.println("===========================================================================");

    }
}
