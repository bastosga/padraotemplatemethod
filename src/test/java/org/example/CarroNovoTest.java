import org.example.CarroNovo;
import org.example.CarroUsado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroNovoTest {
    @Test
    void returnCarroNovoConservado() {
        CarroNovo carro = new CarroNovo();
        carro.setMarca("Ford");
        carro.setModelo("Focus");
        assertEquals("Carro conservado", carro.verificarConservacao());
    }
    @Test
    void deveRetornarInformacoes() {
        CarroNovo carro = new CarroNovo();
        carro.setMarca("Ford");
        carro.setModelo("Focus");
        assertEquals("Carro novo{modelo=Focus, marca=Ford, conservação=Carro conservado}", carro.getInfo());

    }
}
