

import org.example.CarroUsado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroUsadoTest {
    @Test
    void returnCarroUsadoNaoConservado() {
        CarroUsado carro = new CarroUsado();
        carro.setMarca("Ford");
        carro.setModelo("Focus");
        carro.setQuilometragem(100000);
        assertEquals("Carro Não Conservado", carro.verificarConservacao());
    }

    @Test
    void returnCarroUsadoConservado() {
        CarroUsado carro = new CarroUsado();
        carro.setMarca("Ford");
        carro.setModelo("Focus");
        carro.setQuilometragem(99999);
        assertEquals("Carro conservado", carro.verificarConservacao());
    }

    @Test
    void deveRetornarInformacoes() {
        CarroUsado carro = new CarroUsado();
        carro.setMarca("Ford");
        carro.setModelo("Focus");
        carro.setQuilometragem(99999);
        assertEquals("Carro usado{modelo=Focus, marca=Ford, conservação=Carro conservado}", carro.getInfo());

    }
}

