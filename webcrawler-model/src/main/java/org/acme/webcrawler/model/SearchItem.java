/**
 *	A SearchItem contains:
 *		- the page to be crawled
 *		- the depth of the searching - number of levels to be crawled
 *		- the maximum number of pages looked for on one single level
 *	One or more SearchItems is/are passed to the worker. 
 */

package org.acme.webcrawler.model;

public class SearchItem {
	
	//the page to be crawled
	private WebPage startPage;

	//the depth of the searching - number of levels to be crawled
	private int 	depth;
	
	//the maximum number of pages looked for on one single level
	private int 	breadth;
	
	public SearchItem() {
		
	}
	
	public WebPage getStartPage() {
		return startPage;
	}

	public void setStartPage(WebPage startPage) {
		this.startPage = startPage;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

}
