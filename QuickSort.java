
public class QuickSort 
{
		public static int partition(int [] a,int low, int high)
		{
			int pivot=a[high];
			int i=low-1;
			
			for(int j=low;j<high;j++)
			{
				if(a[j]<pivot)
				{
					i++;
					//SWAP
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			i++;
			int temp=a[i];
			a[i]=pivot;
			a[high]=temp; //previous position of pivot i.e a[high]
			return i;
			
		}
		
		public static void quicksort(int [] a,int low, int high)
		{
			if(low<high)
			{
				int pidx= partition(a,low,high);
				
				quicksort(a,low,pidx-1);
				quicksort(a,pidx+1,high);
				
				
			}
		}
		public static void main(String[] args) 
		{
			int [] a= {2,4,3,5,7,9,8,6};
			int n=a.length;
			
			quicksort(a,0,n-1);
			
			for(int i=0;i<n;i++)
			{
				System.out.print(a[i] +" ");
			}System.out.println();

		}

}
