/*******************************************************************************
 * Copyright (C) 2021, 1C-Soft LLC and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     1C-Soft LLC - initial API and implementation
 *******************************************************************************/
package com.e1c.v8codestyle.right.check;

import com._1c.g5.v8.dt.core.platform.IBmModelManager;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.rights.model.util.RightName;
import com.google.inject.Inject;

/**
 * Checks that role has forbidden right: {@code INTERACTIVE_SET_DELETION_MARK_PREDEFINED_DATA} for any objects.
 *
 * @author Dmitriy Marmyshev
 *
 */
public class RightInteractiveSetDeletionMarkPredefinedData
    extends RoleRightSetCheck
{

    private static final String CHECK_ID = "right-interactive-set-deletion-mark-predefined-data"; //$NON-NLS-1$

    @Inject
    public RightInteractiveSetDeletionMarkPredefinedData(IV8ProjectManager v8ProjectManager,
        IBmModelManager bmModelManager)
    {
        super(v8ProjectManager, bmModelManager);
    }

    @Override
    public String getCheckId()
    {
        return CHECK_ID;
    }

    @Override
    protected void configureCheck(CheckConfigurer builder)
    {
        super.configureCheck(builder);
        builder.title(Messages.RightInteractiveSetDeletionMarkPredefinedData_title)
            .description(Messages.RightInteractiveSetDeletionMarkPredefinedData_description);
    }

    @Override
    protected RightName getRightName()
    {
        return RightName.INTERACTIVE_SET_DELETION_MARK_PREDEFINED_DATA;
    }

}
