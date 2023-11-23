module moduleA {
    requires transitive moduleB;
    uses com.moduleB.BClass;
    exports com.moduleA;
}