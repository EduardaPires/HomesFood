import java.util.ArrayList;

public class Cardapio {
    private ArrayList<String> cardapio;
    private int quantiaPratos;

    public Cardapio(){
        this.cardapio = new ArrayList<String>();
        this.quantiaPratos = 0;
    }

    public void adicionarPrato(String prato){
        cardapio.add(prato);
    }

    



}
