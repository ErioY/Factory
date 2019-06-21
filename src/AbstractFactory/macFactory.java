package AbstractFactory;

public class macFactory implements ComputerFactory{
	
	//生产macCPU
	public CPU produceCPU()
	{
		System.out.println("生产了macCPU...");
		//CPU macCPU;
		return new macCPU();
	}
	
	//生产macRAM
	public RAM produceRAM()
	{
		System.out.println("生产了macRAM...");
		return new macRAM();
	}
}
