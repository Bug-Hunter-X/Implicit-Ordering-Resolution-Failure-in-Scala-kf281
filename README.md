# Implicit Ordering Resolution Failure in Scala

This example demonstrates a common runtime error related to implicit resolution in Scala. The code attempts to use an implicit `Ordering` instance, but fails if an appropriate instance is not found within the scope.

The `MyClass` uses an implicit `Ordering[T]` within its `myMethod` function. While this works fine for `Int` (as `Ordering[Int]` is implicitly available), it fails for `String` since a default implicit `Ordering[String]`  for lexicographic ordering is not in scope without the import. 

## Solution: Import Ordering or Provide Implicit

The provided solution shows how to resolve this by either providing an implicit `Ordering[String]` instance or importing the necessary implicits from the `scala.math.Ordering` object.