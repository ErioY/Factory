package FactoryMethod;

public class MideaFactory implements KongTiaoFactory{
	public KongTiao produceKT()
	{
		System.out.println("---���Ĺ��������������Ŀյ� ");
		return new Midea();
	}
}