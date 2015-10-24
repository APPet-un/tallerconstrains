package domycons

class User {

    String name
    String lastName
    Integer age
    String username
    String password

    static constraints = {
        name(blank: false, nullable: false)
        lastName(blank: false, nullable: false)
        age(blank: false, nullable: false)
        username(blank: false, nullable: false, unique: true)
        password(blank: false, nullable: false)

        name(size:3..50)
        lastName(size:3..50)
        age(min: 13)
        password(matches: "[0-9a-za-z]+", minSize: 8)


    }
}
