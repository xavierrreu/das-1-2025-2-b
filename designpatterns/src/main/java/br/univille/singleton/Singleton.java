package br.univille.singleton;

public class Singleton {
    private static Singleton instance; //qualquer coisa 'static' em orientação a objeto, é instanciado antes de qualquer outro componente.
    // No java, marcando variaveis como estaticas, as tornamos variaveis globais

    //por ser um construtor privado, só pode ser utilizado por ele mesmo
    private Singleton (String value){ //algo com o mesmo nome da classe e sem retorno = CONSTRUTOR. Serve para ser chamado a cada execução de 'new'
        try{
            Thread.sleep(1000)
        } catch {
            ex.printStackTrace();
        }
        this.value=value;
    }

    public static Singleton getInstance(String value){ //isso aqui é um MÉTODO
        if (instance == null){
            instance = new Singleton(value); //Aqui o construtor é chamado, para instanciar o atributo 
        }
        return instance;
    }

}
