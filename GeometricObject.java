package Primjeri;

public abstract class GeometricObject implements Cloneable{

	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject(){
		this.dateCreated = new java.util.Date();
		// System.out.println("GO constructor");
	}
	
	protected GeometricObject(String color, boolean filled){
		this.dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public boolean isFilled(){
		return filled;
	}
	
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	
	public java.util.Date getDate(){
		return dateCreated;
	}
	
	@Override
	public String toString(){
		return "Rectangle date created: " + dateCreated + " with color " + color + " and filled: " + filled;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public abstract double getArea();
		
	public abstract double getPerimeter();
}
