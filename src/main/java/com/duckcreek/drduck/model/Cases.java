package com.duckcreek.drduck.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cases {
	private String subject;
	private String resolution;
	
	public Cases(String subject, String resolution) {
        this.subject = subject;
        this.resolution = resolution;
    }
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the resolution
	 */
	public String getResolution() {
		return resolution;
	}
	/**
	 * @param resolution the resolution to set
	 */
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
    

}
