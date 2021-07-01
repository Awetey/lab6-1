package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.utils;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.MyStudentRecordsMgmtApp;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecondBiggestFinderTest {
    private MyStudentRecordsMgmtApp secondBiggest;

    @Before
    public void setUp() throws Exception{
        this.secondBiggest=new MyStudentRecordsMgmtApp();
    }

    @After
    public void tearDown() throws Exception{
        this.secondBiggest=null;
    }

    @Test
    public void testFindSecondBiggest(){
        Integer[] input=new Integer[]{1,2,3,4,5};
        Integer expected=4;
        Integer actual=this.secondBiggest.findSecondBiggest(input);
        assertEquals(expected,actual);
    }

    @Test
    public void testFindSecondBiggestNull(){
        Integer[] input=new Integer[]{1,2,3,4,5};
        Integer expected=4;
        Integer actual=this.secondBiggest.findSecondBiggest(input);
        assertEquals(expected,actual);
    }

}
