public class Aeroporto implements ComunicacaoAerea{
    private static Aeroporto instancia = new Aeroporto();

    private Aeroporto() {}

    public static Aeroporto getInstancia(){
        return instancia;
    }

    public String recebePermissaoDePousar(String mensagem){
        return "O Aeroporto, recebeu o seu comunicado, seu navio tem permissão";
    }

    public  String recebeAvisoDeColisao(String mensagem){
        return "O Aeroporto, estara enviando apoio, mais rápido possível";
    }

    public  String recebeAvisoDeFalhaMecanica(String mensagem){
        return "O Aeroporto, enviamos equipe de manutenção ao seu local";
    }

}