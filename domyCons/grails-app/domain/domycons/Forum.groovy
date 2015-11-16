package domycons

class Forum {

    String name //El nombre del foro debe tener una longitud mínima de 3 caracteres, una longitud máxima de 20 caracteres y debe ser único
    Date dateCreate // La fecha de creación de un foro debe ser futura respecto a la fecha actual
    String category //  La categoría de un foro debe tener una longitud mínima de 3 caracteres y una longitud máxima de 15 caracteres

    static hasOne = [admin: Admin]
    static hasMany = [posts: Post]

    static constraints = {
        name size: 3..20, unique: true
        dateCreate blank: false
        //dateCreated(validator: {
         //   return (it > new Date())})
        dateCreate validator:{
            //Date dateobj = new Date()
            if(it < new Date()) return ['la fecha del foro debe ser futura']
        }
        category size: 3..15
    }

    static mapping = {
        posts cascade: 'delete'
    }



}
