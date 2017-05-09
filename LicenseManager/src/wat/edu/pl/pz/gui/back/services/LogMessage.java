package wat.edu.pl.pz.gui.back.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import wat.edu.pl.pz.gui.front.frames.ErrorPopup;

public class LogMessage {


	static LogMessage container;
	public static LogMessage getInstance() {
		if (container == null) container = new LogMessage();
		return container;
	}
	
	public void logMessage(String message) {
		try {
			DateFormat dateFormat = new SimpleDateFormat(
					"yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			File logMassageFile = new File("logMessage.txt");
			if (logMassageFile.exists()) {
				FileWriter fileWrite = new FileWriter(logMassageFile, true);
				fileWrite.write(dateFormat.format(date) + ": "
						+ logMassageFile + "\n");
				fileWrite.close();
			} else {
				logMassageFile.createNewFile();
			}
		} catch (IOException e) {
			new ErrorPopup("B³¹d zapisu logi do pliku");
		}
	}
}

	
