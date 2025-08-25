package br.univille.observer;
import java.util.ArrayList;

public class Publisher {

    //private Subscriber[] subscribers = new Subscriber[10];           //esse código utiliza uma lista padrão. No caso, limitada a 10 posições.
    private ArrayList<Subscriber> subscribers = new ArrayList<>();     //esse código utiliza o ArrayList, um lista com posições ILIMITADAS, essa é a principal diferença entre elas.

    private String mainState;


    public String getMainState() {
        return mainState;
    }

    public void setMainState(String mainState) {
        this.mainState = mainState;
    }

    public void subscribe(Subscriber s){
        subscribers.add(s);
        for (int i = 0; i < subscribers.size(); i++) {
            System.out.println(subscribers.get(i));
        }
    }
    
    public void removeSubscriber(Subscriber s){
        subscribers.remove(s);
    }

    public void notifySubscribers(){
        for (Subscriber s : subscribers){ //for each para percorrer a lista por completo e atualizar usuários, um por um.
            s.update(mainState);
        }
    }

    public void mainBusinessLogic(){
        //var newState;
        //this.mainState=newState;
    }


}
