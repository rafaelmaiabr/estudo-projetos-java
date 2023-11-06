package a3JUnitMaven.maven;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarroTest {

    @Test
    public void testeMetodo() {
        Carro carro = new Carro("Toyota", "Corolla", 2022, "XYZ9876");
        assertEquals("Toyota", carro.getMarca());
        assertEquals("Corolla", carro.getModelo());
        assertEquals(2022, carro.getAno());
        assertEquals("XYZ9876", carro.getPlaca());
    }

    @Test
    public void testeMetodoGetMarca() {
        Carro carro = new Carro("Toyota", "Corolla", 2022, "XYZ9876");
        assertEquals("Toyota", carro.getMarca());
    }

    @Test
    public void testeMetodoGetModelo() {
        Carro carro = new Carro("Toyota", "Corolla", 2022, "XYZ9876");
        assertEquals("Corolla", carro.getModelo());
    }

    @Test
    public void testeMetodoGetAno() {
        Carro carro = new Carro("Toyota", "Corolla", 2022, "XYZ9876");
        assertEquals(2022, carro.getAno());
    }

    @Test
    public void testeMetodoGetPlaca() {
        Carro carro = new Carro("Toyota", "Corolla", 2022, "XYZ9876");
        assertEquals("XYZ9876", carro.getPlaca());
    }
}

