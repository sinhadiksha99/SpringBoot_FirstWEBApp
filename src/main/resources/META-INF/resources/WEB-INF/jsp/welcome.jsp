<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
<div class="container">
	<h1>Welcome ${name}</h1>
	<a href="list-todos">Manage</a> your todos
</div>
<%@include file="common/footer.jspf"%>



<!--
one thing we need to keep in mind that "welcome to your page!! diksha" only will be visible for welcome page suppose we click
manage your tools then in that page only "welcome to your page!!" will be visible becoz if we put something in model it will 
be only available for the scope of that request-->