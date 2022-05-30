package br.com.marco.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemplosFilter {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();
        Stream<Pessoa> stream = lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Fem"));

    }
}
