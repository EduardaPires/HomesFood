public class Avaliacao {
    private float avaliacao;
    private int quantidadeDeAvaliacoes;
    private float mediaAvaliacao;

    public float getMediaAvaliacao() {
        return mediaAvaliacao;
    }
    
    public int getQuantidadeDeAvaliacoes() {
        return quantidadeDeAvaliacoes;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void setMediaAvaliacao(float mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
    }

    public void setQuantidadeDeAvaliacoes(int quantidadeDeAvaliacoes) {
        this.quantidadeDeAvaliacoes = quantidadeDeAvaliacoes;
    }

    public float avaliacao(float avaliacao){
        this.avaliacao = avaliacao;
        this.quantidadeDeAvaliacoes++;
        return this.avaliacao;
    }

    public float media(){
        this.mediaAvaliacao = this.avaliacao/this.quantidadeDeAvaliacoes;
        return this.mediaAvaliacao;
    }

}
