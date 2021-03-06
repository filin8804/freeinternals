/*
 * JTreeNodeZipFile.java    April 04, 2009, 00:39 AM
 * 
 * Copyright 2009, FreeInternals.org. All rights reserved.
 * Use is subject to license terms.
 */
package org.freeinternals.javaclassviewer;

import java.util.zip.ZipEntry;

/**
 * Tree node for a zip entry in the tree {@link JTreeZipFile}.
 *
 * @author Amos Shi
 * @see JTreeZipFile
 */
public class JTreeNodeZipFile {

    private final String s;
    private final ZipEntry ze;

    /**
     * Create a tree node for {@link JTreeZipFile}.
     *
     * @param s Tree node string.
     * @param ze {@code ZipEntry} of the {@code jar} file of {@code JTreeZipFile}.
     */
    public JTreeNodeZipFile(final String s, final ZipEntry ze) {
        this.s = s;
        this.ze = ze;
    }

    /**
     * Get the lable text of the tree node.
     *
     * @return Lable of tree node
     */
    @Override
    public String toString() {
        return this.s;
    }

    /**
     * Get the user object of the node.
     *
     * @return The {@code ZipEntry}
     */
    public ZipEntry getNodeObject() {
        return this.ze;
    }
}
