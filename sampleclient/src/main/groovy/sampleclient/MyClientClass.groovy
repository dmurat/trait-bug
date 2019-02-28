package sampleclient

import groovy.transform.CompileStatic
import sample.MyTrait

@CompileStatic
class MyClientClass implements MyTrait {
  Integer myMethod() {
    myInteger()
  }

  public static void main(String[] args) {
    println new MyClientClass().myMethod()
  }
}
