package ThursdayLab;

public class Pttrn_3 {
    
	public static void main(String[] args) 
	{
		int i,r=5,s;
				for(i=1;i<=r;i++)
				{
					int k=0;
					for(s=1;s<=(r-i);s++)
					{
						System.out.print(" ");
					}
					
				while(k!=2*i-1)
				{
					System.out.print("*");
					k++;
				}
				System.out.println();
				}

	}

}
