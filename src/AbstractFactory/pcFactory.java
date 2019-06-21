package AbstractFactory;

public class pcFactory implements ComputerFactory{
	public CPU produceCPU()
	{
		System.out.println("生产了pcCPU...");
		return new pcCPU();
	}
	
	public RAM produceRAM()
	{
		System.out.println("生产了pcRAM...");
		return new pcRAM();
	}
}
