<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Font Awesome -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.10.2/mdb.min.css"
	rel="stylesheet">
<style type="text/css">
.divider:after, .divider:before {
	content: "";
	flex: 1;
	height: 1px;
	background: #eee;
}

.h-custom {
	height: calc(100% - 73px);
}

@media ( max-width : 450px) {
	.h-custom {
		height: 100%;
	}
}
</style>
</head>
<body>
	<section class="vh-100">
		<div class="container-fluid h-custom">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-md-9 col-lg-6 col-xl-5">
					<img
						src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
						class="img-fluid" alt="Sample image">
				</div>
				<div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
					<form action="loginuser" method="post">
						<div
							class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start">
							<p class="lead fw-normal mb-0 me-3">Sign in with</p>
							<button type="button" data-mdb-button-init data-mdb-ripple-init
								class="btn btn-primary btn-floating mx-1">
								<i class="fab fa-facebook-f"></i>
							</button>

							<button type="button" data-mdb-button-init data-mdb-ripple-init
								class="btn btn-primary btn-floating mx-1">
								<i class="fab fa-twitter"></i>
							</button>

							<button type="button" data-mdb-button-init data-mdb-ripple-init
								class="btn btn-primary btn-floating mx-1">
								<i class="fab fa-linkedin-in"></i>
							</button>
						</div>

						<div class="divider d-flex align-items-center my-4">
							<p class="text-center fw-bold mx-3 mb-0">Or</p>
						</div>

						<!-- Full name input -->
						<div data-mdb-input-init class="form-outline mb-4">
							<input type="text" id="name" name="username"
								class="form-control form-control-lg"
								placeholder="Enter full name" /> <label
								class="form-label" for="name">Full Name</label>
						</div>
						
						<!-- Email input -->
						<div data-mdb-input-init class="form-outline mb-4">
							<input type="email" id="email" name="email"
								class="form-control form-control-lg"
								placeholder="Enter a valid email address" /> <label
								class="form-label" for="email">Email address</label>
						</div>

						<!-- Password input -->
						<div data-mdb-input-init class="form-outline mb-3">
							<input type="text" id="password" name="password"
								class="form-control form-control-lg"
								placeholder="Enter password" /> <label class="form-label"
								for="password">Password</label>
						</div>

						<div class="d-flex justify-content-between align-items-center">
							<!-- Check box -->
							<div class="form-check mb-0">
								<input class="form-check-input me-2" type="checkbox" value=""
									id="form2Example3" /> <label class="form-check-label"
									for="form2Example3"> Remember me </label>
							</div>
							<a href="#!" class="text-body">Forgot password?</a>
						</div>

						<div class="text-center text-lg-start mt-4 pt-2">
							<button type="submit" data-mdb-button-init data-mdb-ripple-init
								class="btn btn-primary btn-lg"
								style="padding-left: 2.5rem; padding-right: 2.5rem;">Login</button>
							<p class="small fw-bold mt-2 pt-1 mb-0">
								Don't have an account? <a href="#!" class="link-danger">Register</a>
							</p>
						</div>

					</form>
				</div>
			</div>
		</div>
		<div
			class="d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-primary">
			<!-- Copyright -->
			<div class="text-white mb-3 mb-md-0">Copyright © 2020. All
				rights reserved.</div>
			<!-- Copyright -->

			<!-- Right -->
			<div>
				<a href="#!" class="text-white me-4"> <i
					class="fab fa-facebook-f"></i>
				</a> <a href="#!" class="text-white me-4"> <i class="fab fa-twitter"></i>
				</a> <a href="#!" class="text-white me-4"> <i class="fab fa-google"></i>
				</a> <a href="#!" class="text-white"> <i class="fab fa-linkedin-in"></i>
				</a>
			</div>
			<!-- Right -->
		</div>
	</section>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.10.2/mdb.min.js"></script>

</body>
</html>