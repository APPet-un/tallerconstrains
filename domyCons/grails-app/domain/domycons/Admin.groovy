package domycons

/**
 * Created by Jhh on 10/21/2015.
 */
class Admin extends User {
    int level
    double rating
    static hasMany = [forum: Forum]

    static constraints = {
        level(nullable: false, min: 1, max: 5)
        rating(nullable: false, min: (double)0, max: (double)100)
    }
}
