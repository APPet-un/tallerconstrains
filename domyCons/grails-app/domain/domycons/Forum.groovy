package domycons

class Forum {

    String name //El nombre del foro debe tener una longitud mínima de 3 caracteres, una longitud máxima de 20 caracteres y debe ser único
    Date dateCreated // La fecha de creación de un foro debe ser futura respecto a la fecha actual
    String category //  La categoría de un foro debe tener una longitud mínima de 3 caracteres y una longitud máxima de 15 caracteres

    static hasOne = [admin: Admin]
    static hasMany = [posts: Post]

    static constraints = {
        name size: 3..20, unique: true
        dateCreated validator:{
            Date dateobj = new Date()
            if(!it.after(dateobj)) return ['la fecha es pasada a la creacion del post']
        }
        category size: 3..15
    }

    static mapping = {
        posts cascade: 'delete'
    }

    def beforeInsert() {
        dateCreated = new Date()
    }


}
