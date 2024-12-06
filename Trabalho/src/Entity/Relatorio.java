package Entity;

public class Relatorio {
    private VisitaTecnica visitaTecnica;

    // Construtor
    public Relatorio(VisitaTecnica visitaTecnica) {
        this.visitaTecnica = visitaTecnica;
    }

    // Método para gerar um relatório simples
    public void gerarRelatorio() {
        System.out.println("Relatório de Visita Técnica");
        System.out.println("-------------------------");
        visitaTecnica.exibirDetalhesVisita();
    }
}