package com.ty.proxeyPattern;

interface Image {
	
	void display();
}

class RealImage  implements Image{
	
	private String fileName;

	@Override
	public void display() {
		System.out.println("Displaying "+fileName);
		
	}
	
	public RealImage(String fileName) {
		this.fileName=fileName;
		loadFromDesk(fileName);
	}
	
	private void loadFromDesk(String fileName) {
	
		System.out.println("Loading "+fileName);
		
}

}

public class ProxeyPattern {

}
