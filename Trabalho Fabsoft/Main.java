public class Main {
    public static void main(String[] args) {
        Mamifero cachorro = new Mamifero("Cachorro", 3, Habitat.TERRESTRE, "Curta");
        Ave coruja = new Ave("Coruja", 4, Habitat.AEREO, "Marrons");

        Animal[] animais = { cachorro, coruja };

        for (Animal animal : animais) {
            animal.emitirSom();
            animal.mover();
            ((AnimalBase) animal).exibirDetalhes();
            System.out.println();
        }
    }
}