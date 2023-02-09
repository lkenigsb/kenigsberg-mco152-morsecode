package kenigsberg.morsecode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MorseCodeTest
{
    @Test
    public void toMorseCode()
    {
        // given
        MorseCode message = new MorseCode();

        // when
        String translated = message.toMorseCode("Hello test");

        // then
        Assertions.assertEquals("* * * *   *   * --- * *   * --- * *   --- --- ---      ---   *   * * *   ---   ", translated);
    }

    @Test
    public void toMessage()
    {
        //given
        MorseCode message = new MorseCode();

        //when
        String translated = message.toMessage("* * * *   *   * --- * *   * --- * *   --- --- ---      ---   *   * * *   ---   ");

        // then
        Assertions.assertEquals("HELLO TEST ", translated);
    }
}