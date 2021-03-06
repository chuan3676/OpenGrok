/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License (the "License").
 * You may not use this file except in compliance with the License.
 *
 * See LICENSE.txt included in this distribution for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at LICENSE.txt.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */

/*
 * Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved.
 */
package org.opensolaris.opengrok.logger.formatter;

import org.opensolaris.opengrok.Info;

public class FileLogFormatter extends LogFormatter {

    private static final String FORMAT = "[#|%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS.%1$tL%1$tz |%4$s|V%12$s|OG|T=%10$s| %9$s.%5$s: %11$s%6$s |#]%n";

    public FileLogFormatter() {
        super(FORMAT, Info.getVersion());
    }
}
