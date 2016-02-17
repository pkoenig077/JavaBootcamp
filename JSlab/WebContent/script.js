/**
 * 
 */
$(document).ready(
		function() {
			$(function() {
				$.get('https://www.reddit.com/r/aww.json', function(reddit) {
					for (var i = 0; i < reddit.data.children.length; i++) {

						console.log(reddit.data.children[i]);

						author = reddit.data.children[i].data.author;
						title = reddit.data.children[i].data.title;
						link = reddit.data.children[i].data.url;
						comments = reddit.data.children[i].data.permalink;
						thumbnail = reddit.data.children[i].data.thumbnail;
						$("section").append(
								"<div class='post container'>"
										+ "<a href='http://reddit.com"
										+ comments + "'>" + title + "</a><br>"
										+ "<a href=" + link + "><img src="
										+ thumbnail + "></a><br>" + author
										+ "<br><br></div>");
					}
				});

			});

		})