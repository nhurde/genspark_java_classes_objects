public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello World");

        //Part1_partD
        Holiday indepdenceDay = new Holiday("Independence Day",4,"July");
        Holiday cincoDeMayo = new Holiday("Cicno De Mayo",5,"May");
        boolean holidaysTheSame = (indepdenceDay.inSameMonth(indepdenceDay, cincoDeMayo));


        if( holidaysTheSame )
        {
            System.out.println( cincoDeMayo.getName() + " is the same month as "+ indepdenceDay.getName() ) ;

        }
        else
        {
            System.out.println( cincoDeMayo.getName() + " IS NOT the same month as "+ indepdenceDay.getName()  );
        }

        holidaysTheSame = indepdenceDay.inSameHoliday( cincoDeMayo );

        if( holidaysTheSame )
        {
            System.out.println( cincoDeMayo.getName() + " equals/overlaps "+ indepdenceDay.getName() ) ;
        }
        else
        {
            System.out.println( cincoDeMayo.getName() + " IS NOT equal to "+ indepdenceDay.getName()  );
        }

        //Q2:PartD
        Movie casinoMovie = new Movie("Casino Royale","Eon Productions","PG-13");
    }
}