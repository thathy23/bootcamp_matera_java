package org.example.modificador;

public class ContaCorrente {

    public static void main (String[] args) {
        Conta conta = new Conta(10.00);

        conta.setSaldo(10.00);
        System.out.println(conta.getSaldo());

    }
}
