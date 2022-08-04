package Mediator;

public class ColegaConcreto2 extends Colega{

    public void ColegaConcreto2() {
        System.out.println("Soy constructor en ColegaConcreto2");
    }
    @Override
    void recibe(){
        System.out.println("He recibido un mensaje, Soy ColegaConcreto2");
    }

    @Override
    void envia(){
        System.out.println("Soy ColegaConcreto2, envio un mensaje");
        mediator.reenvia(this);
    }

}
