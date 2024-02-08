import com.Junit.BancoDeDados;
import org.junit.jupiter.api.*;

public class ColsultarDadosTeste {
    @BeforeAll
    static void configuraBancoDeDados(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.inserirDados();
    }

    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removerDados();
    }


    @Test
    void validarDadosRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }

}
