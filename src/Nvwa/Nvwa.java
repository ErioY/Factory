package Nvwa;

public class Nvwa {
	public static Person producePerson(String sex) throws Exception
	{
		if(sex.equalsIgnoreCase("M"))  //选择'M'
		{
			System.out.println("造了一个男人！");
			return new Man();  //返回参数
		}
		else if(sex.equalsIgnoreCase("W"))//选择'W'
		{
			System.out.println("造了一个女人！");
			return new Woman();
		}
		else if(sex.equalsIgnoreCase("R"))//选择'R'
		{
			System.out.println("造了一个机器人！");
			return new Robet();
		}
		else
		{
			throw new Exception("对不起，女娲正在忙，没空造人！");
		}
	}
}
