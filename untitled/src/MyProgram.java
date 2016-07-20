    import java.util.*;
    // Created by z on 07.07.2016.

   //класс время. содержит время:час, минуты, секунды, а также день: число, месяц, год, и номер дня в очереди создавания.
  // ALT + ENTER - создать ф-цию
 // Ctrl + Q - узнать о ф-ции

class WrongTimeException extends Exception
{
    public WrongTimeException(){}
    public   WrongTimeException(String message)
    {
        super(message);
    }
}

class Time
{
    private static int nextNum = 1;
    private int hour;
    private int min;
    private int sec;


    public Time ()throws WrongTimeException
    {
       set(0,0,0);
        nextNum++;
    }
    public Time (int h,int m,int s)throws WrongTimeException
    {
        set (h,m,s);
        nextNum++;
    }
public void set (int h,int m,int s) throws WrongTimeException
{
    if (hour <0||hour>24)  throw new WrongTimeException("Некорректно задано время (часы)");
    if (min <0||min>60)  throw new WrongTimeException("Некорректно задано время (минуты)");
    if (sec<0||sec>60)  throw new WrongTimeException("Некорректно задано время (секунды)");
    hour = h;
    min = m;
    sec = s;
    nextNum++;
}
  public void Print ()
  {
      String hh="",mm="",ss="";
      if (hour <10)  hh="0";
      if (min <10)  mm="0";
      if (sec<10)  ss="0";
      System.out.println ("Время: " + hh+hour+":"+mm+min+":"+ss+sec);
  }
public String toString ()
{

  StringBuilder s = new StringBuilder();
    s.append("Time № ");
    s.append(nextNum);
    s.append(":   ");
    s.append( hour );
    s.append(":");
    s.append(min);
    s.append(":");
    s.append(sec);
    return s.toString();
}

    public boolean equals (Object other)
    {
        if (this == other) return true;
        if (other == null) return false;
        if (getClass()!=other.getClass()) return false;
        Time t = (Time) other;
        return hour==t.hour && min ==t.min && sec == t.sec;
    }

    public void Input ()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Время. Введите часы, минуты, секунды через пробел: ");
        hour = in.nextInt();
        min = in.nextInt();
        sec = in.nextInt();
    }
}
interface dc
{


}

class Apple
{



}











public class MyProgram
{
    public static void main (String [] args)
    {
      /* try {

Time time1 = new Time (1000,1,1);    /////
           time1.Print();


       }
       catch (WrongTimeException e)
       {
           System.out.println("ERROR!!!");
       }

        Collection <Integer> a = new ArrayList<Integer>();
a.add(100);
a.add (7777);
        for (Integer i:a)
        {
            System.out.println(i);

        }
        Collections.addAll(a,1,2,3);
        System.out.println(a);
        a = Arrays.asList(3,4,5,6);
        System.out.println(a);
        */
Integer i = new Integer(10);
        i = 20;
        System.out.println(i.hashCode());
        Apple time1 = new Apple ();
        System.out.println(time1.hashCode());
        System.out.println(time1.hashCode());

    }
//njnjnjnjknj


}