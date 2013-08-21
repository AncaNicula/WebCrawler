/**
 * Class for modeling the web pages the application will crawl.
 */

package org.acme.webcrawler.model;

import java.util.Date;
import java.util.List;

public class WebPage {

	// Address of the page
	private String url;
	
	// Content of the page
	private String content;
	
	// Last time the page was crawled
	private Date timestamp;

	// The other pages this page points to
	private List<WebPage> links;
	
	public WebPage() {
		
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public List<WebPage> getLinks() {
		return links;
	}

	public void setLinks(List<WebPage> links) {
		this.links = links;
	}
}
