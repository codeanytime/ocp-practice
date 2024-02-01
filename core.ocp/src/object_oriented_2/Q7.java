package object_oriented_2;

interface ILog {
    default void log() {
        System.out.println("ILog");
    }
}

abstract class Log {
    public static void log() {
        System.out.println("Log");
    }
}

//class Q7 extends Log implements ILog {
//    public static void main(String[] args) {
////        ILog log = new Q7();
////        log.log();
//    }
//}
