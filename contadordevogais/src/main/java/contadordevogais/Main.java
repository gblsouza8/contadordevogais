package contadordevogais;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite aqui o texto para contar as vogais e consoantes: ");
        String texto = input.nextLine();
        texto = texto.toLowerCase();
        int contador_vogais = 0;
        int contador_consoantes = 0;
        int contador_espacos = 0;
        input.close();

        for (int i = 0; i < texto.length(); i++) {
            char caractereAtual = texto.charAt(i);
            if (caractereAtual == 'a' || caractereAtual == 'e' || caractereAtual == 'i' || caractereAtual == 'o' || caractereAtual == 'u'){
                contador_vogais += 1;
            } else if (caractereAtual == ' ') {
                contador_espacos += 1;
            } else {
                contador_consoantes += 1;
            }
            }
            System.out.println("Nesse texto tem: " + contador_vogais + " vogais, " + contador_consoantes + " consoantes e " + (contador_espacos + 1) + " palavras.");
        }
    }