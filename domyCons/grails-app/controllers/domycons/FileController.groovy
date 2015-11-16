package domycons



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class FileController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    static scaffold = File

    def index(Integer max) {
        redirect action: showList
    }

    def showList(){
        respond File.list()
    }

    def showAdmin(){
        render view: "showFile", model: [file: File.get(params.id)]
    }

    def show(File fileInstance) {
        respond fileInstance
    }

    def beforeInterceptor = {
        log.trace("Se va a ejecutar la accion $actionName")
    }

    def afterInterceptor = {
        log.trace("Se ha ejecutado la accion $actionName")
    }

    def create() {
        respond new File(params)
    }

    @Transactional
    def save(File fileInstance) {
        if (fileInstance == null) {
            notFound()
            return
        }

        if (fileInstance.hasErrors()) {
            respond fileInstance.errors, view:'create'
            return
        }

        fileInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'file.label', default: 'File'), fileInstance.id])
                redirect fileInstance
            }
            '*' { respond fileInstance, [status: CREATED] }
        }
    }

    def edit(File fileInstance) {
        respond fileInstance
    }

    @Transactional
    def update(File fileInstance) {
        if (fileInstance == null) {
            notFound()
            return
        }

        if (fileInstance.hasErrors()) {
            respond fileInstance.errors, view:'edit'
            return
        }

        fileInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'File.label', default: 'File'), fileInstance.id])
                redirect fileInstance
            }
            '*'{ respond fileInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(File fileInstance) {

        if (fileInstance == null) {
            notFound()
            return
        }

        fileInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'File.label', default: 'File'), fileInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }
    def share(){
        render("La funcionalidad se encuentra implementada aun")
    }

    def download() {

        long theId = params.actualFile

        File theFile = File.get(theId)

        if(theFile == null) {
            render("El archivo no pudo ser encontrado")
        }
        else
        {
            response.setContentType("APPLICATION/OCTET-STREAM")
            response.setHeader("Content-Disposition", "Attachment;Filename=\"${params.content.originalFilename}\"")
            def outputStream = response.getOutputStream()
            outputStream << theFile.content
            outputStream.flush()
            outputStream.close()
            redirect (action:'show', fileInstance: theFile)
        }

    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'file.label', default: 'File'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
