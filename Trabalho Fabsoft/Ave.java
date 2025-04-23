public class Ave extends AnimalBase {
    private String corDasPenas;

    public Ave(String nome, int idade, Habitat habitat, String corDasPenas) {
        super(nome, idade, habitat);
        this.corDasPenas = corDasPenas;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está cantando!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está voando.");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Ave: " + nome + ", Idade: " + getIdade() +
                ", Habitat: " + habitat + ", Cor das penas: " + corDasPenas);
    }
}