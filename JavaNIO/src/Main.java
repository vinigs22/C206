import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Define o caminho do arquivo "professores_disciplina.txt" dentro do diretório "src"
        Path arquivo = Paths.get("src/professores_disciplina.txt");

        try {
            // Lê todas as linhas do arquivo e armazena em uma lista de strings
            List<String> conteudo = Files.readAllLines(arquivo);

            // Cria um mapa para armazenar a associação entre professores e disciplinas
            Map<String, String> professores_disciplina = new HashMap<>();

            // Itera sobre cada linha do conteúdo do arquivo
            conteudo.forEach((linha) -> {
                // Divide a linha em duas partes usando o sinal "=" como delimitador
                String[] linhaQuebrada = linha.split("=");

                // Adiciona a chave (nome do professor) e o valor (nome da disciplina) ao mapa
                professores_disciplina.put(linhaQuebrada[0], linhaQuebrada[1].strip());
            });

            // Itera sobre cada entrada do mapa e imprime o nome do professor e a disciplina correspondente
            professores_disciplina.forEach((professor, disciplina) -> {
                System.out.println("Professor: " + professor);
                System.out.println("Disciplina: " + disciplina);
                System.out.println();
            });

        } catch (IOException e) {
            // Caso ocorra uma exceção ao ler o arquivo, imprime uma mensagem de erro
            System.out.println("Houve um problema");
            System.out.println("Erro: " + e);
        }
    }
}
