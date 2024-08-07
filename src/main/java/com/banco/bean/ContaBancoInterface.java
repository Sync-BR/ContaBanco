/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.banco.bean;

/**
 *
 * @author Eduar
 */
public interface ContaBancoInterface {

    String getAgencia();

    String getNomeCliente();

    int getNumero();

    double getSaldo();

    void setAgencia(String Agencia);

    void setNomeCliente(String NomeCliente);

    void setNumero(int Numero);

    void setSaldo(double Saldo);
    
}
