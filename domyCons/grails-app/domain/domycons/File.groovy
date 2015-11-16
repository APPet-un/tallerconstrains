package domycons

class File {

    String fileType //  debe verificarse que tenga al menos un “/” y mínimo un caracter antes y un caracter después de dicho símbolo
    Byte[] content // El atributo “content” contiene los bytes del archivo en cuestión
    double size // El tamaño (“size”) de un archivo representa el tamaño del archivo en BYTES y  debe ser máximo de 10 MB (MegaBytes)

    static belongsTo = [post: Post]

    static constraints = {

        /*fileType validator: {
            if (it.size()>= 3){
                idx = it.indexOf("/")
                if(idx < 1 && idx >= it.size()-1){
                    return ['error tipo de file ']
                }
            }else{
                return ['error tipo de file ']
            }
        }*/
        fileType inList: [".txt (text/plain)",".png(image/png)"]
        content nullable: false
        size validator: {
            if(it > 1048576){
                return ["tamaño mayor a 10 MB"]
            }
        }
    }

    static mapping ={
        post column: 'post_belong_id'
    }

    def share(){


    }

    def download(){


    }
}

