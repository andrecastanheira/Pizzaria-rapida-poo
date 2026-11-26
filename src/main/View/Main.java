import pizzaria.controller.GameController;
import pizzaria.view.ConsoleView;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintStream saida = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        new GameController(new ConsoleView(new Scanner(System.in), saida)).executar();
    }
}