package domycons


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PostController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        render view: "postLinks"
    }

    def show(Post postInstance) {
        respond postInstance
    }

    def showPost(){
        render view: "showPost", model: [post: Post.get(params.id)]
    }

    def showPosts(){
        render view: "showPosts", model: [postList: Post.list(params)]
    }

    def PostLinks() {
        render view: "postLinks", model:[postList: Post.list(params)]
    }

    def create() {
        respond new Post(params)
    }
    def beforeInterceptor = {
        println "Esta ejecutando la accion: " + actionName

    }

    def afterInterceptor = {
        println "se ha ejecutando la accion: " + actionName

    }
    @Transactional
    def save(Post postInstance) {
        if (postInstance == null) {
            notFound()
            return
        }

        if (postInstance.hasErrors()) {
            respond postInstance.errors, view:'create'
            return
        }

        postInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'post.label', default: 'Post'), postInstance.id])
                redirect postInstance
            }
            '*' { respond postInstance, [status: CREATED] }
        }
    }

    def edit(Post postInstance) {
        respond postInstance
    }

    @Transactional
    def update(Post postInstance) {
        if (postInstance == null) {
            notFound()
            return
        }

        if (postInstance.hasErrors()) {
            respond postInstance.errors, view:'edit'
            return
        }

        postInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Post.label', default: 'Post'), postInstance.id])
                redirect postInstance
            }
            '*'{ respond postInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Post postInstance) {

        if (postInstance == null) {
            notFound()
            return
        }

        postInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Post.label', default: 'Post'), postInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }
    def share(){
        render ("La funcionalidad no se ha implementado aun")
    }

    def rate(){
        long theId = params.actualPost

        Post thePost = Post.get(theId)

        thePost.rate += 1

        if(post == null) {
            render('WARNING: Post nulo')
            return
        }

        if(post.validate()){
            thePost.save flush: true
            redirect action: "show", postInstance: thePost
        }
        else {
            log.error("Error rateando el post")
            render("Error rateando el post")
        }
    }

    def comment(){
        long theId = params.actualPost

        Post thePost = Post.get(theId)

        if(thePost == null) {
            render('WARNING: Post nulo')
            return
        }
        theComment = params.content.commentContent
        thePost.comments.add(theComment)

        if(thePost.validate()){
            thePost.save flush: true
            redirect action: "show", postInstance: thePost
        }
        else {
            log.error("Error agregando comentario")
            render("Error agregando comentario")
        }


    }
    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'post.label', default: 'Post'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
