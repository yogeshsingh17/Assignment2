
public class SelectionSort 
{

	public static void main(String[] args) 
	{
		int [] a={4,1,2,5,3,7,8,6,9,10};
		
		for(int i=0;i<a.length-1;i++)
		{
			int smallest=i;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[smallest]>a[j])    //a[0]>a[1] 4>1 true
				{
					smallest=j;			//smallest=1  since a[j]=a[1]=1
				}
			}
			int temp=a[smallest];       //temp=1   since, a[smallest]=a[j]=1
			a[smallest]=a[i];			//a[j]=4   since, a[i]=a[0]=4
			a[i]=temp;					//a[i]=1
					
		}
		for(int elem: a)
		{
			System.out.print(elem + " ");
		}

	}

}
