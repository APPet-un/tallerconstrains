package domycons



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class AdminController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index() {
        render (view: 'adminLinks.gsp')
    }

    def showAdmins(){
        String response = ""

        Admin.getAll().each {
            response += it.name + " "
            response += it.lastName + " "
            response += it.age + " "
            response += it.rating + " "
            response += it.level + " "
            response += "\n"
        }
        render response
        //[admins: Admin.get(params)]
        println "Redireccion Exitosa"

    }

    def showAdmin(){
        render view: "showAdmin", model: [admin: Admin.get(params.id)]
    }

    def adminLinks() {
        render view: "adminLinks", model:[adminList: Admin.list(params)]
    }

    def show(Admin adminInstance) {
        respond adminInstance
    }

    def myProfileAdmin = {
        render view: "myProfileAdmin"
    }

    def beforeInterceptor = {
        println "Esta ejecutando la accion: " + actionName

    }

    def afterInterceptor = {
        println "se ha ejecutando la accion: " + actionName

    }

    def create() {
        respond new Admin(params)
    }

    @Transactional
    def save(Admin adminInstance) {
        if (adminInstance == null) {
            notFound()
            return
        }

        if (adminInstance.hasErrors()) {
            respond adminInstance.errors, view:'create'
            return
        }

        adminInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'admin.label', default: 'Admin'), adminInstance.id])
                redirect adminInstance
            }
            '*' { respond adminInstance, [status: CREATED] }
        }
    }

    def edit(Admin adminInstance) {
        respond adminInstance
    }

    @Transactional
    def update(Admin adminInstance) {
        if (adminInstance == null) {
            notFound()
            return
        }

        if (adminInstance.hasErrors()) {
            respond adminInstance.errors, view:'edit'
            return
        }

        adminInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Admin.label', default: 'Admin'), adminInstance.id])
                redirect adminInstance
            }
            '*'{ respond adminInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Admin adminInstance) {

        if (adminInstance == null) {
            notFound()
            return
        }

        adminInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Admin.label', default: 'Admin'), adminInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'admin.label', default: 'Admin'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
