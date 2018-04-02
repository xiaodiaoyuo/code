package com.nxz;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

/**
 * Created by jany.nie on 2018/3/31.
 */
public class SimpleTest {
    private static Logger log = LoggerFactory.getLogger(SimpleTest.class);
    @BeforeClass
    public void setUp() {
        System.out.println("before class====================");
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = { "fast" })
    public void aFastTest() {
        System.out.println("Fast test");
    }

    @Test(groups = { "slow" })
    public void aSlowTest() {
        System.out.println("Slow test");
        log.info("++++++++++++++++++++++++++++++++ReturnCode:" );
    }

}
