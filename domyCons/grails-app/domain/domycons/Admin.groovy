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

    //Permite tener sólo una tabla para toda la jerarquía y no una por subclase
    static mapping = {
        tablePerHierarchy true
    }

    //Por cada búsqueda que se realice a la tabla Admin, retornará los resultados ordenados descendentemente dependiendo del atributo level
    /*def c = Admin.createCriteria()
    def results = c.list{
        order("level","desc")
    }*/

}
