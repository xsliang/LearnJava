package JavaBasic.src.com.xsliang;

public abstract class Animal {
	public int weight;

	public Animal(int weight) {
		this.weight = weight;
	}

	public void move() {
		System.out.println("animal can move!");
	}
	
	public static void main(String[] args) {
		Tiger tiger=new Tiger(500, "ao!");
		tiger.move();
		System.out.println("tiger weight="+tiger.weight+" tiger roar="+tiger.roar);
		
		//Animal animal=new Animal(1000);
		//animal.move();
		//System.out.println("animal weight ="+animal.weight);
	}
	
	public abstract void eat();
}
