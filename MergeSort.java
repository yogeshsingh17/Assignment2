
public class MergeSort 
{
	public static void conquer(int [] a,int si,int mid,int ei)
	{
		int [] merge= new int [ei-si+1];
		
		int idx1=si;			//first array starting from si(starting index)
		int idx2=mid+1;			//second array starting from mid +1
		int x=0;				//starting index of merged array.
		
		while(idx1<=mid && idx2<=ei)
		{
			if(a[idx1]<=a[idx2])
			{
				merge[x]=a[idx1];
				x++;
				idx1++;
			}
			else
			{
				merge[x]=a[idx2];
				x++;
				idx2++;
			}
		}
		
		while(idx1<=mid)
		{
			merge[x]=a[idx1];
			x++;
			idx1++;
		}
		
		while(idx2<=ei)
		{
			merge[x]=a[idx2];
			x++;
			idx2++;
		}
		
		for (int i=0, j=si; i<merge.length; i++,j++)
		{
			a[j]=merge[i];
		}
	}
	
	public static void divide(int [] a, int si ,int  ei)
	{
		if(si>=ei)
		{
			return;
		}
		
		int mid=(si+ei)/2;
		
		divide(a,si,mid);
		divide(a,mid+1,ei);
		
		conquer(a,si,mid,ei);
	}

	public static void main(String[] args) 
	{
		int [] a= {3,5,7,1,4,2,6,9,8};
		int n=a.length;
		
		divide(a,0,n-1);
		
		for(int i=0;i<=n-1;i++)
		{
			System.out.print(a[i] +" ");
		}
		System.out.println();

	}

}
