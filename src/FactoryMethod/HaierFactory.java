package FactoryMethod;

public class HaierFactory implements KongTiaoFactory{
	public KongTiao produceKT()
	{
		System.out.println("---���������������������յ� ");
		return new Haier();
	}
}
