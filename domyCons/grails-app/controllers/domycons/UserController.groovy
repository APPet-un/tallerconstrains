package domycons



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class UserController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        render view: "userLinks"
    }

    def show(User userInstance) {
        respond userInstance
    }

    def showUser(){
        render view: "showUser", model: [user: User.get(params.id)]
    }

    def userLinks() {
        render view: "userLinks", model:[userList: User.list(params)]
    }


    def login ={
        render view: "login"
    }

    def doLogin = {
        def user = User.findWhere(username: params['username'], password: params['password'])
        session.user = user
        if(user) {
            User u = user
            println u.getClass().name

            if(u.getClass().name.equals("domycons.Regular")){
                println "Soy regular"
                redirect(action: 'myProfileRegular', controller: 'Regular')
                flash.message = "logged in as <b>$u.name $u.lastName ($u.username)</b>"
            }
            else if(u.getClass().name.equals("domycons.Admin")){
                redirect(action: 'myProfileAdmin', controller: 'Admin')
                flash.message = "logged in as <b>$u.name $u.lastName ($u.username)</b>"
            }
            //render view: "myProfile"

        }else{
            redirect(action: 'login')
            flash.message = "Invalid Username/Password, please try again"
        }
    }

    def myProfile = {
        render view: "myProfile"
    }

    def showUsers(){
        render view: "showUsers", model: [userList: User.list(params)]
    }

    def checkUser = {
        if(!session.user){
            redirect(controller: User, action:'login')
            return false
        }
    }

    def beforeInterceptor = {
        println "Esta ejecutando la accion: " + actionName

    }

    def afterInterceptor = {
        println "se ha ejecutando la accion: " + actionName

    }


    def create() {
        respond new User(params)
    }

    @Transactional
    def save(User userInstance) {
        if (userInstance == null) {
            notFound()
            return
        }

        if (userInstance.hasErrors()) {
            respond userInstance.errors, view:'create'
            return
        }

        userInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'user.label', default: 'User'), userInstance.id])
                redirect userInstance
            }
            '*' { respond userInstance, [status: CREATED] }
        }
    }

    def edit(User userInstance) {
        respond userInstance
    }

    @Transactional
    def update(User userInstance) {
        if (userInstance == null) {
            notFound()
            return
        }

        if (userInstance.hasErrors()) {
            respond userInstance.errors, view:'edit'
            return
        }

        userInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'User.label', default: 'User'), userInstance.id])
                redirect userInstance
            }
            '*'{ respond userInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(User userInstance) {

        if (userInstance == null) {
            notFound()
            return
        }

        userInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'User.label', default: 'User'), userInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'user.label', default: 'User'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
