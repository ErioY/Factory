package AbstractFactory;

public class macFactory implements ComputerFactory{
	
	//����macCPU
	public CPU produceCPU()
	{
		System.out.println("������macCPU...");
		//CPU macCPU;
		return new macCPU();
	}
	
	//����macRAM
	public RAM produceRAM()
	{
		System.out.println("������macRAM...");
		return new macRAM();
	}
}
