
public class Mammal {

	protected int energyLevel;
	
	public Mammal() {
		this.energyLevel =100; 
	}
	
	public Mammal(int level) {
		this.energyLevel = level;
	}
	
	    
	public int displayEnergy() {
	    System.out.println("Current energy level: " + this.energyLevel);
	    return this.energyLevel;
		}
	    
	}

