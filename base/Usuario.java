package base;

public abstract class Usuario {
    private String nome;
    private String cpf;
    private double avaliacaoMedia;

    public Usuario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.avaliacaoMedia = 0.0;
    }

    public double getAvaliacaoMedia(){
        return avaliacaoMedia;
    }

    protected void setAvaliacaoMedia(double media){
        this.avaliacaoMedia = media;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }


    
}
