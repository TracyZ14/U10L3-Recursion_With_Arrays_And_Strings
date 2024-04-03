public class Main
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("rotator"));

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(countEvens(array, 0));
        int[] array2 = {1, 2, 3, 4, 5, 6};
        System.out.println(countEvens(array2, 0));

        System.out.println(findMaximum(array, 0));
        System.out.println(findMaximum(array2, 0));
    }

    public static boolean isPalindrome(String check)
    {
        String firstCharacter = String.valueOf(check.charAt(0));
        String lastCharacter = String.valueOf(check.charAt(check.length() - 1));
        if(firstCharacter.equals(lastCharacter))
        {
            if((check.length() - 2) > 1)
            {
                return(isPalindrome(check.substring(1, check.length() - 1)));
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }

    public static int countEvens(int[] array, int i)
    {
        if(i < (array.length - 1))
        {
            if((array[i] % 2) == 0)
            {
                return(1 + countEvens(array, i + 1));
            }
            else
            {
                return(countEvens(array, i + 1));
            }
        }
        else
        {
            if((array[i] % 2) == 0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }

    public static int findMaximum(int[] array, int i)
    {
        int number = array[i];
        if(i < (array.length - 1))
        {
            if(number < findMaximum(array, i + 1))
            {
                return(findMaximum(array, i + 1));
            }
            else
            {
                return(number);
            }
        }
        else
        {
            return(number);
        }
    }
}