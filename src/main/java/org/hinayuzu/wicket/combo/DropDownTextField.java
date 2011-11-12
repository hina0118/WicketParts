package org.hinayuzu.wicket.combo;

import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.IModel;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: chaame
 * Date: 11/11/12
 * Time: 17:25
 * To change this template use File | Settings | File Templates.
 */
public class DropDownTextField<T> extends TextField<T> {
	public DropDownTextField(String id, List<T> choices) {
		super(id);
		add(new DropDownTextBehavior<T>(id, choices));
	}

	public DropDownTextField(String id, Class<T> type, List<T> choices) {
		super(id, type);
		add(new DropDownTextBehavior<T>(id, choices));
	}

	public DropDownTextField(String id, IModel<T> iModel, List<T> choices) {
		super(id, iModel);
		add(new DropDownTextBehavior<T>(id, choices));
	}

	public DropDownTextField(String id, IModel<T> iModel, Class<T> type, List<T> choices) {
		super(id, iModel, type);
		add(new DropDownTextBehavior<T>(id, choices));
	}
}
