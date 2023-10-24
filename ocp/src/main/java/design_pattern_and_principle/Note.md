1. The type of the object determines which properties exist within the object in memory.
2. The type of the reference to the object determines which methods and variables are
   accessible to the Java program.
***
###Design pattern
1. Singleton
   * No public constructor
   * static method to create instance
   * final field (param of static method) type of class singleton
2. Immutable
   * Use constructor to set all properties
   * All field mark private final
   * No setter method
   * No reference object allow direct access to modify access directly
   * Prevent method from overridden
4. Builder
5. Factory