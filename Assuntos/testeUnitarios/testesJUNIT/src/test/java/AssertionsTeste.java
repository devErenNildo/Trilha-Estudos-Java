import com.Junit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AssertionsTeste {

    @Test
    void validarArrays(){
        int[] primeiroLancamento = { 10, 20, 30, 40 };
        int[] segundoLancamento = { 10, 20, 30, 40 };
        int[] terceiroLancamento = {1, 2, 3, 4};

        //VERIFICA SE OS ARRAYS TEM O MESMO VALOR
        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);

        //VERIFICA SE OS ARRAYS TEM VALOR DIFERENTES
        Assertions.assertNotEquals(primeiroLancamento, terceiroLancamento);
    }

    @Test
    void validaPessoaNula(){
        Pessoa pessoaNova = null;
        Assertions.assertNull(pessoaNova);

        pessoaNova = new Pessoa("Pessoa teste", LocalDate.now());
        Assertions.assertNotNull(pessoaNova);
    }






}
