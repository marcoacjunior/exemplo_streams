package br.com.marco.streams;

import java.util.List;
import java.util.stream.Stream;

public class ExemplosForEach {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        lista.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("*********");
        System.out.println("*********");

        lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Fem"))
                .forEach(p -> System.out.println(p.getNome()));
    }
}
