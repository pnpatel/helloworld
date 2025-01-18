package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestHelloWorld {

  private HelloWorld helloworld;

  @Before
  public void setup() {
    pntest = new HelloWorld();
  }

  @Test
  public void textShouldIncludeTheOneBeingGreeted() {
    String someone = "World";

    assertThat(pntest.greet(someone), containsString(someone));
  }

  @Test
  public void textShouldIncludeGreetingPhrase() {
    String someone = "World";

    assertThat(pntest.greet(someone).length(), is(greaterThan(someone.length())));
  }
}
