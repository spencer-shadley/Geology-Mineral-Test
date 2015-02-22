
public class Mineral {
	
	public String name;
	public String uses;
	public String id;
	public int code;
	
	public Mineral(String name, int code, String uses, String id) {
		this.name 	= name;
		this.code	= code;
		this.uses 	= uses;
		this.id		= id;
	}
	
	@Override
	public String toString() {
		return 	"name: " + name + "\n" +
				"code: " + code + "\n" +
				"uses: " + uses + "\n" +
				"id: " + id + "\n";
	}
	
}
