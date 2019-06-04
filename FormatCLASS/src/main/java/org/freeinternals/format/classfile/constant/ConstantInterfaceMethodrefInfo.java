/*
 * ConstantInterfaceMethodrefInfo.java    4:35 AM, August 5, 2007
 *
 * Copyright  2007, FreeInternals.org. All rights reserved.
 * Use is subject to license terms.
 */
package org.freeinternals.format.classfile.constant;

import java.io.IOException;
import org.freeinternals.commonlib.core.PosDataInputStream;
import org.freeinternals.format.classfile.ClassFile;
import org.freeinternals.format.classfile.JavaSEVersion;

/**
 * The class for the {@code CONSTANT_InterfaceMethodref_info} structure in
 * constant pool. The {@code CONSTANT_InterfaceMethodref_info} structure has the
 * following format:
 *
 * <pre>
 *    CONSTANT_InterfaceMethodref_info {
 *        u1 tag;
 * 
 *        u2 class_index;
 *        u2 name_and_type_index;
 *    }
 * </pre>
 *
 * @author Amos Shi
 * @see
 * <a href="https://docs.oracle.com/javase/specs/jvms/se12/html/jvms-4.html#jvms-4.4.2">
 * VM Spec: The CONSTANT_InterfaceMethodref_info Structure
 * </a>
 */
public class ConstantInterfaceMethodrefInfo extends ConstantRefInfo {

    ConstantInterfaceMethodrefInfo(final PosDataInputStream posDataInputStream) throws IOException {
        super(CPInfo.ConstantType.CONSTANT_InterfaceMethodref.tag, posDataInputStream, ConstantType.CONSTANT_InterfaceMethodref.name(), ClassFile.Version.Format_45_3, JavaSEVersion.Version_1_0_2);
    }
}