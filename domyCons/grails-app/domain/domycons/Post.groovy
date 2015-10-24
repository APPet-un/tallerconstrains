package domycons

class Post {

    String topic // debe tener una longitud m�nima de 3 caracteres y una  longitud m�xima de 50 caracteres
    Date dateCreated // La fecha de creaci�n del post debe ser futura respecto a la fecha actual cuando se crea el post
    Date lastUpdate // La fecha de actualizaci�n del post debe ser futura respecto a la fecha actual
    boolean itsAllowed
    static hasMany = [File: file]

    static constraints = {
        topic size: 3..50
        dateCreated validator:{
            Date dateobj = new Date();
            if(!it.after(dateobj)) return ['la fecha es pasada a la creacion del post']
        }
        lastUpdate validator:{
            Date dateobj = new Date();
            if(!dateobj.after(it)) return ['la fecha de actualizacion es anterior a la fecha actual']
        }

    }
}
