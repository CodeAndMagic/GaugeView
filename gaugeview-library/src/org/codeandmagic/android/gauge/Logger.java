/*******************************************************************************
 * Copyright (c) 2012 Evelina Vrabie
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.codeandmagic.android.gauge;

import org.apache.log4j.Level;

import de.mindpipe.android.logging.log4j.LogConfigurator;

public class Logger {

	static {
		final LogConfigurator config = new LogConfigurator();
		config.setUseLogCatAppender(true);
		config.setUseFileAppender(false);
		config.setLogCatPattern("[%t] [%C{1}.%M] %m%n");
		config.setRootLevel(Level.DEBUG);
		config.setLevel("org.apache", Level.ERROR);
		config.configure();
	}

	public static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger("GaugeView");
}
