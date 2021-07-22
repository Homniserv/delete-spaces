package myPack;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** spaced name to regular spacefree name */
public class Main implements MainI {
	public static void main(String[] args) throws IOException {
		Main main = new Main();
		String res = main.findSpacedFile();
		System.out.println(res);
	}

	@Override
	public String findSpacedFile() throws IOException {
		/**
		 * https://stackoverflow.com/questions/15598657/how-to-use-ls-c-command-in-java/15598781
		 */
		// Path dir = Paths.get("/path/to/directory");
		Path dir = Paths.get(".");

		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.c")) {
			for (Path file : stream) {
				// Do stuff with file
				System.out.println(file.toString());
			}
		}
		return "";
	}

	@Override
	public String findSpacedFileByRegex(String regex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String rename(String fromName) {
		String resu = fromName;
		// fromName.trim();

		// resu = fromName;
		return resu.replace(" ", "");
	}

	@Override
	public String touch(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
