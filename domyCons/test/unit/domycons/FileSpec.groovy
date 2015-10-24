package domycons

import grails.test.mixin.TestFor
import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification

import grails.util.Holders

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestFor(File)
class FileSpec extends Specification {
    def config = Holders.config

    void "test nullable and lenght" (error, field, val) {
        when:
        mockForConstraintsTests(Admin)
        def obj = new Admin("$field": val)

        then:
        // These are set to ensure that an empty string isn't trimmed and converted to null

        validateConstraints(obj, field, error)

        where:
        error                  | field                      | val
        'min'                | 'level'                     | 0
        'valid'                | 'level'                     | 1
        'valid'                | 'level'                     | 5
        'max'                | 'level'                     | 6
        'min'                | 'rating'                     | -1
        'valid'                | 'rating'                     | 0
        'valid'                | 'rating'                     | 100
        'max'                | 'rating'                     | 101
    }

    private void validateConstraints(obj, field, error) {
        def validated = obj.validate()
        if (error && error != 'valid') {
            assert !validated
            assert obj.errors[field]
            assert error == obj.errors[field]
        } else {
            assert !obj.errors[field]
        }
    }
}
