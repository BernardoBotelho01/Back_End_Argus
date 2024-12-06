package Entity;

import java.util.Date;

public class VisitaTecnica {
    private Empresa empresa;
    private Usuario tecnico;
    private Date dataVisita;
    private String descricaoRiscos;

    // Construtor
    public VisitaTecnica(Empresa empresa, Usuario tecnico, Date dataVisita, String descricaoRiscos) {
        this.empresa = empresa;
        this.tecnico = tecnico;
        this.dataVisita = dataVisita;
        this.descricaoRiscos = descricaoRiscos;
    }

    // Métodos getters e setters
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Usuario getTecnico() {
        return tecnico;
    }

    public void setTecnico(Usuario tecnico) {
        this.tecnico = tecnico;
    }

    public Date getDataVisita() {
        return dataVisita;
    }

    public void setDataVisita(Date dataVisita) {
        this.dataVisita = dataVisita;
    }

    public String getDescricaoRiscos() {
        return descricaoRiscos;
    }

    public void setDescricaoRiscos(String descricaoRiscos) {
        this.descricaoRiscos = descricaoRiscos;
    }

    // Método para exibir os detalhes da visita
    public void exibirDetalhesVisita() {
        System.out.println("Visita à empresa: " + empresa.getNomeEmpresa());
        System.out.println("Técnico: " + tecnico.getNome()); // Assumindo que a classe Usuario possui um método getNome()
        System.out.println("Data da visita: " + dataVisita);
        System.out.println("Descrição dos riscos: " + descricaoRiscos);
    }
}
