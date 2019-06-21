package FactoryMethod;

public class MideaFactory implements KongTiaoFactory{
	public KongTiao produceKT()
	{
		System.out.println("---美的工厂正在生产美的空调 ");
		return new Midea();
	}
}