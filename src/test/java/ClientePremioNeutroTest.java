import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientePremioNeutroTest {

    @Test
    void deveRetornarComPremioNeutro(){
        ClientePremioNeutro cliente = new ClientePremioNeutro();
        cliente.setAvaliacao(7);
        assertEquals("Prêmio", cliente.verificarAvaliacao());
    }

    @Test
    void deveRetornarSemPremioNeutro(){
        ClientePremioNeutro cliente = new ClientePremioNeutro();
        cliente.setAvaliacao(6);
        assertEquals("Prêmio não disponível", cliente.verificarAvaliacao());
    }

    @Test
    void deveRetornarInformacoesCliente(){
        ClientePremioNeutro cliente = new ClientePremioNeutro();
        cliente.setAvaliacao(6);
        cliente.setNome("Josué");
        assertEquals("Cliente Neutro{nome='Josué', nota=6}", cliente.getInfo());
    }



}