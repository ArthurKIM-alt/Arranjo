//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
        Arranjo arranjo = new Arranjo(a);

        System.out.println("Maior número é: " + arranjo.encontrarMaior());
        System.out.println("Menor número é: " + arranjo.encontrarMenor());
        System.out.println("A soma dos números é: " + arranjo.calcularSoma());
        System.out.println("O número 940 aparece " + arranjo.contagem(940) + " vezes");
    }
}