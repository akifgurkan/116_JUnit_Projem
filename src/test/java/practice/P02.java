package practice;

import org.junit.*;

public class P02 {

    @BeforeClass
    public static void BefforeClass () {
        System.out.println("Before class Çalıştı");
    }

    @AfterClass
    public static void AfterClass (){
        System.out.println("after Class çalıştı");
    }

    @Before
    public void Before(){
        System.out.println("Before notasyonu çlıştı");
    }

    @After
    public void After(){
        System.out.println("After notasyonu çlıştı");
    }

    @Test
    public void test1(){
        System.out.println("1. Test");
    }

    @Test
    public void test2(){
        System.out.println("2. Test");
    }
}
