package Primjeri;

class Person implements Comparable<Person>{

	private int id;
	
	Person(int id){
		this.id = id;
	}
	
	public int getID(){
		return id;
	}

	@Override
	public int compareTo(Person o) {
		if(id > o.getID())
		return 01;
		else if(id < o.getID())
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString(){
		return "" + id;
	}
}
