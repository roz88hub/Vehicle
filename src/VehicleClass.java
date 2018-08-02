/*1. Create a vehicle class - you can google for it's attributes and behaviors
2. Create at least 2 instance methods
3. Create main function inside the same class
4. Create 5 vehicle objects 
5. Create at least 4 constructors including a default constructor that doesn't 
do anything(meaning, the default constructor sets everything to JVM's default values) */

public class VehicleClass {
	private String brand;
	private String vehType;
	private int doorNum;
	private String color;
	private boolean condition;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getVehileType() {
		return vehType;
	}
	public void setVehileType(String vehileType) {
		this.vehType = vehileType;
	}
	public int getDoorNum() {
		return doorNum;
	}
	public void setDoorNum(int doorNum) {
		this.doorNum = doorNum;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isCondition() {
		return condition;
	}
	public void setCondition(boolean condition) {
		this.condition = condition;
	}
	VehicleClass(){
	}
	VehicleClass(String brand, String vehType, int doorNum , String color , boolean condition){
	this.brand = brand;
	this.vehType = vehType;
	this.doorNum = doorNum;
	this.color = color;
	this.condition = condition;
	}
	VehicleClass(String brand, String vehType, String color , boolean condition){
		this.brand = brand;
		this.vehType = vehType;
		this.color = color;
		this.condition = condition;
	}
	VehicleClass(String brand, int doorNum , String color , boolean condition){
		this.brand = brand;
		this.doorNum = doorNum;
		this.color = color;
		this.condition = condition;
	}
	VehicleClass(String brand, int doorNum , String color){
		this.brand = brand;
		this.doorNum = doorNum;
		this.color = color;
	}
	VehicleClass(String brand){
		this.brand = brand;
	}

	
	void compareDoor(VehicleClass doorMethod){
		if(this.doorNum > doorMethod.doorNum ){
			
			System.out.println(this.brand + " has more doors than " + doorMethod.brand);
			
		}
	}
	

public static void main(String[] args){
	
	VehicleClass Corolla = new VehicleClass("Toyota", "Sedan", 4 , "White" , true);
	VehicleClass Accord = new VehicleClass("Honda", "Sedan", 4 , "Blue" , false);
	VehicleClass Eclipse = new VehicleClass("Mitsubishi", "Sport", 2 , "Yellow" , true);
	VehicleClass F150 = new VehicleClass("Ford", "Truck", "Red", false);
	VehicleClass Huracán = new VehicleClass("Lamborghini");
	 
	
	Corolla.compareDoor(Huracán);
}

}

