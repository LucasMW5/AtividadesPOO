import java.util.ArrayList;

public class Usuario {

    private static int contador = 1;

    private int id;
    private String nome;
    private String email;
    private ArrayList<Usuario> seguindo;

    public Usuario(String nome, String email) {

        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome inválido, não pode estar em branco");
        }

        if (email == null || email.isBlank()){
            throw new IllegalArgumentException("Email inválido, não pode estar em branco");
        }

        if (!email.contains("@")){
            throw new IllegalArgumentException("Email inválido, precisa contar @.");
        }

        id = contador;
        contador++;

        this.nome = nome;
        this.email = email;
        this.seguindo = new ArrayList<Usuario>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean seguir(Usuario outro) {
        if (outro == null){
            throw new IllegalArgumentException("Usuário inválido");
        }

        if (outro == this || seguindo.contains(outro)){
            return false;
        }

        seguindo.add(outro);
        return true;
    }

    public boolean deixarDeSeguir(Usuario outro) {
        if (outro == null){
            throw new IllegalArgumentException("Usuário inválido");
        }

        return seguindo.remove(outro);
    }

    public int getQuantidadeSeguindo() {
        return seguindo.size();
    }

    public Usuario getSeguindoNaPosicao(int indice) {
        return seguindo.get(indice);
    }
}