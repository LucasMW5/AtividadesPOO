public class Usuario {

    private static int contador = 1;

    private int id;
    private String nome;
    private String email;

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
}