package TestNGframeworks;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestNg {
	boolean val = true;

	@Test(enabled = false)

	public void f1() {

	System.out.println("method1");

	}

	@Test

	public void f2() {

	System.out.println("method2");

	throw new SkipException("not required");

	}

	@Test

	public void f3() {

	if (val == false) {

	System.out.println("true value printed");

	} else {

	System.out.println("false value printed");

	throw new SkipException("else not required");

	}

	}}
