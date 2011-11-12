package org.wicketparts.combo.jquery2;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;
import org.hinayuzu.wicket.combo.DropDownTextBehavior;
import org.hinayuzu.wicket.combo.DropDownTextField;
import org.wicketparts.TestPage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: chaame
 * Date: 11/11/08
 * Time: 20:17
 * To change this template use File | Settings | File Templates.
 */
public class TextComboBoxPage extends WebPage {
	private String inputValue;
	private String inputValue2;

	public TextComboBoxPage() {
		add(new Link<Void>("top"){
			@Override
			public void onClick() {
				setResponsePage(TestPage.class);
			}
		});

		IModel inputValueModel = new PropertyModel<String>(this, "inputValue");
		IModel inputValue2Model = new PropertyModel<String>(this, "inputValue2");

		TextField<String> combo = new TextField<String>("combo", inputValueModel);
		List<String> dataList = new ArrayList<String>();
		dataList.add("data1");
		dataList.add("データ2");
		dataList.add("でーた3");
		dataList.add("項目4");
		dataList.add("こうもく5");
		combo.add(new DropDownTextBehavior<String>("combo", dataList));

		Form<Void> form = new Form<Void>("form");
		form.add(combo);
		form.add(new DropDownTextField<String>("combo2", inputValue2Model, dataList));
		add(form);

		add(new Label("inputValue", inputValueModel));
		add(new Label("inputValue2", inputValue2Model));
	}
}
