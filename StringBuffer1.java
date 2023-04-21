package lab3;

public class StingBuffer1 {

	public static void main(String[] args) {
		StringBuffer buffer1 = new StringBuffer("This is a String Buffer");
		System.out.println(buffer1);
		
    //Adds the String
		buffer1.append(" This is a Sample Program");
		System.out.println(buffer1);
		
    //Insert String
		buffer1.insert(21, "Object");
		System.out.println("After inserting a String :\n"+buffer1);
		
		buffer1.reverse();
		System.out.println("After reversing a String :\n"+buffer1);
		
	    StringBuffer buffer2=new StringBuffer("This is a String Buffer");
		buffer2.replace(15, 22, "Builder");
		System.out.println("After replacing Buffer with Builder :\n"+buffer2);

	}

}
