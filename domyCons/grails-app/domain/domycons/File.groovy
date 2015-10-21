package domycons

class File {

    String fileType //  debe verificarse que tenga al menos un �/� y m�nimo un caracter antes y un caracter despu�s de dicho s�mbolo
    Byte[] content // El atributo �content� contiene los bytes del archivo en cuesti�n
    double size // El tama�o (�size�) de un archivo representa el tama�o del archivo en BYTES y  debe ser m�ximo de 10 MB (MegaBytes)


    static constraints = {
        fileType validator: {
            if (it.size()>= 3){
                idx = it.indexOf("/")
                if(idx < 1 && idx >= it.size()-1){
                    return ['error tipo de file ']
                }
            }else{
                return ['error tipo de file ']
            }
        }

        content nullable: false
        size validator: {
            if(size > 1048576){
                return ["tama�o mayor a 10 MB"]
            }
        }
    }
}
