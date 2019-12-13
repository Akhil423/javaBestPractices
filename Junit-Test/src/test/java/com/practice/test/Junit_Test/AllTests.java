package com.practice.test.Junit_Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, QuickBeforeAndAfter.class, StringHelperTest.class })
public class AllTests {

}
