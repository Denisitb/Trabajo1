package et7;

public class Computadora {

String Cpuld;
int RamSizeGB; 
int HdCapacityGB;	
	
public String getCpuld(){
	
	return Cpuld;
}

public void setCpuld(String nuevoCpuld) {
	
	Cpuld = nuevoCpuld;

}
	
public int getRamSizeGB(){
	
 	
	return RamSizeGB;	
}

public void setRamSizeGB(int nuevoRamSizeGB) {
	
	RamSizeGB = nuevoRamSizeGB;
}

public int getHdCapacityGB(){
	
	
	return HdCapacityGB;
	
}

public void setHdCapacityGB(int nuevoHdCapacityGB) {
	
	HdCapacityGB = nuevoHdCapacityGB;
	
}


public static void main (String args[])
{

	Computadora C;
	C= new Computadora();
	
	C.setCpuld("Intel I7");
	
	C.setRamSizeGB(4);
	
	C.setHdCapacityGB(1);
	
	
	System.out.println("""
			Cpuld: """ +C.getCpuld()+ """ 			
			
			RamSizeGB: """ +C.getRamSizeGB()+"""
			
			CapacityGB: """ +C.getHdCapacityGB()+"""
			""");

}























}
	
	
	

