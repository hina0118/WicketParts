package org.wicketparts.combo.dojo;

import org.apache.wicket.markup.html.JavascriptPackageResource;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.wicketparts.TestPage;

/**
 * Created by IntelliJ IDEA.
 * User: chaame
 * Date: 11/11/03
 * Time: 22:50
 * To change this template use File | Settings | File Templates.
 */
public class DojoComboBoxPage extends WebPage {
	public DojoComboBoxPage() {
		add(JavascriptPackageResource.getHeaderContribution(DojoComboBoxPage.class, "dojo.js"));

		add(new Link<Void>("top"){
			@Override
			public void onClick() {
				setResponsePage(TestPage.class);
			}
		});
	}
}
