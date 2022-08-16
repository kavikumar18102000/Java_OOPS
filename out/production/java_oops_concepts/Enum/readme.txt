
enum and constructor:
* enum can contain a constructor and it is executed separately for each enum constant at the time of enum class loading.
* We can’t create enum objects explicitly and hence we can’t invoke enum constructor directly.



 enum and methods:
 * enum can contain both concrete methods and abstract methods. If an enum class has an abstract method, then each instance
   of the enum class must implement it.