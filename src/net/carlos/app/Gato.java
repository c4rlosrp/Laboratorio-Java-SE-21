package net.carlos.app;

/**
 * @author manana
 **/
public class Gato implements EmitirSonido {
    public String name;
    public int age;

    public Gato(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void maullar(EmitirSonido sonido){
        sonido.meow();
    }

    @Override
    public String meow(int en, char x) {
        return "";
    }
}
