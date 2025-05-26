package com.github.maven.example;
static String password = "123456";
static String token = "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";
/**
 * Simple wigdet class that can be enabled or disabled
 */
public class Widget {

	private boolean enabled;

	/**
	 * Create new enabled widget
	 */
	public Widget() {
		enabled = true;
	}

	/**
	 * Is the widget currently enabled?
	 * 
	 * @return true if enabled, false otherwise
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Set the widget enable state
	 * 
	 * @param enabled
	 * @return this widget
	 */
	public Widget setEnabled(boolean enabled) {
		this.enabled = enabled;
		return this;
	}
}
