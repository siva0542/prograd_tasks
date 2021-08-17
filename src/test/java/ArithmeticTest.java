import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ArithmeticTest {
    Arithmetic arithmetic =new Arithmetic(4,2);
    Arithmetic arithmetic1 =new Arithmetic(-2,-3);
    Arithmetic arithmetic2 =new Arithmetic(8,4);
    Arithmetic arithmetic3 =new Arithmetic(4,8);
    Arithmetic arithmetic4 =new Arithmetic(2,2);
    Arithmetic arithmetic5 =new Arithmetic(-2,2);
    Arithmetic arithmetic6 =new Arithmetic(-2,-2);
    Arithmetic arithmetic7 =new Arithmetic(8,2);
    Arithmetic arithmetic8 =new Arithmetic(8,-2);
    Arithmetic arithmetic9 =new Arithmetic(8,0);

    @Test
    public void toGetSixWhenAddingFourAndTwo(){
        int actualResult= arithmetic.sum();
        int expectedResult=6;
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toGetMinusFiveWhenAddingMinusTwoAndMinusThree(){
        int actualResult= arithmetic1.sum();
        int expectedResult=-5;
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toGetFourWhenSubstractingFourFromEight(){
        int actualResult= arithmetic2.sub();
        int expectedResult=4;
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toGetMinusFourWhenSubstractingEightFromFour(){
        int actualResult= arithmetic3.sub();
        int expectedResult=-4;
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toGetFourWhenMultiplyTwoWithTwo(){
        int actualResult= arithmetic4.multiply();
        int expectedResult=4;
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toGetMinusFourWhenMultiplyMinusTwoWithTwo(){
        int actualResult= arithmetic5.multiply();
        int expectedResult=-4;
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toGetFourWhenMultiplyMinusTwoWithMinusTwo(){
        int actualResult= arithmetic6.multiply();
        int expectedResult=4;
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toGetFourWhenDividingEightWithTwo(){
        int actualResult= arithmetic7.divide();
        int expectedResult=4;
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toGetMinusFourWhenDividingEightWithMinusTwo(){
        int actualResult= arithmetic8.divide();
        int expectedResult=-4;
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toGetAnExceptionWhenDividingEightWithZero(){
            int actualResult = arithmetic9.divide();
            int expectedResult=0;
            assertEquals(actualResult,expectedResult);

    }
}
