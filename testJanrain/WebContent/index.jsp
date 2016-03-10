<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Static RPX login test page</title>
<!-- This <script> tag is normally copied and pasted from the
      "Get the Code" tab, under the menu path Deployment -> Sign-in for Web -->
<script type="text/javascript">
	(function() {
		if (typeof window.janrain !== 'object')
			window.janrain = {};
		if (typeof window.janrain.settings !== 'object')
			window.janrain.settings = {};

		janrain.settings.tokenUrl = 'http://localhost:8080/testJanrain/index.jsp';

		function isReady() {
			janrain.ready = true;
		}
		;
		if (document.addEventListener) {
			document.addEventListener("DOMContentLoaded", isReady, false);
		} else {
			window.attachEvent('onload', isReady);
		}

		var e = document.createElement('script');
		e.type = 'text/javascript';
		e.id = 'janrainAuthWidget';

		if (document.location.protocol === 'https:') {
			e.src = 'https://rpxnow.com/js/lib/stashr/engage.js';
		} else {
			e.src = 'http://widget-cdn.rpxnow.com/js/lib/stashr/engage.js';
		}

		var s = document.getElementsByTagName('script')[0];
		s.parentNode.insertBefore(e, s);
	})();
</script>
</head>
<body>
	<!-- If you're instead using the modal auth dialog, this would be:
      <a class="janrainEngage" href="#">Sign-In</a> -->
	<div id="janrainEngageEmbed"></div>
	<% out.print(request.getParameter("token")); %>

</body>
</html>