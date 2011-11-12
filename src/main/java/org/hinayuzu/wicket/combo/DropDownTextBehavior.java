package org.hinayuzu.wicket.combo;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.behavior.AbstractBehavior;
import org.apache.wicket.markup.html.IHeaderContributor;
import org.apache.wicket.markup.html.IHeaderResponse;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: chaame
 * Date: 11/11/08
 * Time: 20:31
 * To change this template use File | Settings | File Templates.
 */
public class DropDownTextBehavior<T> extends AbstractBehavior implements IHeaderContributor {
	private String id;
	private List<T> choices;

	public DropDownTextBehavior(String id, List<T> choices) {
		this.id = id;
		this.choices = choices;
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		StringBuilder script = new StringBuilder();
		script.append("$(function() {");
		script.append("$('#" + id + "').toComboBox({");
		script.append("data: [");
		for (T data : choices) {
			script.append("{\"value\": \"" + data.toString() + "\"},");
		}
		script.deleteCharAt(script.length() - 1);
		script.append("]});");
		script.append("});");

		response.renderCSSReference(
				new ResourceReference(DropDownTextBehavior.class, "jquery.dropDownText.css"));
		response.renderJavascriptReference("http://code.jquery.com/jquery-1.7.min.js");
		response.renderJavascriptReference(
				new ResourceReference(DropDownTextBehavior.class, "jquery.dropDownText.js"));
		response.renderJavascript(script, id + "Script");
	}
}
