package br.univille.observer;

// seta vazada e tracejada no UML sempre significa implementação. Sempre que se utiliza "implements", todos os métodos da interface devem ser utilizados na classe relativa
public class ConcreteSubscriber implements Subscriber{

    public void update(String context) {
        System.out.println(context);
    }

}
