import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Plataforma plataforma = new Plataforma();

        Usuario[] usuarios = new Usuario[500];
        Playlist[] playlists = new Playlist[500];

        int totalUsuarios = 0;
        int totalPlaylists = 0;

        int opcao;

        do {
            System.out.println("\n=== Sonora ===");
            System.out.println("1 - Cadastrar música manualmente");
            System.out.println("2 - Cadastrar usuário");
            System.out.println("3 - Criar playlist e adicionar músicas");
            System.out.println("4 - Buscar música por id");
            System.out.println("5 - Buscar música por título");
            System.out.println("6 - Reproduzir uma música");
            System.out.println("7 - Listar acervo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Digite uma opção válida.");
                scanner.next();
                System.out.print("Escolha uma opção: ");
            }

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Artista: ");
                    String artista = scanner.nextLine();

                    System.out.print("Duração em segundos: ");
                    int duracao = scanner.nextInt();
                    scanner.nextLine();

                    Musica musica = new Musica(titulo, artista, duracao);

                    if (plataforma.cadastrarMusica(musica)) {
                        System.out.println("Música cadastrada.");
                        System.out.println("ID: " + musica.getId());
                    } else {
                        System.out.println("Não foi possível cadastrar.");
                    }

                    break;

                case 2:

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Usuario usuario = new Usuario(nome, email);

                    if (plataforma.cadastrarUsuario(usuario)) {
                        usuarios[totalUsuarios] = usuario;
                        totalUsuarios++;

                        System.out.println("Usuário cadastrado.");
                        System.out.println("ID: " + usuario.getId());
                    } else {
                        System.out.println("Não foi possível cadastrar.");
                    }

                    break;

                case 3:

                    if (totalUsuarios == 0) {
                        System.out.println("Cadastre um usuário primeiro.");
                        break;
                    }

                    System.out.print("Nome da playlist: ");
                    String nomePlaylist = scanner.nextLine();

                    System.out.print("ID do usuário dono: ");
                    int idUsuario = scanner.nextInt();
                    scanner.nextLine();

                    Usuario dono = null;

                    for (int i = 0; i < totalUsuarios; i++) {
                        if (usuarios[i].getId() == idUsuario) {
                            dono = usuarios[i];
                            break;
                        }
                    }

                    if (dono == null) {
                        System.out.println("Usuário não encontrado.");
                        break;
                    }

                    Playlist playlist = new Playlist(nomePlaylist, dono);

                    playlists[totalPlaylists] = playlist;
                    totalPlaylists++;

                    System.out.println("Playlist criada.");

                    int adicionar;

                    do {
                        System.out.println("\n1 - Adicionar música");
                        System.out.println("0 - Finalizar playlist");
                        System.out.print("Escolha: ");

                        adicionar = scanner.nextInt();
                        scanner.nextLine();

                        if (adicionar == 1) {

                            System.out.print("ID da música: ");
                            int idMusica = scanner.nextInt();
                            scanner.nextLine();

                            Musica musicaPlaylist =
                                    plataforma.buscarMusicaPorId(idMusica);

                            if (musicaPlaylist == null) {
                                System.out.println("Música não encontrada.");
                            } else if (playlist.adicionar(musicaPlaylist)) {
                                System.out.println("Música adicionada.");
                            } else {
                                System.out.println("Não foi possível adicionar.");
                            }
                        }

                    } while (adicionar != 0);

                    break;

                case 4:

                    System.out.print("ID da música: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    Musica musicaId = plataforma.buscarMusicaPorId(id);

                    if (musicaId != null) {
                        System.out.println("ID: " + musicaId.getId());
                        System.out.println("Título: " + musicaId.getTitulo());
                        System.out.println("Artista: " + musicaId.getArtista());
                        System.out.println("Duração: "
                                + musicaId.getDuracaoFormatada());
                        System.out.println("Reproduções: "
                                + musicaId.getReproducoes());
                    } else {
                        System.out.println("Música não encontrada.");
                    }

                    break;

                case 5:

                    System.out.print("Título da música: ");
                    String tituloBusca = scanner.nextLine();

                    Musica musicaTitulo =
                            plataforma.buscarMusica(tituloBusca);

                    if (musicaTitulo != null) {
                        System.out.println("ID: " + musicaTitulo.getId());
                        System.out.println("Título: " + musicaTitulo.getTitulo());
                        System.out.println("Artista: " + musicaTitulo.getArtista());
                        System.out.println("Duração: "
                                + musicaTitulo.getDuracaoFormatada());
                    } else {
                        System.out.println("Música não encontrada.");
                    }

                    break;

                case 6:

                    System.out.print("ID da música: ");
                    int idReproducao = scanner.nextInt();
                    scanner.nextLine();

                    Musica musicaReproducao =
                            plataforma.buscarMusicaPorId(idReproducao);

                    if (musicaReproducao != null) {

                        musicaReproducao.reproduzir();

                        System.out.println("Música reproduzida.");
                        System.out.println("Reproduções: "
                                + musicaReproducao.getReproducoes());

                    } else {
                        System.out.println("Música não encontrada.");
                    }

                    break;

                case 7:

                    System.out.println("\n=== Acervo ===");

                    for (int i = 1;
                         i <= plataforma.getTotalMusicas();
                         i++) {

                        Musica musicaAcervo =
                                plataforma.buscarMusicaPorId(i);

                        if (musicaAcervo != null) {
                            System.out.println(
                                    musicaAcervo.getId()
                                    + " - "
                                    + musicaAcervo.getTitulo()
                                    + " - "
                                    + musicaAcervo.getArtista()
                                    + " - "
                                    + musicaAcervo.getDuracaoFormatada()
                            );
                        }
                    }

                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}