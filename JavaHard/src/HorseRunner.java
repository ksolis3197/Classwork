

public class HorseRunner {
	public static void main ( String[] args)
	{
		Horse horse1 = new Mustang( "Secretariat", 12000);
		Horse horse2 = new Mustang (" Dusty Trail", 22000);
		Horse horse3 = new Mustang ("Silver", 12000);
		
		Horse[] spaces = new Horse[6];
		
		spaces[1] = horse1;
		spaces[3] = horse2;
		spaces [5] = horse3;
		HorseBarn barn = new HorseBarn(spaces);
	//	System.out.println(spaces);
		
		
		for (Horse Mustang  : spaces)
		{
		
			if( Mustang == null)
			{
				System.out.print("null");
			}
			else
			{
				System.out.println(Mustang.getName());
			}
		}
		//System.out.println(barn);
		System.out.println(" Dusty Trail is in space: "+ barn.findHorseSpace("Dusty Trail"));
		
		barn.consolidate();
		
		
		for (Horse Mustang  : spaces)
		{
		
			if( Mustang == null)
			{
				System.out.print("null");
			}
			else
			{
				System.out.println(Mustang.getName());
			}
		}
		
		//System.out.println(barn);
		System.out.println(" Dusty Trail is now in space: "+ barn.findHorseSpace("Dusty Trail"));
		

	
	}

}
