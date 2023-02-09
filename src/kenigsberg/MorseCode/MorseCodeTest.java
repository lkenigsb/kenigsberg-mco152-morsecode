package kenigsberg.MorseCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MorseCodeTest
{
    @Test
    public void testToMorseCode()
    {
        // given
        MorseCode message = new MorseCode();

        // when
        String translated = message.toMorseCode("Hello test");

        // then
        Assertions.assertEquals("* * * *   *   * --- * *   * --- * *   --- --- ---      ---   *   * * *   ---   ", translated);
    }

    @Test
    public void testToMessage()
    {
        //given
        MorseCode message = new MorseCode();

        //when
        String translated = message.toMessage("* * * *   *   * --- * *   * --- * *   --- --- ---      ---   *   * * *   ---   ");

        // then
        Assertions.assertEquals("HELLO TEST ", translated);
    }
}