(function(jQuery) {
	jQuery.fn.toComboBox = function(options) {
		var options = jQuery.extend({
			data: [{"value": "データを指定してください"}]
		}, options);
		var data = options.data;
		return this.each(function() {
			var text = jQuery(this);
			text.css("margin-right", "0px");
			var btn = $('<input type="button" class="dropDownTextBtn">');
			var area = $('<div class="dropDownTextSelect"></div>');
			btn.click(function() {
				area.toggle();
			});
			area.css({
				top: (text.position().top + text.outerHeight() + 1) + "px",
				left: (text.position().left + 2) + "px",
				width: (text.innerWidth() + 20  + 2) + "px"
			});
			var ul = $('<ul></ul>');
			for (var i in data) {
				ul.append('<li><a href="#">' + data[i].value + "</a></li>");
			}
			ul.find("a").click(function() {
				text.val($(this).html());
				area.css("display", "none");
				return false;
			});
			area.append(ul);
			text.after(btn);
			btn.after(area);
		});
	};
})(jQuery);