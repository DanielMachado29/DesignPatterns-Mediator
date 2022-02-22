import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CruzeiroTuristicoTest {
    @Test
    void deveSolicitarPermissaoAoPorto(){
        Jatinho cruzeiro = new Jatinho();
        assertEquals("Recebemos o seu contato.\nO Aeroporto responde conforme a solicitação\n"+
                        ">>O Aeroporto, recebeu o seu comunicado, seu navio tem permissão",
                cruzeiro.recebePermissaoDePousar("Estamos a 5km do Aeroporto, solicitou permissão de Ancorar."));
    }
    @Test
    void deveAvisarSobreColisaoAoPorto(){
        Jatinho cruzeiro = new Jatinho();
        assertEquals("Recebemos o seu contato.\nO Aeroporto responde conforme a solicitação\n"+
                        ">>O Aeroporto, estara enviando apoio, mais rápido possível",
                cruzeiro.recebeAvisoDeColisao("Tivemos uma colisão com Iceberg, solicito resposta mais rápido possível."));
    }

    @Test
    void deveAvisarFalhaMecanicaAoPorto(){
        Jatinho cruzeiro = new Jatinho();
        assertEquals("Recebemos o seu contato.\nO Aeroporto responde conforme a solicitação\n"+
                        ">>O Aeroporto, enviamos equipe de manutenção ao seu local",
                cruzeiro.recebeAvisoDeFalhaMecanica("Jatinho sem Fim, teve uma falha mecânica, necessito de apoio."));
    }

}