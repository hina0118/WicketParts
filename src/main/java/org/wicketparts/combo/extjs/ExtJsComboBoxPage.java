package org.wicketparts.combo.extjs;

import org.apache.wicket.markup.html.JavascriptPackageResource;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.wicketparts.TestPage;

/**
 * Created by IntelliJ IDEA.
 * User: chaame
 * Date: 11/11/03
 * Time: 22:52
 * To change this template use File | Settings | File Templates.
 */
public class ExtJsComboBoxPage extends WebPage {
	public ExtJsComboBoxPage() {
		add(JavascriptPackageResource.getHeaderContribution(ExtJsComboBoxPage.class, "combos.js"));

		add(new Link<Void>("top"){
			@Override
			public void onClick() {
				setResponsePage(TestPage.class);
			}
		});
	}
}
