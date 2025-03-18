package org.example.interfaces;

public class TesteInterface {
    public static void main(String[] args){
    ContaCorrente contaCorrente = new ContaCorrente();
    contaCorrente.depositar(5000.00);

    System.out.println( "Saldoconta corrente após deposito: " + contaCorrente.getSaldo());

    ContaPoupanca contaPoupanca = new ContaPoupanca();
    contaPoupanca.depositar(15000.00);
    System.out.println("Saldo conta poupança após deposito: "+contaPoupanca.getSaldo());

    contaPoupanca.sacar(800.00);
    System.out.println("Saldo conta poupança após o saque: " + contaPoupanca.getSaldo());
    }
}
