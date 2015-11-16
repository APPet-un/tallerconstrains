<%@ page import="domycons.Forum" %>



<div class="fieldcontain ${hasErrors(bean: forumInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="forum.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="20" required="" value="${forumInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: forumInstance, field: 'dateCreate', 'error')} required">
	<label for="dateCreate">
		<g:message code="forum.dateCreate.label" default="Date Create" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dateCreate" precision="day"  value="${forumInstance?.dateCreate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: forumInstance, field: 'category', 'error')} required">
	<label for="category">
		<g:message code="forum.category.label" default="Category" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="category" maxlength="15" required="" value="${forumInstance?.category}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: forumInstance, field: 'admin', 'error')} required">
	<label for="admin">
		<g:message code="forum.admin.label" default="Admin" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="admin" name="admin.id" from="${domycons.Admin.list()}" optionKey="id" required="" value="${forumInstance?.admin?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: forumInstance, field: 'posts', 'error')} ">
	<label for="posts">
		<g:message code="forum.posts.label" default="Posts" />
		
	</label>
	<g:select name="posts" from="${domycons.Post.list()}" multiple="multiple" optionKey="id" size="5" value="${forumInstance?.posts*.id}" class="many-to-many"/>

</div>

