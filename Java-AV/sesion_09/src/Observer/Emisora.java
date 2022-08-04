package Observer;

import java.util.ArrayList;
import java.util.Observer;

public class Emisora {
    private ArrayList<Receptor> receptor = new ArrayList();

    public void meteReceptor(Receptor receptor) {
        this.receptor.add(receptor);
    }

    public void emite() {
        for (Receptor receptor : receptor){
            receptor.recibe();
        }
    }
}
