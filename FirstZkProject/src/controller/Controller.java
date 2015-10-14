package controller;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class Controller extends SelectorComposer<Window> {

	/**
	 * Generated Id.
	 */
	private static final long serialVersionUID = 1L;

	@Wire
	Textbox input;
	@Wire
	Label output;

	@Listen("onClick=#ok")
	public void submit() {
		output.setValue(input.getValue());
	}

	@Listen("onClick=#cancel")
	public void cancel() {
		output.setValue("");
	}

}
