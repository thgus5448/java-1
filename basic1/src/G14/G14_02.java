package G14;
import java.util.Scanner;

public class G14_02 
{
	public void main(String[] args)
	{
		G14_01sub cir=new G14_01sub();
		
		int h;
		Scanner sc1=new Scanner(System.in);
		h=Integer.parseInt(sc1.next());
			//Integer.parseInt
			// -> String���� �Է¹��� h���� int�� ��ȯ����
		
		
		cir.neolbi_circle(h);
		cir.dule_circle(h);
	}
}
