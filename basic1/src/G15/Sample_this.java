package G15;

public class Sample_this 
{
	private String name;
		public void setinfo (String name)
		{
			this.name=name;
			System.out.println("���̸� : "+this.name);
		}
		
		public static void main(String[] args)
		{
			Sample_this customer = new Sample_this();
			customer.setinfo("ȫ�浿");
		}
}
