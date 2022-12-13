package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook1 {
@Before("@Datadriven")
public void before1()
{
	System.out.println("before1 method");
}
@After("@ValidLogin")
public void After1()
{
	System.out.println("After 1 method");
}

@Before("@ValidLogin")
public void before2()
{
	System.out.println("before2 method");
}
@After("@Datadriven")
public void After2()
{
	System.out.println("After 2 method");
}
}
