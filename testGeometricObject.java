package Primjeri;

public class testGeometricObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject obj1 = new Circle(5);
		GeometricObject obj2 = new Rectangle(2, 3);
		
		System.out.println("The two objects have the same area? " + sameArea(obj1, obj2));
		displayGeometricObject(obj1);
		displayGeometricObject(obj2);
	}

	private static void displayGeometricObject(GeometricObject object) {
		System.out.println();
		System.out.println("The Area is: " + object.getArea());
		System.out.println("The Perimeter is " + object.getPerimeter());
	}

	private static boolean sameArea(GeometricObject obj1, GeometricObject obj2) {
		return (obj1.getArea() == obj2.getArea());
	}

}
