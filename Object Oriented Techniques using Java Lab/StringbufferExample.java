package q24215;
public class StringbufferExample {
	public static void main (String args[]) {
		// create instance of StringBuffer
		StringBuffer ins = new StringBuffer();
		// find the initial capacity
		System.out.println("Initial capacity is: "+ins.capacity());
		//find the capactiy after passing a parameter args[0] using command line argument
		StringBuffer ins1 = new StringBuffer(args[0]);
		System.out.println("Capacity after passing parameter is: "+ins1.capacity());
		// find the capatity by intializing capatity to 50
		StringBuffer ins2 = new StringBuffer(50);
		System.out.println("Creating a StringBuffer object with the given capacity: "+ins2.capacity());
	}
}
