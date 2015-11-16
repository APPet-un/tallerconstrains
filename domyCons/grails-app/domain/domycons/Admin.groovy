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

    //Permite tener s�lo una tabla para toda la jerarqu�a y no una por subclase
    static mapping = {
        tablePerHierarchy true
    }

    //Por cada b�squeda que se realice a la tabla Admin, retornar� los resultados ordenados descendentemente dependiendo del atributo level
    /*def c = Admin.createCriteria()
    def results = c.list{
        order("level","desc")
    }*/

}
