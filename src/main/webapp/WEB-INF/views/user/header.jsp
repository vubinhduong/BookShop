<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
			<div class="account_desc">
				<ul>
					<li><a href="#">Đăng kí</a></li>
					<li><a href="#">Đăng nhập</a></li>
				</ul>
			</div>
			<div class="clear"></div>
		</div>
		<div class="header_top">
			<div class="logo">
				<a href="index.html"><img src="${pageContext.request.contextPath}/resources/user/images/logo.png" alt="" /></a>
			</div>
			<div class="cart">
				<p>
					<span>Cart:</span>
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
					<li class="active"><a href="homepage.jsp">Trang chủ</a></li>
					<li><a href="about.html">Đang giảm giá</a></li>
					<li><a href="delivery.html">Tất cả sách</a></li>
					<li><a href="news.html">Sách đánh giá cao</a></li>
					<li><a href="contact.html">Giới thiệu</a></li>
					<div class="clear"></div>
				</ul>
			</div>
			<div class="search_box">
				<form>
					<input type="text" value="Search" onfocus="this.value = '';"
						onblur="if (this.value == '') {this.value = 'Search';}"><input
						type="submit" value="">
				</form>
			</div>
			<div class="clear"></div>
		</div>
</body>
