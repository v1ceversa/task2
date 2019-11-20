package by.epam.task2.exception;

@SuppressWarnings("serial")
public class FileException extends RuntimeException {

	public FileException() {
		super();
	}
	
	public FileException(String what) {
		super(what);
	}

	public FileException(String what, Throwable cause) {
		super(what, cause);
	}

	public FileException(Throwable cause) {
		super(cause);
	}

}
