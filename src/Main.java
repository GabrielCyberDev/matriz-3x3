public class Main {
    public static void main(String[] args) {
        // Matriz 3x3 preenchida manualmente
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Elementos da matriz:");

        // Percorre linha por linha com loops
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println(); // pula para a próxima linha
        }
    }
}