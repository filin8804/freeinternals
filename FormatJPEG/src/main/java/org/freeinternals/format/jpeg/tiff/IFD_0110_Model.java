/*
 * IFD_0110_Model.java    Sep 13, 2010, 23:16
 *
 * Copyright 2010, FreeInternals.org. All rights reserved.
 * Use is subject to license terms.
 */
package org.freeinternals.format.jpeg.tiff;

import java.io.IOException;
import javax.swing.tree.DefaultMutableTreeNode;
import org.freeinternals.commonlib.core.PosDataInputStream;
import org.freeinternals.commonlib.ui.JTreeNodeFileComponent;
import org.freeinternals.commonlib.ui.UITool;
import org.freeinternals.commonlib.core.FileFormatException;

/**
 *
 * @author Amos Shi
 * @see IFD_010F_Make
 * @see IFD_0131_Software
 */
public class IFD_0110_Model extends IFD_ASCII {

    public IFD_0110_Model(final PosDataInputStream pDIS, int byteOrder, int tag, int startPosTiff, byte[] byteArrayTiff)
            throws IOException, FileFormatException {
        super(pDIS, byteOrder, tag, startPosTiff, byteArrayTiff);
    }

    @Override
    public void generateTreeNode(DefaultMutableTreeNode parentNode) {
        int pos = super.startPos;
        super.generateTreeNode(parentNode, pos);

        JTreeNodeFileComponent comp;

        if (this.isValue()) {
            comp = new JTreeNodeFileComponent(
                    pos + 8,
                    4,
                    String.format("Model: %s", this.value));
            comp.setDescription(IFDMessage.getString(IFDMessage.KEY_IFD_0110_Description));
            parentNode.add(new DefaultMutableTreeNode(comp));
        } else {
            comp = new JTreeNodeFileComponent(
                    pos + 8,
                    4,
                    String.format(ShortText.getString(ShortText.KEY_Offset_n), super.ifd_value_offset));
            comp.setDescription(IFDMessage.getString(IFDMessage.KEY_IFD_Offset));
            parentNode.add(new DefaultMutableTreeNode(comp));

            comp = new JTreeNodeFileComponent(
                    super.tiff_StartPos + super.ifd_value_offset,
                    super.data_size,
                    String.format("Model: %s", this.value),
                    UITool.getShortcutIcon(), null);
            comp.setDescription(IFDMessage.getString(IFDMessage.KEY_IFD_0110_Description));
            parentNode.add(new DefaultMutableTreeNode(comp));
        }
    }
}
