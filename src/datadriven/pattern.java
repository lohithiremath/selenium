package datadriven;

public class pattern {
	public static void main(String[] args) {
		int n = 4; 
		char ch = 'A';
		
		for(int j =0;j<n;j++)
		{
			for(int i=0; i<n; i++)
			{	int a=1;
				if(j%2==0)
				{
					System.out.print(ch++ + " ");
				}
				else if(j%2==1)
				{	
					System.out.print(a + " ");	
				}
			}
			
			
			System.out.println();
		}
	}
}
