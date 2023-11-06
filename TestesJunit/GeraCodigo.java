package TestesJunit;

public class GeraCodigo {
    private String nome;
    private String tipo;
    private boolean naoNulo;
    private boolean autoIncremento;

    public GeraCodigo(String nome, String tipo, boolean naoNulo, boolean autoIncremento) {
        this.nome = nome;
        this.tipo = tipo;
        this.naoNulo = naoNulo;
        this.autoIncremento = autoIncremento;
    }

    public String geraScriptColuna() {
        StringBuilder script = new StringBuilder("'" + nome + "' " + tipo);

        if (naoNulo) {
            script.append(" NOT NULL");
        }

        if (autoIncremento) {
            script.append(" AUTO_INCREMENT");
        }

        return script.toString();
    }
}
