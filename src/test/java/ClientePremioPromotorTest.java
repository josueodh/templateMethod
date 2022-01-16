import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientePremioPromotorTest {

    @Test
    void deveRetornarInformacoesCliente(){
        ClientePremioPromotor cliente = new ClientePremioPromotor();
        cliente.setAvaliacao(10);
        cliente.setNome("Josué");
        assertEquals("Cliente Promotor{nome='Josué', nota=10}", cliente.getInfo());
    }

    @Test
    void deveRetornarComPremioPromotor(){
        ClientePremioPromotor cliente = new ClientePremioPromotor();
        cliente.setAvaliacao(9);
        assertEquals("Prêmio", cliente.verificarAvaliacao());
    }

    @Test
    void deveRetornarSemPremioPromotor(){
        ClientePremioPromotor cliente = new ClientePremioPromotor();
        cliente.setAvaliacao(8);
        assertEquals("Prêmio não disponível", cliente.verificarAvaliacao());
    }

}