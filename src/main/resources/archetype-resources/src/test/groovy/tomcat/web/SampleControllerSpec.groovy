package ${package}.tomcat.web

/**
 * Created by lb_lb on 28.01.2015.
 */
class SampleControllerSpec extends spock.lang.Specification {
    def "test helloWorld"() {
        expect:
        2 + 2 == 4
    }
}
