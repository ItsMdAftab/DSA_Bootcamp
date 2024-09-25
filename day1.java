//DSA BootCamp


//recursion Method example : 
/*
class bootcamp{
	static void fun(int x)
	{
		if (x>0)
		{
			System.out.print(x); 
			fun(x-1);
		}
		
	public static void main(String [] args){
		int x = 3 ;
		fun(x);
	}
	}
*/
//Searching algorithms: 

//1. linear search:
/*
class bootcamp
{
	static int  linearsearch(int[] arr,int key,int index)
	{
		if (index>=arr.length){
			return -1; 
		}
		else if (arr[index]==key){
			return index; 
		}
		else {
			return linearsearch(arr,key,index+1);
		}
	}
	public static void main(String args[])
	{
		int [] arr={1,2,3,6,9,0,11}; 
		int key=310;
		int index=0; 
		int ans=linearsearch(arr,key,index);
		System.out.print(ans); 
	}
	}
*/
//2. Binary Search:
/*
class bootcamp{
	static int binarysearch(int [] arr,int key , int low , int high)
	{
		
		if (low>high)
		{
			return -1;
		}
		int mid = (low+high)/2; 
		if (arr[mid]==key)
		{
			return mid; 
		}
		if(key>arr[mid])
		{
			return binarysearch(arr,key,mid+1,high); 
		}
		else 
		{	
			return binarysearch(arr,key,low,mid-1); 
		}
		 
	}
	public static void main(String[] args){
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int n= arr.length; 
		int key= 11; 
		int low= 0; 
		int high=n-1; 
		int value=binarysearch(arr,key,low,high); 
		System.out.print(value); 
	}
}
*/