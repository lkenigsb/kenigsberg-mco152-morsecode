package kenigsberg.MorseCode;

public class MorseCode
{

    final String[] morseCode;
    final String[] letters;

    public MorseCode()
    {

        this.morseCode = new String[] {"* ---","--- * * *","--- * --- *","--- * *","*","* * --- *","--- --- *","* * * *","* *",
                "* --- --- ---","--- * ---","* --- * *","--- ---","--- *","--- --- ---","* --- --- *","--- --- * ---",
                "* --- *","* * *","---","* * ---","* * * ---","* --- ---","--- * * ---","--- * --- ---","--- --- * *"};


        this.letters = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U",
        "V","W","X","Y","Z"};
    }


    public String toMorseCode(String message)
    {
        StringBuilder morseCode = new StringBuilder();
        //iterate through the message
        for (int i = 0; i < message.length(); i++)
        {
            //for every letter, access that alphabet number
            // converting input letter in to uniform case.
            char accessLetter = message.charAt(i);
            if (accessLetter == ' ')
            {
                morseCode.append("   ");
            }
            else//in the middle of a word
            {
                accessLetter = Character.toLowerCase(accessLetter);

                int asciiValueOfLetter = (int) accessLetter;

                int positionInArray = asciiValueOfLetter - 97;
                morseCode.append(this.morseCode[positionInArray]).append("   ");

            }

        }
        return morseCode.toString();//message in morse code using - & *
    }

    public String toMessage(String morseCode)
    {
        StringBuilder message = new StringBuilder();
        String[] amountWords = morseCode.split(" {6}");


        for (int words = 0; words < amountWords.length; words++)
        {
            String[] morseCodeMessage = amountWords[words].split(" {3}");
            for (int i = 0; i < morseCodeMessage.length; i++)
            {
                for (int j = 0; j < this.morseCode.length; j++)
                {
                    if (morseCodeMessage[i].equals(this.morseCode[j]))
                    {
                        message.append(this.letters[j]);
                        break;
                    }
                }
            }
            message.append(" ");
        }
        

        return message.toString();
    }
}
