<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
<div class="container">
	<div>
		<h1>Your Todos</h1>
		<table class="table">
			<thead>
				<tr>
					<th>id</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
					<th>Delete</th>
					<th>Update</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todoL">
					<tr>
						<td>${todoL.description}</td>
						<td>${todoL.date}</td>
						<td>${todoL.done}</td>
						<td><a href="delete-todo?userId=${todoL.userId}"
							class="btn btn-warning">DELETE</a></td>
						<td><a href="update-todo?userId=${todoL.userId}"
							class="btn btn-success">UPDATE</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="add-todo" class="btn btn-success">Add Todo</a>
	</div>
</div>
<%@include file="common/footer.jspf"%>
