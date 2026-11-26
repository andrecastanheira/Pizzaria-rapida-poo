public abstract class Cell {
    private final int numero;

    public Cell(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    /** Aplica o efeito ao jogador e devolve a mensagem ("" se não houver efeito). */
    public abstract String applyEffect(Player p);
}