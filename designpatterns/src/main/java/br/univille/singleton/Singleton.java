package br.univille.singleton;

public class Singleton {
    private static Singleton instance; //qualquer coisa 'static' em orientação a objeto, é instanciado antes de qualquer outro componente.
    // No java, marcando variaveis como estaticas, as tornamos variaveis globais
    private String segredo;

    public String getSegredo() {
        return segredo;
    }

    public void setSegredo(String segredo) {
        this.segredo = segredo;
    }

    //por ser um construtor privado, só pode ser utilizado por ele mesmo
    private Singleton (){ //algo com o mesmo nome da classe e sem retorno = CONSTRUTOR. Serve para ser chamado a cada execução de 'new'
        System.out.println("Singleton: constructor");
    }

    public static Singleton getInstance(){ //isso aqui é um MÉTODO
        System.out.println("Singleton; getInstance method");
        if (instance == null){
            System.out.println("Singleton: NEW");
            instance = new Singleton(); //Aqui o construtor é chamado, para instanciar o atributo 
        }
        return instance;
    }

}
