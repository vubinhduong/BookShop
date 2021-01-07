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
	<script type="text/javascript">
		function addBook() {
			var x = document.getElementById("image").value;
			alert('OK');
			alert(x);
		}
	</script>
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
								<form action="">
									<div style="width: 100%; height: 50px;">
										<span style="float: left"> <h5>Mã sách:</h5> </span>
										<span style="float: left; padding-left: 20px;"> <input name="bookId" style="width: 100px;" type="text" > </span>
										
										<span style="float: left;  padding-left: 50px;"> <h5>Tên sách:</h5> </span>
										<span style="padding-left: 20px;"> <input name="bookName" style="width: 363px;" type="text" > </span>
									</div>
									<div style="width: 100%; height: 50px;">
										<span style="float: left"> <h5>Số trang:</h5> </span>
										<span style="float: left; padding-left: 20px;"> <input name="pages" style="width: 100px;" type="text" > </span>
										
										<span style="float: left; padding-left: 50px;"> <h5>NXB:</h5> </span>
										<span style="float: left; padding-left: 20px;"> <input name="NXB" style="width: 398px;" type="text" > </span>

									</div>
									<div style="width: 100%; height: 50px;">
										
										<span style="float: left"> <h5>Năm xuất bản:</h5> </span>
										<span style="float: left; padding-left: 20px;"> <input name="nam" style="width: 100px;" type="text" > </span>
										
										<span style="float: left;  padding-left: 50px;"> <h5>Giá:</h5> </span>
										<span style="float:left; padding-left: 20px;"> <input name="price" style="width: 100px;" type="text" > </span>
										
										<span style="float: left;  padding-left: 50px;"> <h5>Giảm Giá:</h5> </span>
										<span style="padding-left: 20px;"> <input name="discount" style="width: 100px;" type="text" > </span>
									</div>
									
									<div style="width: 100%; height: 50px;">
										<span style="float: left;"> <h5>Ảnh:</h5> </span>
										<span style="float: left; padding-left: 20px;"> <input id="image" name="image" style="width: 317px;" type="file" > </span>
									</div>
									
									<div style="width: 100%; height: 50px;">
										<span style="float: left"> <h5>Nội dung:</h5> </span>
										<span style="float: left; padding-left: 20px;"> <input name="content" style="width: 605px;" type="text" > </span>
									</div>
									
										<span style="float: left; padding-left: 20px;"> <input onclick="addBook()" name="submit" style="width: 605px;" type="submit" > </span>
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
