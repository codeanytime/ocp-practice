import com.moduleA.InfoServiceImpl;
import service.InfoService;

module moduleA {
    requires transitive moduleB;
    requires core.ocp;
    exports com.moduleA;
    provides InfoService with InfoServiceImpl;
    uses InfoService;
}