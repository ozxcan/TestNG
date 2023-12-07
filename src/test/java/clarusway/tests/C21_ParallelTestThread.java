package clarusway.tests;

import org.testng.annotations.Test;

public class C21_ParallelTestThread {
    @Test
    public void test01() throws Exception {
        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
        System.out.println("Test 01 =" );
    }
      @Test
    public void test02() throws Exception {
          System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
          System.out.println("Test 02");
    }
      @Test
    public void test03() throws Exception {
          System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
          System.out.println("Test 03");
    }
      @Test
    public void test04() throws Exception {
          System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
          System.out.println("Test 04");
    }
      @Test
    public void test05() throws Exception {
          System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
          System.out.println("Test 05");
    }


}
