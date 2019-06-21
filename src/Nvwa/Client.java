package Nvwa;

public class Client {
	public static void main(String args[])
	{
         try
         {
         	Person pe;
         	String sexName=XMLUtilNvwa.getSexName();
         	pe=Nvwa.producePerson(sexName);
         	pe.make();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
