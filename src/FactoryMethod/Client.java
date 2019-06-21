package FactoryMethod;

public class Client {
	public static void main(String[] args)
	{
		try{
			KongTiao kt;
			KongTiaoFactory fa;
			fa=(KongTiaoFactory)XMLUtil.getBean();
			kt=fa.produceKT();
			kt.make();
		}catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
