package school.sptech;

public class Gincana {
    private String nome;
    private Double premio;
    private Integer qtdInscrito;
    private Boolean ativa;

    public Gincana(String nome, Double premio) {
        setNome(nome);
        this.premio = premio;
        this.qtdInscrito = 0;
        this.ativa = true;
    }

    public void inscrever(Integer qtd) {
        if (qtd != null && qtd > 0 && ativa) {
            qtdInscrito = qtd;
        }
    }

    public Integer remover(Integer qtd) {
        if (qtd != null && qtd > 0 && qtd <= qtdInscrito && ativa) {
            qtdInscrito -= qtd;
            return qtd;
        } else {
            return null;
        }
    }

    public Integer desativar() {
        if (!ativa) {
            return null;
        } else {
            ativa = false;
            Integer qtdAntesDesativar = qtdInscrito;
            qtdInscrito = 0;
            return qtdAntesDesativar;
        }
    }

    public void transferir(Gincana destino, Integer qtdATransferir) {
        if (qtdATransferir != null && qtdATransferir > 0 &&
                destino != null && destino.ativa &&
                qtdATransferir <= qtdInscrito
                && this.ativa) {
            destino.qtdInscrito += qtdATransferir;
            this.qtdInscrito -= qtdATransferir;
        }

    }

    public Boolean reajustarPremio(Double reajuste){
        if(reajuste != null && reajuste > 0) {
            premio+= (premio * reajuste);
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public Double getPremio() {
        return premio;
    }

    public Integer getQtdInscrito() {
        return qtdInscrito;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
