public class Gorilla extends Mammal{
	
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		this.energyLevel = this.energyLevel -5;
        System.out.println("What did you just throw?" + this.energyLevel);
        //energy level -5
    }
    public void eatBananas() {
		this.energyLevel = this.energyLevel +10;
        System.out.println("Yummy!" + this.energyLevel);
        //energy level +10
    }
    public void climb() {
		this.energyLevel = this.energyLevel -10;
         System.out.println("Climbing higher and higher" + this.energyLevel);
        //energy level -10
    }
	
}



