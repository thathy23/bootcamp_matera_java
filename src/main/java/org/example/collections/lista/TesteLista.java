package org.example.collections.lista;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {

    public static void main(String[] args) {

        List<String> contas = new ArrayList();

        contas.add("Conta Poupança");
        contas.add("Conta Corrente");
        contas.add("Conta Pagamento");

        System.out.println("Conta 1: " + contas.get(0));
        System.out.println("Conta 2: " + contas.get(1));
        System.out.println("Conta 3: " + contas.get(2));

       // System.out.println("Conta 4: " + contas.get(3)); erro nao existe esse index
    }
}
