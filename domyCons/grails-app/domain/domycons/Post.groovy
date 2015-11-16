package domycons

class Post {

    String topic // debe tener una longitud mínima de 3 caracteres y una  longitud máxima de 50 caracteres
    Date dateCreate // La fecha de creación del post debe ser futura respecto a la fecha actual cuando se crea el post
    Date lastUpdate // La fecha de actualización del post debe ser futura respecto a la fecha actual
    boolean itsAllowed
    ArrayList<String>comments
    int rate

    static hasMany = [files: File]
    static belongsTo = [forum: Forum, regularUser: Regular]

    Post(){
        comments = new ArrayList<String>()
    }

    static constraints = {
        topic size: 3..50

        dateCreate validator:{
            if(it < new Date()) return ['la fecha es pasada a la creacion del post']
        }
        lastUpdate validator:{
            if(it < new Date()) return ['la fecha de actualizacion es anterior a la fecha actual']
        }
        rate(nullable: false, min: 0)
    }

    static mapping = {
        regularUser column: 'owner_id'
        forum column: 'fatherForum_id'
        files cascade: 'delete'
    }

}

