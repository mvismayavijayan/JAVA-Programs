import java.util.Scanner;
class numbers extends Exception{
	numbers(){
		super();
	}
	numbers(String s){
		super(s);
	}
}
class average{
	public static void main(String arg[]){
		int n,num,i=1;
		float sum=0,avg;
		try{
			System.out.println("How many number you want to enter:");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
		
			while(i<=n){
				System.out.println("Enter "+i+"th number:");
				num=sc.nextInt();
				if(num<0)
					throw new numbers();
				else
					sum+=num;
				i=i+1;
			}
			avg=sum/n;
			System.out.println("average:"+avg);

		}catch(numbers e){
			System.out.println("Exception " +e+ " are negative");
		}
	}
}
