<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html>
<head>

<c:url value="/" var="contextPath" />
<title>AES 256 Encrypt & Decrypt</title>
<meta charset="utf-8">
<jsp:include page="usualHTML/bootstrap-import.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="usualHTML/navbar.jsp"></jsp:include>


	<div style="margin-top: 50px" class="container">
		<div class="row">

			<div class="col-md-12">
				<div class="text-center">
					<h1>AES256Project API</h1>

					<p>You can send POST requests in order to encrypt and decrypt texts!</p>
					<hr>
				</div>
				<h2>Parameters</h2>

				<div class="row">
					<div class="col-4">
						<div class="list-group" id="list-tab" role="tablist">
							<a class="list-group-item list-group-item-action active"
								id="list-home-list" data-toggle="list" href="#list-home"
								role="tab" aria-controls="home">keyA</a> <a
								class="list-group-item list-group-item-action"
								id="list-profile-list" data-toggle="list" href="#list-profile"
								role="tab" aria-controls="profile">keyB</a> <a
								class="list-group-item list-group-item-action"
								id="list-messages-list" data-toggle="list" href="#list-messages"
								role="tab" aria-controls="messages">text</a> <a
								class="list-group-item list-group-item-action"
								id="list-settings-list" data-toggle="list" href="#list-settings"
								role="tab" aria-controls="settings">operation</a>
						</div>
					</div>
					<div class="col-7">
						<div class="tab-content" id="nav-tabContent">
							<div class="tab-pane fade show active" id="list-home"
								role="tabpanel" aria-labelledby="list-home-list">

								<div class="row">
									<div class="col-sm-6">It is the first part of the key
										pair needed to perform an Encrypt or Decrypt operation, you
										can always choose a key of your choice.</div>
									<div class="col-sm-6">
										<img style="border-radius: 5px" class="img-fluid" alt=""
											src="${contextPath }resources/imgs/keya.png">
									</div>
								</div>

							</div>
							<div class="tab-pane fade" id="list-profile" role="tabpanel"
								aria-labelledby="list-profile-list">

								<div class="row">
									<div class="col-sm-6">It is the second part of the key
										pair needed to perform the operations, you can always choose a
										key of your preference (both are mandatory).</div>
									<div class="col-sm-6">
										<img style="border-radius: 5px" class="img-fluid" alt=""
											src="${contextPath }resources/imgs/keyb.png">
									</div>
								</div>



							</div>
							<div class="tab-pane fade" id="list-messages" role="tabpanel"
								aria-labelledby="list-messages-list">

								<div class="row">
									<div class="col-sm-6">It is the text that will be processed, whether to encrypt or decrypt.</div>
									<div class="col-sm-6">
										<img style="border-radius: 5px" class="img-fluid" alt=""
											src="${contextPath }resources/imgs/text.png">
									</div>
								</div>



							</div>
							<div class="tab-pane fade" id="list-settings" role="tabpanel"
								aria-labelledby="list-settings-list">

								<div class="row">
									<div class="col-sm-6">
										This is the operation that will be performed. Submit <span
											style="color: red">1</span> to encrypt and <span
											style="color: red">0</span> to decrypt.
									</div>
									<div class="col-sm-6">
										<img style="border-radius: 5px" class="img-fluid" alt=""
											src="${contextPath }resources/imgs/operation.png">
									</div>
								</div>


							</div>
						</div>
					</div>
				</div>
				<br>
				<div class="row">
					<div class="col-md-12">
						<p>
							<span style="color: blue">Query:</span>
							http://aes256project.herokuapp.com/api/crypto
						</p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<p>
							<span style="color: blue">Headers:</span> Content-Type ->
							application/json
						</p>
					</div>
				</div>

			</div>
		</div>
		<hr>
		<h2>Examples</h2>
		<br>
		<div class="row">
			<div class="col-md-12">


				<h3>Encrypt</h3>
				<img style="border-radius: 10px" class="img-fluid" alt=""
					src="${contextPath }resources/imgs/encryptop.png">

			</div>

		</div>
		<br>
		<div class="row">
			<div class="col-md-12">


				<h3>Decrypt</h3>
				<img style="border-radius: 10px" class="img-fluid" alt=""
					src="${contextPath }resources/imgs/decryptop.png">

			</div>

		</div>

	</div>

</body>
</html>
