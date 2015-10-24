package domycons

import grails.test.mixin.TestFor
import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification

import grails.util.Holders

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestFor(Forum)
class ForumSpec extends Specification {
    def config = Holders.config

    void "test nullable and lenght" (error, field, val) {
        when:
        mockForConstraintsTests(Forum)
        def obj = new Forum("$field": val)

        then:
        validateConstraints(obj, field, error)

        where:
        error                  | field                      | val
        null                | 'name'                     | "fabian"
        null                | 'name'                     | "fa"

    }

    private void validateConstraints(obj, field, error) {
        if(field != "name") {
            def validated = obj.validate()
            if (error && error != 'valid') {
                assert !validated
                assert obj.errors[field]
                assert error == obj.errors[field]
            } else {
                assert !obj.errors[field]
            }
        } else{
            if(obj.name.length() <= 20 &&
            obj.name.length() >= 3) assert error == obj.errors[field]
        }
    }
}
