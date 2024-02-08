import com.Junit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {

    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa("Eren", LocalDate.of(2003, 12, 22));
        Assertions.assertEquals(20, pessoa.getIdade());
    }

    @Test
    void verificaSeEhDeMaior(){
        Pessoa pessoaTeste = new Pessoa("Pessoa um", LocalDate.of(2000, 05, 12));
        Assertions.assertTrue(pessoaTeste.maiorDeIdade());

        Pessoa pessoaTesteDois = new Pessoa("Pessoa dois", LocalDate.of(2010, 06, 20));
        Assertions.assertFalse(pessoaTesteDois.maiorDeIdade());
    }

}
