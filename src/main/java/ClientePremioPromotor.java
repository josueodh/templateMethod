public class ClientePremioPromotor extends Cliente {
    @Override
    public String verificarAvaliacao() {
        if(this.getAvaliacao() >= 9){
            return "Prêmio";
        }else{
            return "Prêmio não disponível";
        }
    }

    @Override
    public String getTipo(){
        return "Cliente Promotor";
    }
}
