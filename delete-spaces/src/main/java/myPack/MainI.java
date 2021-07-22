package myPack;

import java.io.IOException;

public interface MainI {
	/**
	 * suppose just 1 present eventually recursive
	 */
	public String findSpacedFile() throws IOException;

	/** ex: "startOfFile*" */
	public String findSpacedFileByRegex(String regex);

	public String rename(String fromName);

	/** create a file with rhat name */
	public String touch(String name);
}
