# Scala Type Mismatch Bug
This repository demonstrates a common Scala bug involving type mismatch in a generic class method.
The `MyClass` class has a generic type parameter `T`. The `myMethod` compares instances of `MyClass` using `==`. This works fine when both instances have the same type parameter `T`. However, it fails to compile if instances of different types are used, as shown in the example.
The solution involves using structural equality or type-safe equals.