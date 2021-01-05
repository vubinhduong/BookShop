<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<head>
</head>
<body>
	<div class="header">
		<div class="headertop_desc">
			<div class="call">
				<p>
					<span>Cần trợ giúp?</span> Hãy gọi chúng tôi: <span class="number">0396251874</span></span>
				</p>
			</div>
			<c:if test="${sessionScope.logged==null}">
				<div class="account_desc">
					<ul>
						<li><a href="#">Đăng kí</a></li>
						<li><a href="login">Đăng nhập</a></li>
					</ul>
				</div>
			</c:if> 
			<c:if test="${sessionScope.logged!=null}">
				<div class="account_desc">
				<ul>
					<li><a href="" style="font-weight: bold; color: #000; font-family: serif; font-size: 16px">${sessionScope.logged.username}</a></li>
					<li><a href="logout" style="color: #000; font-family: serif;">Đăng xuất</a></li>
				</ul>
			</div>
			</c:if>
			<div class="clear"></div>
		</div>
		<div class="header_top" style="padding: 0px">
			<div class="logo">
				<a href="/BookShop/homePage"><img src="${pageContext.request.contextPath}/resources/user/images/logo.png" alt="" /></a>
			</div>
			<div class="cart">
				<p>
					<span><a href="/BookShop/cart">Cart:</a></span>
				<div id="dd" class="wrapper-dropdown-2">
					0 item(s) - $0.00
					<ul class="dropdown">
						<li>you have no items in your Shopping cart</li>
					</ul>
				</div>
				</p>
			</div>
			<script type="text/javascript">
				function DropDown(el) {
					this.dd = el;
					this.initEvents();
				}
				DropDown.prototype = {
					initEvents : function() {
						var obj = this;

						obj.dd.on('click', function(event) {
							$(this).toggleClass('active');
							event.stopPropagation();
						});
					}
				}

				$(function() {

					var dd = new DropDown($('#dd'));

					$(document).click(function() {
						// all dropdowns
						$('.wrapper-dropdown-2').removeClass('active');
					});

				});
			</script>
			<div class="clear"></div>
		</div>
		<!---728x90--->

		<div class="header_bottom">
			<div class="menu">
				<ul>
					<li class="active"><a href="${contextPath}/BookShop/homePage">Trang chủ</a></li>
					<li><a href="${contextPath}/BookShop/news">Đang giảm giá</a></li>
					<li><a href="${contextPath}/BookShop/delivery">Tất cả sách</a></li>
					<li><a href="${contextPath}/BookShop/about">Giới thiệu</a></li>
					<li><a href="${contextPath}/BookShop/contact">Liên lạc</a></li>
					<div class="clear"></div>
				</ul>
			</div>
			<div class="search_box">
				<form action="/BookShop/searchByName" method="get">
					<input name="bookName" type="text" value="Tìm kiếm" onfocus="this.value = '';"
						onblur="if (this.value == '') {this.value = 'Search';}"><input
						type="submit" value="">
				</form>
			</div>
			<div class="clear"></div>
		</div>
</body>
