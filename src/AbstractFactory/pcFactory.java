package AbstractFactory;

public class pcFactory implements ComputerFactory{
	public CPU produceCPU()
	{
		System.out.println("������pcCPU...");
		return new pcCPU();
	}
	
	public RAM produceRAM()
	{
		System.out.println("������pcRAM...");
		return new pcRAM();
	}
}
