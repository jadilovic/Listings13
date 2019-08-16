package Primjeri;

public class Rectangle extends GeometricObject{

	private double width;
	private double height;
	
	public Rectangle(){
		System.out.println("R constructor");
	}
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(double width, double height, String color, boolean filled){
		this.width = width;
		this.height = height;
		this.setColor(color);
		this.setFilled(filled);
	}
	
	public double getWidth(){
		return width;
	}
	
	public void setWidth(double width){
		this.width = width;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public double getArea(){
		return width * height;
	}
	
	public double getPerimeter(){
		return 2 * width + 2 * height;
	}
}
