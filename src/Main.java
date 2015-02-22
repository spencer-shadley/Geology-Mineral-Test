import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		// user input
		boolean[] usedMinerals = new boolean[20];	// keep track of which minerals have been used
		Arrays.fill(usedMinerals, false);
		ArrayList<Mineral> minerals = getMinerals();
		Random rand = new Random();
		
		for(int i=0; i<minerals.size(); i++) {
			
			// get a random mineral
			Mineral currMineral = null;
			int randIndex = rand.nextInt(minerals.size());
			while(currMineral==null || usedMinerals[randIndex]==true) {
				randIndex = rand.nextInt(minerals.size());
				currMineral =  minerals.get(randIndex);
			}
				
			// mark the mineral visited
			usedMinerals[randIndex] = true;
			
			// ask user for each piece of info
			System.out.print("\n"+currMineral.name);
			scan.nextLine();
			
			System.out.print("Where is " + currMineral.name + "?");
			scan.nextLine();
			System.out.print("Box " + currMineral.code);
			scan.nextLine();
			
			
			System.out.print("What is something unique about " + currMineral.name + " used for identification?");
			scan.nextLine();
			System.out.print(currMineral.id);
			scan.nextLine();
			
			System.out.print("What are some uses of " + currMineral.name + "?");
			scan.nextLine();
			System.out.print(currMineral.uses);
			scan.nextLine();
		}
		scan.close();
		System.out.println("\nCongratulations, you finished all the minerals!");
	}
	
	// create an ArrayList of all required minerals
	private static ArrayList<Mineral> getMinerals() {
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
									"dark colored, thin sheet-like due to perfect single planar cleavage"));
		
		minerals.add(new Mineral(	"PLAGIOCLASE", 13,
									"makes ceramics, galss, enamel and false teeth",
									"light colored; visible linear striations"));
		
		minerals.add(new Mineral(	"MUSCOVITE", 14,
									"makes computer chip substrates and cosmetics",
									"light colored; thin sheet-like due to perfect single planar cleavage"));
		
		minerals.add(new Mineral(	"PYROXENE", 15,
									"ore of lithium to make lithium-ion batteries and ovenware glazes",
									"blurry picture")); // clarify
		
		minerals.add(new Mineral(	"CALCITE", 16,
									"used to make antiacid tablets and fertilizer",
									"reacts with acid; white color"));
		
		minerals.add(new Mineral(	"APATITE", 17,
									"sold as gemstones and used to make fetilizer",
									"small yellow-green uneven pieces")); // clarify
		
		minerals.add(new Mineral(	"FLUORITE", 18,
									"used in fluoride toothpastes",
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
