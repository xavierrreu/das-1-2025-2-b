package br.univille.observer;

public class Client {
    public static void main(String[] args) {
        var publicador = new Publisher();
        var sub1 = new ConcreteSubscriber();
        var sub2 = new ConcreteSubscriber(); //utilizamos o ConcreteSubscriber justamente porque eles já implementaram o Subscriber(interface) e são subscribers PRONTOS.

        // Se eu tentasse utilizar o Subscriber, eu precisaria reescrever o corpo do subscriber na hora
        // var subNaoPronto = new Subscriber(){

        // }

        //Inscrevendo novos subscribers
        publicador.subscribe(sub1);
        publicador.subscribe(sub2);

        //Enviando nova publicação por meio do publicador
        publicador.setMainState("BOM DIA");

        //Notificando subscribers
        publicador.notifySubscribers(); //gerará 2 notificações (mesma quantidade de subscribers na lista)

        publicador.removeSubscriber(sub2);

        publicador.setMainState("TCHAU SUB2");
        publicador.notifySubscribers();

        
    }    
}
