<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body class="sb-nav-fixed">
	<div id="layoutSidenav_nav">
		<nav class="sb-sidenav accordion sb-sidenav-dark"
			id="sidenavAccordion">
			<div class="sb-sidenav-menu">
				<div class="nav">
					<div class="sb-sidenav-menu-heading">Main</div>
					<a class="nav-link" href="/BookShop/adminPage">
						<div class="sb-nav-link-icon">
							<i class="fas fa-tachometer-alt"></i>
						</div> Trang chủ
					</a>
					<div class="sb-sidenav-menu-heading">Thống kê</div>
					<a class="nav-link" href="/BookShop/dataBook">
						<div class="sb-nav-link-icon">
							<i class="fas fa-book-open"></i>
						</div> Sách
					</a>
					<a class="nav-link" href="/BookShop/dataBill">
						<div class="sb-nav-link-icon">
							<i class="fas fa-table"></i>
						</div> Đơn hàng
					</a> 
					<div class="sb-sidenav-menu-heading">CRUD</div>
					<a class="nav-link collapsed" href="#" data-toggle="collapse"
						data-target="#collapseLayouts" aria-expanded="false"
						aria-controls="collapseLayouts">
						<div class="sb-nav-link-icon">
							<i class="fas fa-book-open"></i>
						</div> Sách
						<div class="sb-sidenav-collapse-arrow">
							<i class="fas fa-angle-down"></i>
						</div>
					</a>
					<div class="collapse" id="collapseLayouts"
						aria-labelledby="headingOne" data-parent="#sidenavAccordion">
						<nav class="sb-sidenav-menu-nested nav">
							<a class="nav-link" href="/BookShop/addBook">Thêm sách</a> <a class="nav-link" href="layout-sidenav-light.html">Sửa sách</a>
						</nav>
					</div>
					<a class="nav-link collapsed" href="#" data-toggle="collapse"
						data-target="#collapsePages" aria-expanded="false"
						aria-controls="collapsePages">
						<div class="sb-nav-link-icon">
							<i class="fas fa-table"></i>
						</div> Đơn hàng
						<div class="sb-sidenav-collapse-arrow">
							<i class="fas fa-angle-down"></i>
						</div>
					</a>
					<div class="collapse" id="collapsePages"
						aria-labelledby="headingTwo" data-parent="#sidenavAccordion">
						<nav class="sb-sidenav-menu-nested nav accordion"
							id="sidenavAccordionPages">
							<a class="nav-link collapsed" href="#" data-toggle="collapse"
								data-target="#pagesCollapseAuth" aria-expanded="false"
								aria-controls="pagesCollapseAuth"> Authentication
								<div class="sb-sidenav-collapse-arrow">
									<i class="fas fa-angle-down"></i>
								</div>
							</a>
							<div class="collapse" id="pagesCollapseAuth"
								aria-labelledby="headingOne"
								data-parent="#sidenavAccordionPages">
								<nav class="sb-sidenav-menu-nested nav">
									<a class="nav-link" href="login.html">Login</a> <a
										class="nav-link" href="register.html">Register</a> <a
										class="nav-link" href="password.html">Forgot Password</a>
								</nav>
							</div>
							<a class="nav-link collapsed" href="#" data-toggle="collapse"
								data-target="#pagesCollapseError" aria-expanded="false"
								aria-controls="pagesCollapseError"> Error
								<div class="sb-sidenav-collapse-arrow">
									<i class="fas fa-angle-down"></i>
								</div>
							</a>
							<div class="collapse" id="pagesCollapseError"
								aria-labelledby="headingOne"
								data-parent="#sidenavAccordionPages">
								<nav class="sb-sidenav-menu-nested nav">
									<a class="nav-link" href="401.html">401 Page</a> <a
										class="nav-link" href="404.html">404 Page</a> <a
										class="nav-link" href="500.html">500 Page</a>
								</nav>
							</div>
						</nav>
					</div>
					
				</div>
			</div>
			<div class="sb-sidenav-footer">
				<div class="small">Logged in as:</div>
				${sessionScope.logged.username}
			</div>
		</nav>
	</div>
</body>
</html>

