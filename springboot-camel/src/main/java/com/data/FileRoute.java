package com.data;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileRoute extends RouteBuilder {
	String inputDirectoryPath = "C://inputFolder";
	String command = "noop=true";
	String wildCard = "?";
	String outputDirectoryPath = "C://outputFolder";

	String fileEndPoint = String.format("file:" + inputDirectoryPath + wildCard + command, 0);
	String outputEndPoint = String.format("file:" + outputDirectoryPath, 0);

	@Override
	public void configure() throws Exception {

		from(fileEndPoint).to(outputEndPoint);
	}
}
