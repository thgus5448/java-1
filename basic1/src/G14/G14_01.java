package G14;

public class G14_01 
{
	
	//����Ŭ���� - public ����� ������ Ŭ���� ����
	public static class circlemanage
	{
		//������� - ������(radius),������(pi) �ʱⰪ ����
		public int radius0;
		public double pi=3.14;
		
		//������
		//�����ǡ� �����ڴ� ����� ���� �ʴ´�! -> ������ ����
		public circlemanage()
		{
			System.out.println("���� ���� ���");
		}
		
		//������ ���ϴ� �޼ҵ�
		//a=asmple_inherit ���Ϸκ��� �Էµ� ���������� �޾Ƶ��̱� ���� �Ű�����
		public void neolbi_circle(int a)
		{
			int radius = a;
			System.out.println("���� ����:"+radius*radius*pi);
		}
	}
}
