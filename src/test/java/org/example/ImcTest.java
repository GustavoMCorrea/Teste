package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImcTest {

    Imc imc;

    @BeforeEach
    void setUp() {
        imc = new Imc();
    }

    @Test
    void deveRetornarFemininoAbaixoPeso(){
        imc.setPeso(48.89);
        imc.setAltura(1.60);
        imc.setSexo("F");
        assertEquals("Abaixo do peso", imc.calcularImc());
    }
    @Test
    void deveRetornarFemininoPesoNormal(){
        imc.setPeso(66.04);
        imc.setAltura(1.60);
        imc.setSexo("F");
        assertEquals("No peso normal", imc.calcularImc());
    }

    @Test
    void deveRetornarFemininoMarginalmenteAcimaDoPeso(){
        imc.setPeso(69.88);
        imc.setAltura(1.60);
        imc.setSexo("F");
        assertEquals("Marginalmente acima do peso", imc.calcularImc());
    }

    @Test
    void deveRetornarFemininoAcimaDoPesoIdeal(){
        imc.setPeso(82.42);
        imc.setAltura(1.60);
        imc.setSexo("F");
        assertEquals("Acima do peso ideal", imc.calcularImc());
    }

    @Test
    void deveRetornarFemininoObeso(){
        imc.setPeso(82.69);
        imc.setAltura(1.60);
        imc.setSexo("F");
        assertEquals("Obeso", imc.calcularImc());
    }
}