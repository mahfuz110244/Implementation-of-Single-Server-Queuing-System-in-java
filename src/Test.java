import java.util.Scanner;



public class Test 
{
	
	public static void main(String[] args)
	{
		SingleServer s = new SingleServer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mean inter arrival time = ");
		s.mean_interarrival=sc.nextDouble();
		
		System.out.println("\nEnter mean service time of server  = ");
		s.mean_service=sc.nextDouble();
		System.out.println("\nEnter number of customer  = ");
		s.num_of_customer= sc.nextInt();
	    s.initialize();
		
		while(s.num_custs_delayed<s.num_of_customer)
		{
			s.timing();
			s.update_time_avg_stats();
			 
			switch (s.next_event_type)
			{
				case 1: s.arrive();
				break;
				case 2: s.depart();
				break;
			}	
		}
		s.print();
		}

}
