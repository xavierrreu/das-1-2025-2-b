package br.univille.observer;
import java.util.ArrayList;

public class Publisher {

    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    private String mainState;

    public Publisher subscribe(Subscriber s){
        subscribers.add(s);
        for (int i = 0; i < subscribers.size(); i++) {
            System.out.println(subscribers.get(i));
        }
        return this;
    }
    
    public Publisher removeSubscriber(Subscriber s){
        return null;
    }

    public Publisher notifySubscribers(){
        for (Subscriber s : subscribers){
            //envia notificacao
        }
        return null;
    }

    public Publisher mainBusinessLogic(){
        //var newState;
        //this.mainState=newState;
        return null;
    }


}
