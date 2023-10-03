import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class PokemonFight {

    public static int fight(Pokemon mon1, Pokemon mon2, Comparator<Pokemon> c) {
        return c.compare(mon1, mon2);
    }
    public static int fight(Pokemon mon1, Pokemon mon2) {
        return mon1.compareTo(mon2);
    }

    public static void main(String[] args) throws IOException {
        // Ask for input file
        Scanner scnr = new Scanner(System.in);
        System.out.println("Pokémon filename?: ");
        String inputFileName = scnr.nextLine();

        // For file input
        String fileName;
        FileInputStream inputFileNameStream = null;
        Scanner inputFileNameScanner = null;

        // Open the input file
        inputFileNameStream = new FileInputStream(inputFileName);
        inputFileNameScanner = new Scanner(inputFileNameStream);

        // ignore first line
        inputFileNameScanner.nextLine();

        // Pokemon LinkedList (PokeDex)
        LinkedList PokeDex = new LinkedList();

        // Read in file and store data in Pokemon ArrayList
        while (inputFileNameScanner.hasNext()) {
            String line = inputFileNameScanner.nextLine();
            String[] parts = line.split(",");
            Pokemon mon = new Pokemon(Integer.parseInt(parts[0]), parts[1], parts[2], parts[3], Integer.parseInt(parts[4]), Integer.parseInt(parts[5]), Integer.parseInt(parts[6]), Integer.parseInt(parts[7]), Integer.parseInt(parts[8]), Integer.parseInt(parts[9]), Integer.parseInt(parts[10]), Integer.parseInt(parts[11]), Boolean.parseBoolean(parts[12]));
            PokeDex.insert(mon);
            //System.out.println(poke); // for debugging
        }
        inputFileNameStream.close(); // because I care

        // print PokeDex
        System.out.println("PokeDex:");
        PokeDex.print();

        // pick two Pokémons
        Pokemon first = PokeDex.pop();
        Pokemon second = PokeDex.pop();

        // Fight two Pokémons
        System.out.println("Let's fight:");
        System.out.println("Pokémon 1: " + first);
        System.out.println("Pokémon 2: " + second);
        int winner = fight(first, second);
        if (winner > 0) {
            System.out.print("Winner ");
            //System.out.print("(" + winner + ")"); // for debugging
            System.out.println(": " + first);
        } else {
            System.out.print("Winner ");
            //System.out.print("(" + winner + ")"); // for debugging
            System.out.println(": " + second);
        }
    }
}
