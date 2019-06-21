package FactoryMethod;

public class HaierFactory implements KongTiaoFactory{
	public KongTiao produceKT()
	{
		System.out.println("---海尔工厂正在生产海尔空调 ");
		return new Haier();
	}
}
