public class Runner {
    public static void main(String[] args) {
        GameOfSticks game = new GameOfSticks();

        game.printInstructions();

        game.play();

        game.printSticksTaken();

    }
}
