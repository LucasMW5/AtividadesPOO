import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Plataforma plataforma = new Plataforma();

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
                        System.out.println("Não foi possível cadastrar a música.");
                    }

                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Usuario usuario = new Usuario(nome, email);

                    if (plataforma.cadastrarUsuario(usuario)) {
                        System.out.println("Usuário cadastrado.");
                        System.out.println("ID: " + usuario.getId());
                    } else {
                        System.out.println("Não foi possível cadastrar o usuário.");
                    }

                    break;

                case 3:
                    System.out.print("Nome da playlist: ");
                    String nomePlaylist = scanner.nextLine();

                    System.out.print("ID do usuário dono: ");
                    int idUsuario = scanner.nextInt();
                    scanner.nextLine();

                    Usuario dono = plataforma.buscarUsuarioPorId(idUsuario);

                    if (dono == null) {
                        System.out.println("Usuário não encontrado.");
                        break;
                    }

                    Playlist playlist = new Playlist(nomePlaylist, dono);

                    int opcaoPlaylist;

                    do {
                        System.out.println("\n=== Playlist: "
                                + playlist.getNome() + " ===");
                        System.out.println("1 - Adicionar música");
                        System.out.println("2 - Remover música");
                        System.out.println("3 - Mostrar quantidade");
                        System.out.println("4 - Mostrar duração total");
                        System.out.println("5 - Reproduzir tudo");
                        System.out.println("0 - Voltar");
                        System.out.print("Escolha uma opção: ");

                        opcaoPlaylist = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcaoPlaylist) {

                            case 1:
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
                                    System.out.println(
                                            "Não foi possível adicionar a música.");
                                }

                                break;

                            case 2:
                                System.out.print("Posição da música: ");
                                int indice = scanner.nextInt();
                                scanner.nextLine();

                                if (playlist.removerNaPosicao(indice)) {
                                    System.out.println("Música removida.");
                                } else {
                                    System.out.println("Posição inválida.");
                                }

                                break;

                            case 3:
                                System.out.println("Quantidade: "
                                        + playlist.getQuantidade());
                                break;

                            case 4:
                                System.out.println("Duração total: "
                                        + playlist.getDuracaoTotalSegundos()
                                        + " segundos");
                                break;

                            case 5:
                                playlist.reproduzirTudo();
                                System.out.println("Todas as músicas foram reproduzidas.");
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Opção inválida.");
                        }

                    } while (opcaoPlaylist != 0);

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
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}