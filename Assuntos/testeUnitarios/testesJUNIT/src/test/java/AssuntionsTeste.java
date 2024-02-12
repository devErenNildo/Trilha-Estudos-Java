import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssuntionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioEren(){
        Assumptions.assumeTrue("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
