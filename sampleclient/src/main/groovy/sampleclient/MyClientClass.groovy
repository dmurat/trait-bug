package sampleclient

import groovy.transform.CompileStatic
import sample.MyTrait

@CompileStatic
class MyClientClass implements MyTrait {
  Integer myMethod() {
    myInteger()  // <---- marked red as an error
  }

  public static void main(String[] args) {
    println new MyClientClass().myMethod()
  }
}
