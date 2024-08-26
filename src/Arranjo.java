public class Arranjo {

    private int[] arranjo;

    public Arranjo(int[] arranjo) {
        this.arranjo = arranjo;
    }

    public int encontrarMaior() {
        int maior = arranjo[0];
        for (int num : arranjo) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }
    public int encontrarMenor() {
        int menor = arranjo[0];
        for (int num : arranjo) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }
    public int calcularSoma() {
        int soma = 0;
        for (int num : arranjo) {
            soma += num;
        }
        return soma;
    }
    public int contagem(int numero) {
        int contador = 0;
        for (int num : arranjo) {
            if (num == numero) {
                contador++;
            }
        }
        return contador;
    }
}