/*
 * MOAClassOptionEditor.java
 * Copyright (C) 2009 University of Waikato, Hamilton, New Zealand
 */

package weka.gui;

import moa.options.ClassOption;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.beans.PropertyEditorSupport;

/**
 * An editor for MOA ClassOption objects.
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision$
 * @see ClassOption
 */
public class MOAClassOptionEditor
  extends PropertyEditorSupport {

	/** the custom editor. */
	protected Component m_CustomEditor;

	/** the component for editing. */

	/**
	 * Returns true since this editor is paintable.
	 *
	 * @return 		always true.
	 */
	public boolean isPaintable() {
		return false;
	}

	/**
	 * Returns true because we do support a custom editor.
	 *
	 * @return 		always true
	 */
	public boolean supportsCustomEditor() {
		return true;
	}

	/**
	 * Closes the dialog.
	 */
	protected void closeDialog() {
		if (m_CustomEditor instanceof Container) {
			Dialog dlg = PropertyDialog.getParentDialog((Container) m_CustomEditor);
			if (dlg != null)
				dlg.setVisible(false);
		}
	}

	/**
	 * Creates the custom editor.
	 *
	 * @return		the editor
	 */

	/**
	 * Gets the custom editor component.
	 *
	 * @return 		the editor
	 */

  /**
   * Paints a representation of the current Object.
   *
   * @param gfx 	the graphics context to use
   * @param box 	the area we are allowed to paint into
   */
  public void paintValue(Graphics gfx, Rectangle box) {
    FontMetrics 	fm;
    int 					vpad;
    String 				val;

    fm   = gfx.getFontMetrics();
    vpad = (box.height - fm.getHeight()) / 2 ;
    val  = ((ClassOption) getValue()).getValueAsCLIString();
    gfx.drawString(val, 2, fm.getHeight() + vpad);
  }
}
