package domycons

class Regular extends User{

	int postViews
	int strikesNumber
	int starsNumber

    static constraints = {
	
	postViews (blank: false)		//Numero de post no puede ser nulo
	strikesNumber (blank: false)	//Numero de strikes no puede ser nulo
	starsNumber (blank: false)		//Numero de estrellas no puede ser nulo
	
	postViews (min: 0)				//El numero de post inicia en 0 y no tiene limite superior
	strikesNumber (range: 0..3)		//Se pueden tener de 0 a 3 strikes
	starsNumber (range: 0..5)		//Se pueden tener de 0 a 5 estrellas
    }
}
