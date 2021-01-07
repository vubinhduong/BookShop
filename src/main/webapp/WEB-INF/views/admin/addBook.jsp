<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Charts - SB Admin</title>
<link href="<c:url value="/resources/admin/css/styles.css"/>"
	rel="stylesheet" type="text/css" media="all" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js"
	crossorigin="anonymous"></script>
	<style type="text/css">
		
	</style>
</head>
<body class="sb-nav-fixed">
	<jsp:include page="topnav.jsp"></jsp:include>
	<div id="layoutSidenav">
		<jsp:include page="leftnav.jsp"></jsp:include>
		<div id="layoutSidenav_content">
			<main>
				<div class="container-fluid">
					<h1 class="mt-4">Thêm sách</h1>
					<ol class="breadcrumb mb-4">
						<li class="breadcrumb-item"><a href="/BookShop/adminPage">Dashboard</a></li>
						<li class="breadcrumb-item active">Thêm sách</li>
					</ol>
					<div class="card mb-4">
						<div class="card-body">


							<div class="form" style="">
								<form>
									<div>
										<span style="float: left;"> <h5>Mã sách:</h5> </span>
										<span> <input style="padding-left: 5%" type="text" > </span>
									</div>
									<div>
										<span style="float: left;"> <h5>Mã sách:</h5> </span>
										<span> <input style="padding-left: 5%" type="text" > </span>
									</div>
									<div>
										<span style="float: left;"> <h5>Mã sách:</h5> </span>
										<span> <input style="padding-left: 5%" type="text" > </span>
									</div>
									<div>
										<span style="float: left;"> <h5>Mã sách:</h5> </span>
										<span> <input style="padding-left: 5%" type="text" > </span>
									</div>
									<div>
										<span style="float: left;"> <h5>Mã sách:</h5> </span>
										<span> <input style="padding-left: 5%" type="text" > </span>
									</div>
									<div>
										<span style="float: left;"> <h5>Mã sách:</h5> </span>
										<span> <input style="padding-left: 5%" type="text" > </span>
									</div>
									<div>
										<span style="float: left;"> <h5>Mã sách:</h5> </span>
										<span> <input style="padding-left: 5%" type="text" > </span>
									</div>
								</form>
							</div>




						</div>
					</div>
				</div>
			</main>
			<footer class="py-4 bg-light mt-auto">
				<div class="container-fluid">
					<div
						class="d-flex align-items-center justify-content-between small">
						<div class="text-muted">Copyright &copy; Your Website 2020</div>
						<div>
							<a href="#">Privacy Policy</a> &middot; <a href="#">Terms
								&amp; Conditions</a>
						</div>
					</div>
				</div>
			</footer>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		crossorigin="anonymous"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/admin/js/scripts.js"/>"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"
		crossorigin="anonymous"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/admin/assets/demo/chart-area-demo.js"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/admin/assets/demo/chart-bar-demo.js"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/admin/assets/demo/chart-pie-demo.js"/>"></script>
</body>
</html>
