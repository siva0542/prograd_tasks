import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ArithmeticTest {
    Arthimetic arithmetic =new Arthimetic(4,2);
    Arthimetic arithmetic1 =new Arthimetic(-2,-3);
    Arthimetic arithmetic2 =new Arthimetic(8,4);
    Arthimetic arithmetic3 =new Arthimetic(4,8);
    Arthimetic arithmetic4 =new Arthimetic(2,2);
    Arthimetic arithmetic5 =new Arthimetic(-2,2);
    Arthimetic arithmetic6 =new Arthimetic(-2,-2);
    Arthimetic arithmetic7 =new Arthimetic(8,2);
    Arthimetic arithmetic8 =new Arthimetic(8,-2);
    Arthimetic arithmetic9 =new Arthimetic(8,0);
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
        try {
            int actualResult = arithmetic9.divide();
        }
        catch(Exception numeric){
            System.out.println("You Can't divide a number with zero");
        }
    }

}
