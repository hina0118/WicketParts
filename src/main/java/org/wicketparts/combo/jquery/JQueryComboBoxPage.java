package org.wicketparts.combo.jquery;

import org.apache.wicket.markup.html.JavascriptPackageResource;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.wicketparts.TestPage;

/**
 * Created by IntelliJ IDEA.
 * User: chaame
 * Date: 11/11/03
 * Time: 22:53
 * To change this template use File | Settings | File Templates.
 */
public class JQueryComboBoxPage extends WebPage {
	public JQueryComboBoxPage() {
		add(JavascriptPackageResource.getHeaderContribution(JQueryComboBoxPage.class, "jquery.min.js"));
		add(JavascriptPackageResource.getHeaderContribution(JQueryComboBoxPage.class, "comboEditable.min.js"));

		add(new Link<Void>("top"){
			@Override
			public void onClick() {
				setResponsePage(TestPage.class);
			}
		});
	}
}
