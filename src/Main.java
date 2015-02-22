import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> rockNames = new ArrayList<String>();
		rockNames.add("QUARTZ");
		rockNames.add("FELDSPAR");
		rockNames.add("HEMATITE");
		rockNames.add("HORNBLENDE");
		rockNames.add("PYRITE");
		rockNames.add("HALITE");
		rockNames.add("CHALCOPYRITE");
		rockNames.add("GYPSUM");
		rockNames.add("OLIVINE");
		rockNames.add("MAGNETITE");
		rockNames.add("GALENA");
		rockNames.add("BIOTITE");
		rockNames.add("PLAGIOCLASE");
		rockNames.add("MUSCOVITE");
		rockNames.add("PYROXENE");
		rockNames.add("CALCITE");
		rockNames.add("APATITE");
		rockNames.add("FLUORITE");
		rockNames.add("GARNET");
		rockNames.add("SULFUR");
		
		Random r = new Random();
		
		// build up randomized ArrayList of rock names
		ArrayList<String> randomizedRocks = new ArrayList<String>();
		for(int i=0; i<rockNames.size(); i++) {
			String chosenRock = rockNames.get(r.nextInt(rockNames.size()));

			// prevent repetitions
			while(randomizedRocks.contains(chosenRock))
				chosenRock = rockNames.get(r.nextInt(rockNames.size()));
			randomizedRocks.add(chosenRock);
		}
		
		// on every return, print the next rock from the randomized ArrayList
		Scanner s = new Scanner(System.in);
		for(int i=0; i<randomizedRocks.size() && s.nextLine() != null; i++) {
			String currRock = randomizedRocks.get(i);
			System.out.print("Find the " + currRock + "!");
			if(s.nextLine() != null) {
				System.out.println(	currRock + " was number " + 
									(rockNames.indexOf(currRock) +1) + "\n");
			}
		}
		System.out.println("\nall done!!!");
		s.close();
	}
}
