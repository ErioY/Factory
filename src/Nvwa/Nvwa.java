package Nvwa;

public class Nvwa {
	public static Person producePerson(String sex) throws Exception
	{
		if(sex.equalsIgnoreCase("M"))  //ѡ��'M'
		{
			System.out.println("����һ�����ˣ�");
			return new Man();  //���ز���
		}
		else if(sex.equalsIgnoreCase("W"))//ѡ��'W'
		{
			System.out.println("����һ��Ů�ˣ�");
			return new Woman();
		}
		else if(sex.equalsIgnoreCase("R"))//ѡ��'R'
		{
			System.out.println("����һ�������ˣ�");
			return new Robet();
		}
		else
		{
			throw new Exception("�Բ���Ů�����æ��û�����ˣ�");
		}
	}
}
