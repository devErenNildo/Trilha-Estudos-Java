package eren.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int somar(int numUm, int numDois){
        return numUm + numDois;
    }
}
