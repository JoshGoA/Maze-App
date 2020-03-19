package app.view.components;

import java.awt.Cursor;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 * Iconified <code>javax.swing.JButton</code>.
 *
 * @see javax.swing.JButton JButton
 */
public class JWButton extends JButton {

    private static final long serialVersionUID = 1L;

    {
        // Iconify JButton
        this.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentAreaFilled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setFocusPainted(false);
    }

    /**
     * Create a new iconified button.
     *
     * @param icon        Icon
     * @param toolTipText String
     */
    public JWButton(final Icon icon, final String toolTipText) {
        super("", icon);
        this.setToolTipText(toolTipText);
    }

}