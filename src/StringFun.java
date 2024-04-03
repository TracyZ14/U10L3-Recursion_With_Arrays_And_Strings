public class StringFun
{
    public static void main(String [] args)
    {
        System.out.println(mysteryString("xyzxyxy"));
    }

    public static int mysteryString(String str)
    {
        if(str.length() == 1)
        {
            if(str.substring(0, 1).equals("y"))
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if(str.substring(0, 1).equals("y"))
            {
                return 1 + mysteryString(str.substring(1));
            }
            else
            {
                return mysteryString(str.substring(1));
            }
        }
    }
}