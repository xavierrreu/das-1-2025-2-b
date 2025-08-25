package br.univille.observer;

//isso é uma interface que foi criada justamente para que sigamos os princípios SOLID: Interface Segregation.
//Para que a classe implementadora não implemente diretamente a classe concreta (ConcreteSubscriber), mas utilize a interface que é implementada pela classe concreta final.
public interface Subscriber {

   public void update(String context);

}
