<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>

<!-- Mirrored from p.w3layouts.com/demos/home_shoppe/web/preview.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 26 Dec 2020 08:53:39 GMT -->
<!-- Added by HTTrack -->
<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<!-- /Added by HTTrack -->
<head>
<title>Free Home Shoppe Website Template | Preview :: w3layouts</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/user/css/style.css"/>" media="all" />
<script type="text/javascript"
	src="<c:url value="/resources/user/js/jquery-1.7.2.min.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/resources/user/js/move-top.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/resources/user/js/easing.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/resources/user/js/easyResponsiveTabs.js"/>"></script>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/user/css/easy-responsive-tabs.css"/>"
	media="all" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/user/css/global.css"/>" media="all" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/user/css/custom.css"/>" media="all" />
<script type="text/javascript"
	src="<c:url value="/resources/user/js/slides.min.jquery.js"/>"></script>
<script>
	$(function() {
		$('#products').slides({
			preload : true,
			preloadImage : 'img/loading.gif',
			effect : 'slide, fade',
			crossfade : true,
			slideSpeed : 350,
			fadeSpeed : 500,
			generateNextPrev : true,
			generatePagination : false
		});
	});
</script>
</head>
<body style="background-color: #c1bdba;">
	<script
		src='../../../../ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js'></script>
	<script src="../../../../m.servedby-buysellads.com/monetization.js"
		type="text/javascript"></script>
	<script>
		(function() {
			if (typeof _bsa !== 'undefined' && _bsa) {
				// format, zoneKey, segment:value, options
				_bsa.init('flexbar', 'CKYI627U', 'placement:w3layoutscom');
			}
		})();
	</script>
	<script type="text/javascript">
		function themsach() {
			alert("Thêm sách thành công!");
		}
	</script>
	<script>
		(function() {
			if (typeof _bsa !== 'undefined' && _bsa) {
				// format, zoneKey, segment:value, options
				_bsa.init('fancybar', 'CKYDL2JN', 'placement:demo');
			}
		})();
	</script>
	
	<script>
		(function() {
			if (typeof _bsa !== 'undefined' && _bsa) {
				// format, zoneKey, segment:value, options
				_bsa.init('stickybox', 'CKYI653J', 'placement:w3layoutscom');
			}
		})();
	</script>
	<!--<script>(function(v,d,o,ai){ai=d.createElement("script");ai.defer=true;ai.async=true;ai.src=v.location.protocol+o;d.head.appendChild(ai);})(window, document, "//a.vdo.ai/core/w3layouts_V2/vdo.ai.js?vdo=34");</script>-->
	<div id="codefund">
		<!-- fallback content -->
	</div>
	<script src="https://ethicalads.io/?ref=codefund" async="async"></script>

	<!-- Global site tag (gtag.js) - Google Analytics -->
	<script async
		src='https://www.googletagmanager.com/gtag/js?id=UA-149859901-1'></script>
	<script>
		window.dataLayer = window.dataLayer || [];
		function gtag() {
			dataLayer.push(arguments);
		}
		gtag('js', new Date());

		gtag('config', 'UA-149859901-1');
	</script>

	<script>
		window.ga = window.ga || function() {
			(ga.q = ga.q || []).push(arguments)
		};
		ga.l = +new Date;
		ga('create', 'UA-149859901-1', 'demo.w3layouts.com');
		ga('require', 'eventTracker');
		ga('require', 'outboundLinkTracker');
		ga('require', 'urlChangeTracker');
		ga('send', 'pageview');
	</script>
	
	<c:if test="${sessionScope.logged==null}">
		<script type="text/javascript">
			function rate() {
				alert('Vui lòng đăng nhập trước!');
			};
		</script>
	</c:if>
	<c:if test="${sessionScope.logged!=null}">
		<script type="text/javascript">
			function rate() {
				alert('Cảm ơn đã góp ý!');
			};
		</script>
	</c:if>

	<script async src='../../../js/autotrack.js'></script>

	<meta name="robots" content="noindex">
<body>
	<link rel="stylesheet" href="../../../images/demobar_w3_4thDec2019.css">

	<div class="wrap">
		<jsp:include page="header.jsp"></jsp:include>
		<div class="main">
			<div class="content">
				<!---728x90--->

				<div class="content_top">
					<div class="back-links" style="width: 100%">
						<p style="font-size: 16px">
							<span><a style="font-size: 16px" href="homePage">Home</a></span>
							> <span><a style="font-size: 16px" href="#">Tiểu
									thuyết</a></span>
						</p>
					</div>
					<div class="clear"></div>
				</div>
				<div class="section group">
					<div class="product-details">
						<div class="grid images_3_of_2">
							<div id="container">
								<div id="products_example">
									<div id="products" style="width: 90%; background-color: #eee;">
										<img src="<c:url value="${bookSelected.image}"/>"
											alt="learn more" />
									</div>
								</div>
							</div>
						</div>
						<div class="desc span_3_of_2b">

							<h2 style="color: red">${bookSelected.name}</h2>
							<span>
								<div class="grid images_3_of_2b">
									<p>
									<h3>Nhà xuất bản: ${bookSelected.publisher}</h3>
									</p>
									<br>
									<p>
									<h3>Năm xuất bản: 2018</h3>
									</p>
								</div>
							</span> <span>
								<div class="grid images_3_of_2b">
									<p>
									<h3>Tác giả: ${bookSelected.author.get(0)}</h3>
									</p>
									<br>
									<p>
									<h3>Số trang: ${bookSelected.pages}</h3>
									</p>
								</div>
							</span> <br> <br> <br>
							<div class="price">
							<c:if test="${bookSelected.discount==0}">
								<p>
									<span>Giá:
										${bookSelected.price*(100-bookSelected.discount)/100} đ</span> 
								</p>
							</c:if>
							<c:if test="${bookSelected.discount!=0}">
								<p>
									<span>Giá:
										${bookSelected.price*(100-bookSelected.discount)/100} đ</span> <span
										style="font-size: 2em; color: #666; text-decoration: line-through; padding-left: 10px;">${bookSelected.price}đ</span>
								</p>
							</c:if>
								
							</div>
							<div class="available" style="padding: 7px 0px"></div>
							<div class="share-desc">
								<form action="/BookShop/addCart" method="get">
									<input name="bookId" type="text"
										style="background: #fff; border: none; color: #fff; padding: 0; width: 0px"
										value="${bookSelected.book_id}"> <input name="number"
										type="number"
										style="font-size: 20px; padding: 10px 10px 10px 20px; width: 70px"
										value="1"> <input type="submit" onclick="themsach()"
										style="color: #fff; font-size: 20px; background: red; font-weight: bold; padding: 10px 10px 10px 10px;"
										class="buttoncustom" value="Thêm vào giỏ hàng"> <br>
									<div class="clear"></div>
								</form>
							</div>
							<div class="wish-list">
								<ul>
									<li class="wish"><a href="">Sản phẩm chất lượng cao</a></li>
									<li class="compare"><a href="">Đổi 1-1 nếu khách hàng
											không hài lòng</a></li>
								</ul>
							</div>
							<div>
								<br>
								<h3>Thể loại: Romance, Tuổi học trò, Truyện ngắn</h3>
								<br> <br>
								<div>
									<span><h3
											style="color: red; font-size: 20px; width: 140px; float: left;">Đánh
											giá: ${bookSelected.rate}/5</h3></span> <span><img
										style="float: left; width: 110px;"
										src="${pageContext.request.contextPath}/resources/user/images/value-rating.png"
										alt="" /></span> <span><h3
											style="font-size: 16px; width: 250px; float: left; padding-left: 5px; padding-top: 2px;">(${bookSelected.rateturn}
											lượt đánh giá)</h3></span>
								</div>
							</div>
						</div>
						<div class="clear"></div>
					</div>
					<div class="product_desc">
						<!---728x90--->

						<div id="horizontalTab">
							<ul class="resp-tabs-list">
								<li>Giới thiệu sản phẩm</li>
								<li>Đánh giá - Bình luận</li>

								<div class="clear"></div>
							</ul>
							<div class="resp-tabs-container">
								<div class="product-desc">
									<p>${bookSelected.intro}</p>
								</div>
								<div class="product-tags">
									<div class="review">
										<h4>Đánh giá sản phẩm</h4>
										<form action="/BookShop/rate" method="get">
											<input id="userRate" type="hidden" name="user" value="${sessionScope.logged.username}">
											<input name="bookId" type="text"
												style="background: #fff; border: none; color: #fff; padding: 0; width: 0px;"
												value="${bookSelected.book_id}"> 
												<input
												name="number" min="1" max="5" type="number"
												style="font-size: 20px; padding: 10px 10px 10px 20px; width: 70px;"
												value="1">
												 <input type="submit"
												style="color: #fff; font-size: 20px; background: red; font-weight: bold; padding: 10px 10px 10px 10px;"
												class="buttoncustom" value="Đánh giá" onclick="rate()"> <br>
											<div class="clear"></div>
										</form>
										<div class="your-review">
											<div class="wish-list">
												<form action="/BookShop/comment">
													<div>
														<input id="userComment" type="hidden" name="user" value="${sessionScope.logged.username}">
														<input name="bookId" type="text"
															style="background: #fff; border: none; color: #fff; padding: 0; width: 0px;"
															value="${bookSelected.book_id}"> <input
															name="username" type="text"
															style="background: #fff; border: none; color: #fff; padding: 0; width: 0px;"
															value="${sessionScope.logged.username}"> <span><label>Bình
																luận<span class="red">*</span>
														</label></span> <span><input name="comment" type="text" value=""></span>
													</div>
													<div>
														<span><input onclick="rate()" type="submit" value="Gửi bình luận"></span>
													</div>
												</form>
											</div>
										</div>
										<c:forEach var="item" items="${listComment}">
											<div>
												<p
													style="padding-bottom: 0px; padding-left: 15px; width: 200px; float: left; color: #000; font-weight: 600; font-size: 14.5px;">${item.username}<br>
												<p style="font-style: italic;">${item.date_cmt}</p>
												</p>
												<p
													style="margin-left: 215px; margin-top: -20px; color: #333; font-weight: 400; font-size: 14.5px; width: 700px;">${item.content}</p>
												<br>
											</div>
										</c:forEach>
									</div>
								</div>
							</div>
						</div>
					</div>
					<script type="text/javascript">
						$(document).ready(function() {
							$('#horizontalTab').easyResponsiveTabs({
								type : 'default', //Types: default, vertical, accordion           
								width : 'auto', //auto or any width like 600px
								fit : true
							// 100% fit in a container
							});
						});
					</script>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
	<script type="text/javascript">
		$(document).ready(function() {
			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
	</script>
	<a href="#" id="toTop"><span id="toTopHover"> </span></a>
</body>

<!-- Mirrored from p.w3layouts.com/demos/home_shoppe/web/preview.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 26 Dec 2020 08:53:44 GMT -->
</html>

