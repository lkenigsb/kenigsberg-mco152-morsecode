package kenigsberg.MorseCode;

public class MorseCode
{

    final String[] morseCode;
    final String[] letters;

    public MorseCode()
    {

        this.morseCode = new String[26]; //every object created, creates an array of morse code values each index matching to letter in alphabet

        morseCode[0] = "* ---";//A
        morseCode[1] = "--- * * *";//B
        morseCode[2] = "--- * --- *";//C
        morseCode[3] = "--- * *";//D
        morseCode[4] = "*";//E
        morseCode[5] = "* * --- *";//F
        morseCode[6] = "--- --- *";//G
        morseCode[7] = "* * * *";//H
        morseCode[8] = "* *";//I
        morseCode[9] = "* --- --- ---";//J
        morseCode[10] = "--- * ---";//K
        morseCode[11] = "* --- * *";//L
        morseCode[12] = "--- ---";//M
        morseCode[13] = "--- *";//N
        morseCode[14] = "--- --- ---";//O
        morseCode[15] = "* --- --- *";//P
        morseCode[16] = "--- --- * ---";//Q
        morseCode[17] = "* --- *";//R
        morseCode[18] = "* * *";//S
        morseCode[19] = "---";//T
        morseCode[20] = "* * ---";//U
        morseCode[21] = "* * * ---";//V
        morseCode[22] = "* --- ---";//W
        morseCode[23] = "--- * * ---";//X
        morseCode[24] = "--- * --- ---";//Y
        morseCode[25] = "--- --- * *";//Z

        this.letters = new String[26];

        letters[0] = "A";
        letters[1] = "B";
        letters[2] = "C";
        letters[3] = "D";
        letters[4] = "E";
        letters[5] = "F";
        letters[6] = "G";
        letters[7] = "H";
        letters[8] = "I";
        letters[9] = "J";
        letters[10] = "K";
        letters[11] = "L";
        letters[12] = "M";
        letters[13] = "N";
        letters[14] = "O";
        letters[15] = "P";
        letters[16] = "Q";
        letters[17] = "R";
        letters[18] = "S";
        letters[19] = "T";
        letters[20] = "U";
        letters[21] = "V";
        letters[22] = "W";
        letters[23] = "X";
        letters[24] = "Y";
        letters[25] = "Z";

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
        

        return String.valueOf(message);
    }
}
