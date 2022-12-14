public class User{
    //atributos que cliente e cozinheiros tem em comum
    private String nome, user,senha;
    //String email;
    //private int senha;

    public User(String nome, String user, String senha) {  //construtor de pessoa (cozinheiro ou cliente)
        this.nome = nome;
        this.user = user;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    public String getSenha() {
        return senha;
    }
    public String getUser() {
        return user;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (senha != other.senha)
            return false;
        return true;
    }

    public String toString(){
        return "\u001b[1m" + user + ": " + nome + "\u001b[m ";
    }

    public String cozinheiros(){
        return "\u001b[1m" + nome + "\u001b[m ";
    }
}