package domycons

/**
 * Created by Jhh on 10/21/2015.
 */
class Admin {
    int level
    double rating

    static constraints = {
        level(min: 1, max: 5, nullable: false)
        rating(min: 0, max: 100, nullable: false)
    }
}
