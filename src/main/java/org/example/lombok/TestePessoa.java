package org.example.lombok;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoaJulia = new Pessoa();

        pessoaJulia.setId(1L);
        pessoaJulia.setNome("Julia");
        pessoaJulia.setIdade(40);

        System.out.println(pessoaJulia.getId());
        System.out.println(pessoaJulia.getNome());
        System.out.println(pessoaJulia.getIdade());
    }
}
