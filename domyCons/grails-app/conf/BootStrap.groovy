import domycons.Admin
import domycons.Forum
import domycons.Post
import domycons.Regular

class BootStrap {
    def init = { servletContext ->

        Admin admin1 = new Admin(name: 'John', lastName: 'Doe', age: 20, username: 'jDoiwer', password: '12345678', level: 4, rating: 5)
        Admin admin2 = new Admin(name: 'Stephanie', lastName: 'Doe', age: 20, username: 'Steph', password: '12345678', level: 4, rating: 5)
        Admin admin3 = new Admin(name: 'Almendra', lastName: 'Doe', age: 20, username: 'almendrita', password: '12345678', level: 4, rating: 5)

        admin1.save()
        admin2.save()
        admin3.save()

        Forum f1 = new Forum(name: 'Cosas bonitas',dateCreate: new Date('11/21/2015'), category: 'Niñas')
        Forum f2 = new Forum(name: 'Video juegos',dateCreate: new Date('11/22/2015'), category: 'Adolescentes')
        Forum f3 = new Forum(name: 'Recetas',dateCreate: new Date('11/23/2015'), category: 'Mujeres')

        f1.admin = admin1
        f2.admin = admin2
        f3.admin = admin1

        f1.save()
        f2.save()
        f3.save()

        Regular ur1 = new Regular(name: 'Catherin', lastName: 'Doe', age: 20, username: 'Cathe', password: '12345678',postViews: 2,strikesNumber: 0,starsNumber: 3)
        Regular ur2 = new Regular(name: 'Karen', lastName: 'Mendez', age: 20, username: 'KarenM', password: '12345678', postViews: 2,strikesNumber: 1,starsNumber: 4)
        Regular ur3 = new Regular(name: 'Alejandra', lastName: 'Doe', age: 20, username: 'aleja', password: '12345678', postViews: 1,strikesNumber: 0,starsNumber: 7)

        ur1.save()
        ur2.save()
        ur3.save()

        ArrayList<String> comm = new ArrayList<>(Arrays.asList("Me parece genial este tema","Qué aburrido","Qué interesante"))

        Post post1 = new Post(topic: 'Juegos',
                              dateCreate:  new Date('11/21/2015'),
                              lastUpdate: new Date('11/29/2015'),
                              itsAllowed: true,
                              comments: comm,
                              rate: 4)

        Post post2 = new Post(topic: 'Libros',
                dateCreate:  new Date('11/22/2015'),
                lastUpdate: new Date('11/28/2015'),
                itsAllowed: true,
                comments: comm,
                rate: 5)

        post1.regularUser = ur1
        post2.regularUser = ur2

        post1.save()
        post2.save()
    }
    def destroy = {
    }

}
