package serial;

import java.io.Serializable;

public class Dog implements Serializable{
	
	transient public final String name= "india";
	public int num = 40;

}
