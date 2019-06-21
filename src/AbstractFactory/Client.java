package AbstractFactory;

public class Client {
	public static void main(String[] args)
	{		
		try
		{
			ComputerFactory fac;
			CPU cpu;
			RAM ram;
			fac=(ComputerFactory)XMLUtil.getBean();
			cpu=fac.produceCPU();
			cpu.make();
			ram=fac.produceRAM();
			ram.make();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
}
