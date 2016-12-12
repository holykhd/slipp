package net.slipp.di;

public class MessageRenderer {
	public void render(){
		MessageProvider mp = new HelloWorldMessageProvider();
		System.out.println(mp.getMessage());
	}
	
	public static void main(String[] args) {
		MessageRenderer renderer = new MessageRenderer();
		renderer.render();
	}

}
