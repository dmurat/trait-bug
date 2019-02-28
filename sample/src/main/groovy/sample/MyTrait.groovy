package sample

trait MyTrait {
  @Delegate
  MyService myService = new MyService()
}
