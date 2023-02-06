public class ChangeString
    {
        public static String yellString(String s)
        {
            String retString = "";

            if (s.length() == 0)
            {
                retString = "You didn't enter anything" + exclamationPoint();
            }
            //else if the whole string is already uppercase
            else if (alreadyAllCaps(s))
            {
                retString = "You already entered all caps" + exclamationPoint() + "\n" +
                    "Here's your string in all lowercase: " + s.toLowerCase();
            }
            else
            {
                retString = s.toUpperCase() + exclamationPoint();
            }
            return retString;

        }

        public static String exclamationPoint()
        {
          String ex = "!";
          int rand = (int)(Math.random() * 10);
           //for loop that adds the exclamation points
            for (int i = 0; i < rand; i++)
            {
                ex = ex + "!";
            }
            return ex;

        }

        public static boolean alreadyAllCaps(String s)
        {
        boolean returnBool = false;
        if (s.equals(s.toUpperCase()))
        {
            returnBool = true;
        }
        else
        {
            returnBool = false;
        }
        return returnBool;
        }
    }
