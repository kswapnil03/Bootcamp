
import spock.lang.Specification

class AdditionSpec extends Specification {
    def addition
    void setup() {
        addition = new Addition();
    }

    void "canary test"(){
        println "this is canary test"
        expect:
        true
    }
    void "testSumInts"() {

        setup:
        def a = 10
        //Used and only for illustration, can do in setup
        and:
        def b = 20

        when:

       def c = addition.add(a, b)

        then:
        c == 30
    }

    void "testSumStrings"() {
        given:
        def a = "Hello"
        //Used and only for illustration, can do in given
        and:
        def b = "World"

        expect:
        addition.sum(a, b) == "HelloWorld"
    }

}