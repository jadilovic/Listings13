package Primjeri;

import java.util.Date;

public class House implements Cloneable, Comparable<House>{

		private int id;
		private double area;
		private Date whenBuilt;
		
		public House(int id, double area){
			this.id = id;
			this.area = area;
			whenBuilt = new Date();
		}
		
		public int getID(){
			return id;
		}
		
		public double getArea(){
			return area;
		}
		
		public Date getWhenBuilt(){
			return whenBuilt;
		}

		@Override
		public Object clone() throws CloneNotSupportedException{
			House houseClone = (House)super.clone();
			houseClone.whenBuilt = (Date) whenBuilt.clone();
			return houseClone;
		}
	
		@Override
		public int compareTo(House a) {
		if(area > a.getArea())
			return 1;
		else if(area < a.getArea())
			return -1;
		else
		return 0;
	}

}
