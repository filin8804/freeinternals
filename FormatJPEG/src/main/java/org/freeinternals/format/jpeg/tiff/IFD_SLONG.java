/*
 * IFD_SLONG.java    Sep 09, 2010, 12:49
 *
 * Copyright 2010, FreeInternals.org. All rights reserved.
 * Use is subject to license terms.
 */
package org.freeinternals.format.jpeg.tiff;

import java.io.IOException;
import org.freeinternals.commonlib.core.PosDataInputStream;
import org.freeinternals.commonlib.core.FileFormatException;

/**
 *
 * @author Amos Shi
 */
public class IFD_SLONG extends IFD {

    public IFD_SLONG(final PosDataInputStream pDIS, int byteOrder, int tag, int startPosTiff, byte[] byteArrayTiff) 
            throws IOException, FileFormatException {
        super(pDIS, byteOrder, tag, IFDType.ASCII, startPosTiff, byteArrayTiff);
    }
}
