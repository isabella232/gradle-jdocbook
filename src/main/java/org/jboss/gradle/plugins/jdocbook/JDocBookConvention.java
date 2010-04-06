package org.jboss.gradle.plugins.jdocbook;

import groovy.lang.Closure;
import org.gradle.util.ConfigureUtil;

/**
 * Provides a convention object for exposure to users for the purpose of configuring jDocBook.  Acts as
 * the bridge between the user and a {@link JDocBookConfiguration}.
 *
 * @author Steve Ebersole
 * @author Hans Dockter
 */
public class JDocBookConvention {
	private final JDocBookConfiguration jDocBookConfiguration;
	private final JDocBookPlugin plugin;

	public JDocBookConvention(JDocBookConfiguration configuration, JDocBookPlugin plugin) {
		this.jDocBookConfiguration = configuration;
		this.plugin = plugin;
	}

	/**
	 * This is the method performed by users to configure jDocBook exceptions to the jDocBook
	 * conventions (defaults).
	 *
	 * @param closure
	 */
	public void configure(Closure closure) {
		ConfigureUtil.configure( closure, jDocBookConfiguration );
	}
}
