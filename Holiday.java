public class Holiday
{
    private String name;
    private int day;
    private String month;
// your code goes here

    //Part1_partA
    public Holiday( String hName, int hDay, String hMonth )
    {
        this.name = hName;
        this.day = hDay;
        this.month = hMonth;
    }

    //Extra methods for getters [ start ]
    int getDay()
    {
        return day;
    }

    String getMonth()
    {
        return month;
    }

    String getName()
    {
        return name;
    }


    public boolean inSameHoliday( Holiday otherHoliday )
    {
        return inSameHoliday( this, otherHoliday );
    }
    
    public boolean inSameHoliday( Holiday holiday1, Holiday holiday2 )
    {
        if( holiday1.name.equals( holiday2.name)  == false )
        {
            return false;
        }

        if( holiday1.month.equals( holiday2.month) == false )
        {
            return false;
        }

        if( holiday1.day != holiday2.day )
        {
            return false;
        }
        return true;
    }

    //Extra methods for getters [ end ]

    //Part1_PartB
    public boolean inSameMonth( Holiday otherHoliday)
    {
        return inSameMonth( this, otherHoliday );
    }

    public boolean inSameMonth( Holiday holiday1, Holiday holiday2 )
    {
        return ( holiday1.month.equals( holiday2.month) );
    }

    //Part1_PartC
    public double avgDate( Holiday[] holidays )
    {
        double holiday_days_count = 0;
        double holidays_size = holidays.length;
        for(int i = holidays.length -1; i >=0;  i-- )
        {
            holiday_days_count += holidays[i].day;
        }

        holiday_days_count /= holidays_size;

        return  holiday_days_count;
    }
}
