package Problems.Entities;

public class HolderNaive {
	private Heavy heavy;

	public HolderNaive() {
		System.out.println("Holder created");
	}

	public synchronized Heavy getHeavy() {
		if (heavy == null) {
			heavy = new Heavy();
		}
		return heavy;
	}
}
