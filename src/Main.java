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
		
		// on every 'enter', print the next rock from the randomized ArrayList
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
	
	private ArrayList<Mineral> setupMinerals() {
		ArrayList<Mineral> minerals = new ArrayList<Mineral>();
		
		minerals.add(new Mineral(	"QUARTZ", 1,
									"Makes glass and gemstones",
									"7.0 hardness"));
		
		minerals.add(new Mineral(	"FELDSPAR", 2,
									"Makes ceramic, glass, enamel, soap and false teeth",
									"light red color"));
		
		minerals.add(new Mineral(	"HEMATITE", 3,
									"Used in paints and cosmetics",
									"streaks red-brown"));
		
		minerals.add(new Mineral(	"HORNBLENDE", 4,
									"fire-resistent clothing",
									"very dark color")); // clarify
		
		minerals.add(new Mineral(	"PYRITE", 5,
									"jewlery",
									"lustrous gold color"));
		
		minerals.add(new Mineral(	"HALITE", 6,
									"table salt",
									"salty taste; translucent white"));
		
		minerals.add(new Mineral(	"CHALCOPYRITE", 7,
									"ore of copper; make electrical wire, coins and ammunition",
									"blurry picture")); // clarify
		
		minerals.add(new Mineral(	"GYPSUM", 8,
									"drywall and wallpaper",
									"soft; feels greasy; translucent white color"));
		
		minerals.add(new Mineral(	"OLIVINE", 9,
									"makes paper and pills",
									"distinct green color"));
		
		minerals.add(new Mineral(	"MAGNETITE", 10,
									"magnets; ore of iron for machines, nails, bridges, etc.",
									"magnetic")); // clarify
		
		minerals.add(new Mineral(	"GALENA", 11,
									"ore of lead for TV glass, auto batteries and ammunition",
									"small cubes")); // clarify
		
		minerals.add(new Mineral(	"BIOTITE", 12,
									"makes rubber and paint",
									"light colored, thin sheet-like due to perfect single planar cleavage"));
		
		minerals.add(new Mineral(	"PLAGIOCLASE", 13,
									"makes ceramics, galss, enamel and false teeth",
									"light colored; visible linear striations"));
		
		minerals.add(new Mineral(	"MUSCOVITE", 14,
									"makes computer chip substrates, and cosmetics",
									"dark colored; thin sheet-like due to perfect single planar cleavage"));
		
		minerals.add(new Mineral(	"PYROXENE", 15,
									"ore of lithium to make lithium-ion batteries and overware glazes",
									"blurry picture")); // clarify
		
		minerals.add(new Mineral(	"CALCITE", 16,
									"used to make antiacid tablets and fertilizer",
									"reacts with acid; white color"));
		
		minerals.add(new Mineral(	"APATITE", 17,
									"sold as gemstones and used to make fetilizer",
									"small yellow-green uneven pieces")); // clarify
		
		minerals.add(new Mineral(	"FLUORITE", 18,
									"used in fluoried toothpastes",
									"like quartz but not as hard")); // clarify
		
		minerals.add(new Mineral(	"GARNET", 19,
									"sold as a gemstone",
									"distinct dark-red color")); // clarify
		
		minerals.add(new Mineral(	"SULFUR", 20,
									"used for matches and gunpowder",
									"yellow and smells bad"));
		
		return minerals;
	}
}
