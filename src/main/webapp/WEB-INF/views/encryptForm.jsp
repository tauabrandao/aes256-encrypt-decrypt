<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html>
<head>
<title>AES 256 Encrypt & Decrypt</title>
<meta charset="utf-8">
<jsp:include page="usualHTML/bootstrap-import.jsp"></jsp:include>

<script type="text/javascript">
	function copyToClipboard (){
			var copyText = document.getElementById("encryptedText");
			copyText.disabled = false;
			copyText.select();
			document.execCommand("copy");
			copyText.disabled = true;
			document.getElementById("feedbackMsg").innerHTML = "Copied!";
		}


</script>

</head>
<body>
	<jsp:include page="usualHTML/navbar.jsp"></jsp:include>


	<div style="margin-top: 50px" class="container">
		<div class="row">
			<div class="col-md-12">

				<p>
					<button class="btn btn-secondary" type="button"
						data-toggle="collapse" data-target="#instructions"
						aria-expanded="false" aria-controls="instructions">How to
						use...</button>
				</p>
				<div class="collapse" id="instructions">


					<div class="alert alert-info" role="alert">

						<p>Both to encrypt and to decrypt, it is necessary to pass 2
							keys in the fields Key A and Key B, from these keys, the
							application can encrypt or decrypt a text.</p>

						<p>
							<strong>Note:</strong> The same keys that are used to encrypt,
							must be used to decrypt, otherwise it will not be possible to
							decrypt the text.
						</p>

					</div>
				</div>

				<div class="jumbotron">

					<h5>Parameters</h5>
					<hr>

					<form:form action="${s:mvcUrl('CC#encryptText').build() }"
						method="POST">
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="keyA">Key A</label> <input type="text"
									class="form-control" id="keyA" name="keyA" value="${text.keyA}">
							</div>
							<div class="form-group col-md-6">
								<label for="keyB">Key B</label> <input type="text"
									class="form-control" id="keyB" name="keyB"
									value="${text.keyB }">
							</div>
							<div class="form-group col-md-12">
								<label for="decriptedText">Text to encrypt </label>
								<textarea class="form-control" id="decriptedText"
									name="decriptedText" rows="3">${text.decriptedText }</textarea>
							</div>
						</div>

						<button type="submit" class="btn btn-primary">Encrypt</button>
					</form:form>

				</div>

				<c:if test="${text.encryptedText != null }">
					<div class="alert alert-warning" role="alert">
						<p>
							<strong>Your encrypted text:</strong>
						</p>
						<p>
							<textarea disabled class="form-control" id="encryptedText"
								name="encryptedText" rows="3">${text.encryptedText }</textarea>
						</p>
						<button onclick="copyToClipboard()" type="submit" class="btn btn-warning">Copy</button>
						<span id="feedbackMsg"></span>
					</div>
				</c:if>

			</div>
		</div>
	</div>


	<jsp:include page="usualHTML/bootstrapFooter-import.jsp"></jsp:include>


</body>


</html>
