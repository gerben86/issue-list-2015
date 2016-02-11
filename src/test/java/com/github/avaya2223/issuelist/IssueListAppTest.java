package com.github.avaya2223.issuelist;

import org.junit.Test;

public class IssueListAppTest {

	@Test
	public void main() throws Exception {
		String filePath = "src/test/resources/issuelist.csv";
		IssueListApp.main(new String[]{filePath});
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void mainNonExistingFile() throws Exception {
		String filePath = "src/test/resources/issuelistNonExisting.csv";
		IssueListApp.main(new String[]{filePath});
	}
	
	//filePath is geen file (maar een map)
	@Test(expected=IllegalArgumentException.class)
	public void mainNotFile() throws Exception {
		String filePath = "src/test/resources";
		IssueListApp.main(new String[]{filePath});
	}
	
}
