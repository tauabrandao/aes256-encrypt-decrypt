<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>





<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="collapse navbar-collapse justify-content-md-center">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="btn btn-warning" href="${s:mvcUrl('NC#encryptForm').build()}">Encrypt</a></li>
			&nbsp
			<li class="nav-item"><a class="btn btn-danger" href="${s:mvcUrl('HC#index').build()}">Home</a></li>
			&nbsp
			<li class="nav-item"><a class="btn btn-info" href="${s:mvcUrl('NC#decryptForm').build()}">Decrypt</a></li>
		</ul>
	</div>
</nav>
