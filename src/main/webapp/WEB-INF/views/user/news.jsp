<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>

<!-- Mirrored from p.w3layouts.com/demos/home_shoppe/web/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 26 Dec 2020 08:53:19 GMT -->
<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<head>
<title>Nhà sách</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/user/css/style.css"/>" media="all" />
<link href="<c:url value="/resources/user/css/slider.css"/>" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="<c:url value="/resources/user/js/jquery-1.7.2.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/user/js/move-top.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/user/js/easing.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/user/js/startstop-slider.js"/>"></script>

</head>
<body>
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
	<script async src='../../../js/autotrack.js'></script>

	<meta name="robots" content="noindex">
<body style="background-color: #c1bdba;">
	
	<div class="wrap" style="padding: 0px 20px; background-color: #fff;">
		<jsp:include page="header.jsp"></jsp:include>
			<div class="header_slide">
				<br>
				<br>
				<br>
				<%for(int i = 0; i < 100; i+=4) { %> 
					<div class="section group">
					<c:forEach var="item" items="${saleProduct}" begin="<%= i %>" end="<%= i+3 %>">
					<div class="grid_1_of_4 images_1_of_4">
						<a href="/BookShop/preview.htm?bookId=${item.book_id}"><img src="<c:url value="${item.image}"/>"
							alt="" /></a>
						<h2>${item.name}</h2>
						<div class="price-details">
							<div class="price-number">
								<c:if test="${item.discount==0}">
								<p>
									<span style="font-size: 2em; color: red;" class="rupees">${item.price}đ</span>
								</p>
							</c:if>	
							<c:if test="${item.discount>0}">
								<p style="width: 250px;">
									<span class="rupees" style="float: left; color: red; font-size: 2em;">${item.price*(100-item.discount)/100}đ</span>
									<span class="rupees"><h4 style="float: left; text-decoration: line-through; margin-top: 3.5px; margin-left: 5px">${item.price}đ</h4></span>
									<span class="rupees"><h4 style="float: right; margin-top: -4px; color: red; font-size: 1.5em;">-${item.discount}%</h4></span>
								</p>
							</c:if>
							</div>

							<div class="clear"></div>
						</div>
					</div>
				</c:forEach>	
				</div>
				<%}%>
				</div>
				<div class="clear"></div>
			</div>
		<div class="main">
			<!---728x90--->

			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			
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

<!-- Mirrored from p.w3layouts.com/demos/home_shoppe/web/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 26 Dec 2020 08:53:33 GMT -->
</html>

