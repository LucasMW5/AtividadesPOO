public class Usuario {

    private static int proximoId = 1;

    private int id;
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.id = proximoId;
        proximoId++;

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