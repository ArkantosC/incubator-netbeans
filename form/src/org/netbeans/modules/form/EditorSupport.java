/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.form;

import java.io.IOException;
import javax.swing.text.Document;
import javax.swing.text.Position;
import org.netbeans.api.editor.guards.GuardedSectionManager;
import org.openide.filesystems.FileObject;
import org.openide.nodes.Node;

/**
 *
 * @author Tomas Pavek
 */
public interface EditorSupport extends Node.Cookie {
    static String SECTION_INIT_COMPONENTS = "initComponents"; // NOI18N
    static String SECTION_VARIABLES = "variables"; // NOI18N

    Document getDocument();
    GuardedSectionManager getGuardedSectionManager();
    void markModified();
    Object getJavaContext();
    void openAt(Position pos);
    void discardEditorUndoableEdits();
    void saveAs(FileObject folder, String fileName) throws IOException;
    void openDesign();
    void openSource();
    void reloadForm();
    boolean isJavaEditorDisplayed();
    Boolean getFoldState(int offset);
    void restoreFoldState(boolean collapsed, int startOffset, int endOffset);
    int getCodeIndentSize();
    boolean getCodeBraceOnNewLine();
    boolean canGenerateNBMnemonicsCode();
}
