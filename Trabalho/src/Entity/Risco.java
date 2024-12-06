package Entity;

public class Risco {
    private String tipoRisco;
    private String descricao;
    private String grauPerigo; // Exemplo: "Baixo", "Médio", "Alto"

    // Construtor
    public Risco(String tipoRisco, String descricao, String grauPerigo) {
        this.tipoRisco = tipoRisco;
        this.descricao = descricao;
        this.grauPerigo = grauPerigo;
    }

    // Métodos getters e setters
    public String getTipoRisco() {
        return tipoRisco;
    }

    public void setTipoRisco(String tipoRisco) {
        this.tipoRisco = tipoRisco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGrauPerigo() {
        return grauPerigo;
    }

    public void setGrauPerigo(String grauPerigo) {
        this.grauPerigo = grauPerigo;
    }

    // Exibe os detalhes do risco
    public void exibirRisco() {
        System.out.println("Tipo de Risco: " + tipoRisco);
        System.out.println("Descrição: " + descricao);
        System.out.println("Grau de Perigo: " + grauPerigo);
    }
}
